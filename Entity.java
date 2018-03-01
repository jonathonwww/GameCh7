import java.util.*;
/**
 * This class gives the information for entities.
 * 
 * @author Jonathon 
 * @version 3/1/18
 */
public abstract class Entity extends NamedThing{
    
    ArrayList<Item> items;
    
    public Entity(String name, String description, int xPos, int yPos) {
        super(name, description, xPos, yPos);
        items = new ArrayList<Item>();
    }
    
    public ArrayList getArrayList() {
        return items;
    }
}
