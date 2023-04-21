package sg.nus.iss;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args){
        String homepath = System.getProperty("user.home");
        String desktopPath = homepath + "/Desktop/";

        String fileName = "input.txt";

        File file = new File(desktopPath+fileName);

        try{
            if(file.createNewFile()){
                System.out.println("File created!!!!");
            }else{
                System.out.println("File is already existing");
            }

        }catch(IOException e){

            e.printStackTrace();
        }


    }
    
}
