package adventurereal;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    //static String name = keyboard.nextLine();
    static String name;

    public static String returnstring() {
        return "ping ping ping";
    }

    public static void main(String[] args) {

        String number = returnstring();

        System.out.println("Welcome to the text based adventure game");


        System.out.println("Enter your name");
        name = keyboard.nextLine();
        Person person = new Person(name);
        System.out.println(person.toString());
        Room.generateRooms();
        Room randomRoom = Room.chooseRandomRoom();
        System.out.println(name + " you are in: " + randomRoom);

        while (true) {ask(randomRoom);}

    }

    public static void ask(Room room) {
        System.out.println("Type what you would like to do");
        String ask = keyboard.nextLine();

        if (ask.equals("LOOK")) {
            System.out.println(room.description);
        }
        else if (ask.startsWith("LOOK ")) {
            System.out.println("this object is...............");
        }
        else if (ask.equals("MOVE")) {
            room = Room.chooseRandomRoom();
            System.out.println(name + " you are in: " + room);
        }
        else if (ask.equals("TAKE")) {
            System.out.println("taking..............");
            room.generateItems();
            System.out.println(room.items);
            // user gets a list of items
            // user can select number 1, 2, 3
        }
        else if (ask.equals("DROP")) {
            System.out.println("whoops...............");
        }
        else if (ask.equals("OTHER")) {
            System.out.println("other...............");
        }

    }

}