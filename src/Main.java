package adventurereal;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the text based adventure game");

        Room room = new Room();

        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        Person person = new Person(name);
        System.out.println(person.toString());

        System.out.println(name + " you are in: " + room.generateRandomRoom());


        while (true) {ask(room);}

    }

    public static void ask(Room room) {
        System.out.println("Type what you would like to do");
        String ask = keyboard.nextLine();
        if (ask.equals("LOOK")) {
            System.out.println("this room is...............");
        }
        else if (ask.startsWith("LOOK ")) {
            System.out.println("this object is...............");
        }
        else if (ask.equals("MOVE")) {
            System.out.println("moving...............");
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