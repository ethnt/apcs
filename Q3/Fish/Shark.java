public class Shark extends Fish
{
   
    /**
     * Constructor for objects of class Fish
     */
    public Shark()
    {
super();
    }
    //methods
    
    public void eat(Fish victim)
    {
         victim.die();
    }
}