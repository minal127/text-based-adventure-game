package adventurereal;

import java.util.ArrayList;
import java.util.Random;

public class Room {
    static ArrayList<Room> roomnames =  new ArrayList<>();
    ArrayList<Item> items =  new ArrayList<>();
    String name;
    String description;


    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public static Room chooseRandomRoom() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(roomnames.size());

        Room randomRoom = roomnames.get(randomIndex);
        roomnames.remove(randomRoom);
        System.out.println(roomnames);
        return randomRoom;
    }

    public static void generateRooms() {
        roomnames.add(new Room("Living Room", "This room contains a tv and a remote......"));
        roomnames.add(new Room("Kitchen", "there are women in it, as always"));
        roomnames.add(new Room("Main Room", "this is the main room"));
        roomnames.add(new Room("Bathroom", "there is piss on the floor"));
    }

    public void generateItems() {
        items.add(new Item("TV Remote", "Black", "Change Channels"));
        items.add(new Item("Dog", "Brown", "Animal"));
        items.add(new Item("Car Keys", "Black", "Car Keys"));
    }
}
