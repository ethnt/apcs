/**
 * Lion class by Ethan Turkeltaub.
 */

public class Lion {
    private String name;
    
    public Lion() {
        name = "Harry";
    }
    
    public Lion(String animalName) {
        name = animalName;
    }

    public String getName() {
        return name;
    }
    
    public String makeSound() {
        return "Rawr!";
    }
}
