package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class Genric {

	public static void setVal(String key, String value, String fileName) {
		String path = System.getProperty("user.dir") + File.separator + "testData" + File.separator + fileName
				+ ".properties";
		try {
			File file = new File(path);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(path);
			Properties prop = new Properties();
			prop.setProperty(key, value);
			prop.store(fos, "Test Data");
			System.out.println("Data updated to " + fileName + ".poperties file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getVal(String key, String fileName) throws IOException {
		String value = "";
		String path = System.getProperty("user.dir") + File.separator + "testData" + File.separator + fileName
				+ ".properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public static String getVal(String header, String key, String filename) throws Exception {
		String value = "";
		String path = System.getProperty("user.dir") + File.separator + "testData" + File.separator + filename + ".ini";
		FileInputStream fis = new FileInputStream(path);
		Ini ini = new Ini();
		ini.load(fis);
		value = ini.get(header, key);
		return value;
	}

	public static String getValue(int sheetNo, int row, int col) throws Exception {
		String path = System.getProperty("user.dir") + File.separator + "testData" + File.separator
				+ "SampleExcel.xlsx";
		FileInputStream fos = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fos);
		Sheet sheet = wb.getSheetAt(sheetNo);
		DataFormatter df = new DataFormatter();
		String val = df.formatCellValue(sheet.getRow(row).getCell(col));
		wb.close();
		return val;
	}

}
