
/**
 * This class represents a Pet hieracrchy.
 * 
 * @author (Tim Barron) 
 * @version (1.0)
 */
public abstract class Pet implements Comparable<Pet>, Talkative {
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
    
    public int compareTo(Pet p) {
        return this.getName().compareTo(p.getName());
    }
}
