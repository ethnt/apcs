import java.util.Random;

/**
 * A representation of a Person.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */

public class Person implements Talkative {
    
    /*
     * Instance variables.
     */
    private String name;
    private String surname;
    private int age;
    private boolean female;
    private String birthday;
    private double height;
    private double weight;
    private double iq;
    
    private Person mother;
    private Person father;
    private Person newborn;
    
    
    /*
     * Constructors
     */
    
    /**
     * Default constructor. Teenager.
     */
    public Person() {
        Random rndm = new Random();
        
        name = "Jack";
        surname = "Doe";
        age = 16;
        birthday = "9 July 1995";
        height = 5.8;
        weight = 140.0;
        iq = 100.0;
        female = rndm.nextBoolean();
    }
    
    /**
     * Constructor with all variables as parameter.
     */
    public Person(String inName, String inSurname, int inAge, boolean inFemale, String inBirthday, double inHeight, double inWeight, double inIQ) {
        name = inName;
        surname = inSurname;
        age = inAge;
        female = inFemale;
        birthday = inBirthday;
        height = inHeight;
        weight = inWeight;
        iq = inIQ;
    }
    
    /**
     * Constructor for newborn.
     */
    public Person(String inName, String inSurname, String inBirthday, double inHeight, double inWeight, double inIQ) {
        Random rndm = new Random();
        
        name = inName;
        surname = inSurname;
        age = 0;
        female = rndm.nextBoolean();
        birthday = inBirthday;
        height = inHeight;
        weight = inWeight;
        iq = inIQ;
    }
    
    
    /*
     * Methods
     */
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getIQ() {
        return iq;
    }
    
    public boolean isFemale() {
        return female;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void age() {
        age += age;
        System.out.println("Age is now " + age + ".");
    }
    
    public void setIQ(double newIQ) {
        iq = newIQ;
        System.out.println("IQ is now " + iq + ".");
    }
    
    public Person reproduce(Person partner, String childName, String childBirthday) {
        if (this.female != partner.female) {
            if (this.female == true) {
                Person child = new Person(childName, partner.getSurname(), childBirthday, 1.75, 9.0, this.getIQ());
                
                newborn = child;
            }
            
            else {
                Person child = new Person(childName, this.getSurname(), childBirthday, 1.75, 9.0, partner.getIQ());
                
                newborn = child;
            }
        }
        
        else {
            newborn = null;
            
            System.out.println("It doesn't work that way...");
        }
        
        return newborn;
    }
    
    public void getInfo() {
        System.out.println(name + " " + surname + "is " + age + " years old (born " + birthday + "). Female is " + female + ". " + height + " feet and " + weight + " pounds.");
    }
    
    public String speak() {
        return "Why hello, good sir.";
    }
}
