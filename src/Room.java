package adventurereal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Room {
    ArrayList<String> roomnames =  new ArrayList<>(Arrays.asList("Living Room", "Kitchen", "Main Room", "Bathroom"));
    ArrayList<Item> items =  new ArrayList<>();

    public String generateRandomRoom() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(roomnames.size());

        String choice = roomnames.get(randomIndex);
        roomnames.remove(choice);
        System.out.println(roomnames);
        return choice;

    }

    public void generateItems() {
        items.add(new Item("TV Remote", "Black", "Change Channels"));
        items.add(new Item("Dog", "Brown", "Animal"));
        items.add(new Item("Car Keys", "Black", "Car Keys"));
    }
}
