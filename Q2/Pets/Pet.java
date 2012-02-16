
/**
 * This class represents a Pet hieracrchy.
 * 
 * @author (Tim Barron) 
 * @version (1.0)
 */
public class Pet implements Talkative {
    private String name;
    
    public Pet(String myName) {
        name = myName;
    }
    
    public String getName() {
        return name;
    }
    
    public String speak() {
        return "blah";
    }
}
