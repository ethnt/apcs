/**
 * This class represents a very simplified Fish
 * 
 * @author (Tim Barron) 
 * @version (1.0)
 */
public class Fish {

    private int age;
    private String color;
    private boolean isAlive;
    private String name;

    public Fish() {
        age = 1;
        color = "gray";
        isAlive = true;
        name = "Nemo";
    }
    
    public void swim() {
        System.out.println(name + " is swimming....");
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String c) {
        color = c;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    public void die() {
        isAlive = false;
    }
    
    public boolean isAlive() {
        return isAlive;
     }
}