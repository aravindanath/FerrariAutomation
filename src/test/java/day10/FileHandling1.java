package day10;

import java.io.*;

public class FileHandling1 {


    public static void main(String arg[]) throws IOException {
        //Releative path
        String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"Test.txt";
        File f = new File(path);
        if(f.exists()){
            System.out.println("File exist!");
        }else{
            f.createNewFile();
            System.out.println("File sucessfully created!");
        }
        //converting String path type to writer path type
        Writer w = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(w);
        bw.write(" Hello all happy learning");
        bw.newLine();
        for(int i=1;i<=50;i++){
            bw.write(i+".Go Corona");
            bw.newLine();
        }

        bw.flush();
        bw.close();


        Reader r = new FileReader(path);
        BufferedReader br = new BufferedReader(r);

        String x ="";
        while ((x = br.readLine())!=null){
            System.out.println(x);
        }

        br.close();

    }

}
