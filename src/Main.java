import java.io.IOException;
import java.util.Scanner;
import lib.House;
import lib.GeneralMethods;
import lib.HouseCommands;

public class Main extends GeneralMethods implements HouseCommands {
    String[] first_menu_options={"1.house status","2.house commands","0.exit"};
    String[] commands_options={"1.turn on","2.turn off"};
    String[] ending_options={"1.back to first menu ","2.back to the last menu"};
    String successMessage="your command was executed successfully";
    String failMessage="your command was not executed successfully,please try again";


    public  static void main(String[] args) throws IOException {
        Main Mobj= new Main();
        House.livingRoom HLRobj=new House.livingRoom();
        House.bedRoom HBRobj=new House.bedRoom();
        String[] status= House.status(HLRobj,HBRobj);
        String description=read_txt("./strings/description.txt");
        System.out.print(description);
        for (String s : Mobj.first_menu_options){
            System.out.println(s);
        };
        int command =inputF();
        System.out.print("enter your chose (command number):");
        while (command != 0){
            switch (command) {
                case 1 -> {
                    System.out.println("\n----------STATUS----------");
                    for (String s : status) {
                        System.out.println(s);
                    }
                    System.out.println("\n\n\n-----------------------");
                    for (String s : Mobj.first_menu_options){
                        System.out.println(s);
                    };

                }
                case 2 -> {
                    System.out.println("\n----------COMMANDS----------");
                    for (String s : status) {
                        System.out.println(s);
                    }
                }
                default -> System.out.printf("your chose  %s%n is not in the list of chooses .try another one", command);
            }

            command=inputF();

        }


    }


    @Override
    public void turn_on(String target) {

    }

    @Override
    public void turn_off(String target) {

    }

}
