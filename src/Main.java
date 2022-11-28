import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the text based adventure game");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        Person person = new Person(name);
        System.out.println(person.toString());
        Room room = new Room();
        System.out.println(name + " you are in: " + room.generateRandomRoom());
    }
}