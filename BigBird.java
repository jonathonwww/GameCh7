/**
 * This creates a big bird entity 
 * @author Jonathon Webster
 * @version 3/1/18
 */
public class BigBird extends Entity {
    private int distraction;
    
    public BigBird( String name, String description, int xPos, int yPos, int distraction) {
        super(String name, String description, int xPos, int yPos);
        this.distraction = distraction;
    }
    
    public Item dropFood(){
        return 
