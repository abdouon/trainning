import java.util.Scanner;
import lib.House;
import lib.GeneralMethods;
import lib.HouseCommands;

public class Main extends GeneralMethods implements HouseCommands {
    String[] first_menu_options={"1.house status","2.house commands"};
    String[] commands_options={"1.turn on","2.turn off"};
    String[] ending_options={"1.back to first menu ","2.back to the last menu"};
    String successMessage="your command was executed successfully";
    String failMessage="your command was not executed successfully,please try again";


    public  static void main(String[] args){
//    if the user choose an options you need to delete first menu from the terminal and show up the next one
//    after ending a single command show up the right message and show the ending options


}


    @Override
    public void turn_on(String target) {


    }

    @Override
    public void turn_off(String target) {


    }

}
