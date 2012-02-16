
/**
 * Write a description of class Family here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Family
{
    
    private Person mother;
    private Person father;
    private Person child1;
    private Person child2;
    
    private double height;
    
    public Family() {
        mother = new Person("Jane", "Doe", 28, true, "20 July 1982", 5.5, 120.0, 140.0);
        father = new Person("John", "Doe", 28, false, "20 July 1982", 6.0, 180.0, 120.0);
        
        child1 = father.reproduce(mother, "Ethan", "9 July 1995");
    }
    
    public Family(Person person1, Person person2, Person child) {
        mother = person1;
        father = person2;
        child1 = child;
    }
    
    public void people() {
        System.out.println("Person: " + mother.getName());
        System.out.println("Person: " + father.getName());
        System.out.println("Person: " + child1.getName());
        
        if (child2 != null) {
            System.out.println("Person: " + child2.getName());
        }
    }
    
    public void averages() {
        height = mother.getHeight() + father.getHeight() + child1.getHeight();
        
        if (child2 != null) {
            height = height + child2.getHeight();
            
            height = height/4;
            
            System.out.println("Average height is " + height);
        }
        
        else {
            height = height/3;
            
            System.out.println("Average height is " + height);
        }
       
    }
}
