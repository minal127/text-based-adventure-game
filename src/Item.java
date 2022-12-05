package adventurereal;

public class Item {
    String itemName;
    String itemColour;
    String itemDescription;

    public Item(String itemName,String itemColour, String itemDescription ) {
        this.itemName = itemName;
        this.itemColour = itemColour;
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "> "+itemName+" <";
    }

}
