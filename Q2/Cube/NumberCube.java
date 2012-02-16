import java.util.Random;

/**
 * Write a description of class NumberCube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberCube {
    // instance variables - replace the example below with your own
    private int sides;
    private Random rndm;

    /**
     * Constructor for objects of class NumberCube
     */
    public NumberCube() {
        sides = 6;
        rndm = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int toss() {
        return rndm.nextInt(sides) + 1;
    }
}
