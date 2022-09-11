package lib;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class GeneralMethods {

    public static void cleanConsole(){
        System.out.print("\b\b\b\b\b");
    };
    public static String read_txt(String filepath) {
        String data = null;
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }


    public static int inputF() throws IOException {
//        request the input while user has not entered 00 ;
        int command ;
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter your chose (command number):");
        command = Integer.parseInt(bfn.readLine());
        System.out.println("-----------------------------");
        return command;
    }
}
