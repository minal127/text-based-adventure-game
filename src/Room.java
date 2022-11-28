import java.util.Random;

public class Room {
    String[] roomNames = {"Living Room", "Kitchen", "Main Room", "Bathroom"};

    public String generateRandomRoom() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(roomNames.length);
        return roomNames[randomIndex];
    }
}
