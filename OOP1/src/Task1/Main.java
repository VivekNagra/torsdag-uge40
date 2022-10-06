package Task1;

import Task2.Building;
import Task2.Room;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Room> newRooms = new ArrayList<>();

    public static void main(String[] args)
    {
        //Task1
        // Create driver and car...
        Driver d1 = new Driver("Vivek", 23 );
        Car c1 = new Car("Audi", "A4","Sedan", 2015);
        Car c2 = new Car("Mercedes", "E-Class", "Sedan", 2022);

        c1.setDriver(d1); // sets the first cars drive to be driver d1

        c2.setDriver(d1); // sets second cars driver to be first driver d1


        System.out.println(c1.toString() );
        System.out.println(d1.toString() );

        System.out.println(c2.toString());
        System.out.println(d1.toString());


        //Task2
        //Instantiated 3 rooms.
        Room r1 = new Room(4,6,8);
        Room r2 = new Room(5,7,9);
        Room r3 = new Room(1,2,3);

        //created a new arraylist (global) of type Room and added the 3 new objects to it.
        newRooms.add(r1);
        newRooms.add(r2);
        newRooms.add(r3);


        Building b1 = new Building(3, 2, true);

        System.out.println(b1.getRooms().get(0).getNumberOfLamps());

        countLampsInBuilding(b1);

        isNormal(b1);

    }
    // wtf is going oooon here, why does it not assign the value to the variable
    //guess for friday is that the arraylist is not saved in the building class and object.
    public static void countLampsInBuilding(Building building)
    {
        for (int i = 0; i < newRooms.size(); i++)
        {
             building.getRooms().

        }
    }

    public static boolean isNormal(Building building)
    {
        if(building.getNumberOfFloors() < newRooms.size())
        {
            System.out.println("there are " + building.getNumberOfFloors()+ " Floors");
            return true;

        } else
        {
            System.out.println("this is a weird Building");
            return false;
        }
    }


}
