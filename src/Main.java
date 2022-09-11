import java.io.IOException;
import java.util.Objects;

import lib.House;

import lib.GeneralMethods;
import lib.HouseCommands;

public class Main extends GeneralMethods  {
    String[] first_menu_options={"1.house status","2.house commands","0.exit"};
    String[] commands_options={"1.turn on","2.turn off"};
    String[] rooms={"1.living room ","2. bed room"};
    String[] parts={"1.door ","2.window","3.light"};
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
        while (command != 0){
            switch (command) {
                case 1 -> {
                    System.out.println("\n----------STATUS----------");
                    for (String s : status) {
                        System.out.println(s);
                    }
                    System.out.println("\n\n\n----------MENU----------");
                    for (String s : Mobj.first_menu_options){
                        System.out.println(s);
                    }

                }
                case 2 -> {

                    System.out.println("\n----------ROOMS----------");

                    for (String s : Mobj.rooms) {
                        System.out.println(s);
                    }
                    int rooms_options=inputF();

                    System.out.println("\n----------PARTS----------");

                    for (String s : Mobj.parts) {
                        System.out.println(s);
                    }
                    int parts_options=inputF();
                    System.out.println("\n----------COMMAND----------");
                    for (String s : Mobj.commands_options) {
                        System.out.println(s);
                    }
                    int command_option=inputF();
                    House.room_command(rooms_options,parts_options, command_option == 1,HLRobj,HBRobj);








                }
                default -> System.out.printf("your chose  %s%n is not in the list of chooses .try another one", command);
            }

            command=inputF();

        }


    }




}
