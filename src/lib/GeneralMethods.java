package lib;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.Scanner;

public class GeneralMethods {

    public static void cleanConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

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

    public static int inputF(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter your chose (command number):");
        int command =input.nextInt();
        input.close();
        cleanConsole();

        return command;

    }

}
