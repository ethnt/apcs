

/**
 * This class represents a Polymorphic Zoo of Pets
 */
public class Zoo {
    private Pet[] animals;

    /**
    * Constructor for objects of class Zoo
    */
    public Zoo(Pet[] pets)
    {
        animals = pets;
    }

    public void makeRuckus()
    {
        for (Pet p : animals) {
            System.out.println(p.speak());
        }
    }

    public void playWith(int one, int two)
    {
        System.out.println(animals[one].getName() + " is hanging out with its friend " + animals[two].getName());
    }
    
    public void roleCall()
    {
        System.out.println("The current guests at the Zoo are:");
        for (Pet p : animals) {
            System.out.println(p.getName());
        }
    }
}
