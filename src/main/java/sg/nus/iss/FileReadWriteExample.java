package sg.nus.iss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadWriteExample {
    public static void main(String[] args){
       InputStream inputStream = null;
       OutputStream outputStream = null;
       String homepath = System.getProperty("user.home");
    String desktopPath = homepath + "/Desktop/";

    String inputFile = "input.txt";
    String outputFile = "output.txt";

    File input = new File(desktopPath+inputFile); 
    File output = new File(desktopPath+outputFile); 

System.out.println("input file path : " +inputFile);



System.out.println("output file path : " +outputFile);

try {
        //creating input and output files start
        if(input.createNewFile()){

            System.out.println("input file created!!!");
        }else{
            System.out.println("input file already existing!!!");
        }

        if(output.createNewFile()){

            System.out.println("output file created!!!");
        }else{
            System.out.println("output file already existing!!!");
        }

        //creating input and output files end

        ///reading from input file and writing to output file start

        inputStream = new FileInputStream(input);
        outputStream = new FileOutputStream(output);

        byte[] buffer = new byte[1024];
        int byteRead;

        while((byteRead = inputStream.read(buffer)) != -1){
            outputStream.write(buffer, 0 , byteRead);
        }
        
    } catch (IOException e) {
       
        e.printStackTrace();
    }finally{
        try {
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
    }
    
}
