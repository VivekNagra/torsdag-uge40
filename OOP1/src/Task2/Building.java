package Task2;

import java.util.ArrayList;

import static Task1.Main.newRooms;

public class Building
{
    private final ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {

        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    public int getNumberOfBathrooms()
    {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding()
    {
        return isOfficeBuilding;
    }
}
