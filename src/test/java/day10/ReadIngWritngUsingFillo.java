package day10;

import java.io.File;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadIngWritngUsingFillo {

	public static void main(String[] args) throws FilloException {
		String path = System.getProperty("user.dir") + File.separator + "testData" + File.separator
				+ "SampleExcel.xlsx";

		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(path);
		String strQuery = "Select * from login";
		Recordset recordset = connection.executeQuery(strQuery);

		while (recordset.next()) {
			System.out.println(recordset.getField("username"));
		}

		recordset.close();
		connection.close();

	}

}
