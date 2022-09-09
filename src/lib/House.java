package lib;

public class House {
    public static class room{

        boolean door=false;
        boolean window=false;
        boolean light=false;

    }
    public static class livingRoom extends room {
//        livingRoom obj=new livingRoom();

    }
    public static class bedRoom extends room{
//        bedRoom obj=new bedRoom();
    }

    public static String[] status (livingRoom lobj,bedRoom bobj){

        String livingRoomDoor;
        String livingRoomWindow;
        String livingRoomLight;
        String bedRoomDoor;
        String bedRoomWindow;
        String bedRoomLight;


        if (!lobj.door){
            livingRoomDoor="living Room door is closed";

        }else{
            livingRoomDoor="living Room door is opened";
        }

        if (!lobj.window){
            livingRoomWindow="living Room window is closed";

        }else{
            livingRoomWindow="living Room window is opened";
        }


        if (!lobj.light){
            livingRoomLight="living Room light is off";

        }else{
            livingRoomLight="living Room window is on";
        }




        if (!bobj.door){
            bedRoomDoor="bed room door is closed";

        }else{
            bedRoomDoor="bed room door is opened";
        }

        if (!bobj.window){
            bedRoomWindow="bed room window is closed";

        }else{
            bedRoomWindow="bed room window is opened";
        }


        if (!bobj.light){
            bedRoomLight="bed room light is off";

        }else{
            bedRoomLight="bed room window is on";
        }

        return new String[]{livingRoomDoor,livingRoomLight,livingRoomWindow,bedRoomDoor,bedRoomWindow,bedRoomLight};
     }





    }

