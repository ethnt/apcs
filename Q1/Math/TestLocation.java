/**
 * Testing the Location class.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */

public class TestLocation {
    
    /**
     * The main method. Use for testing. Output should be true, 180.27756377319946, and 180.27756377319946.
     * 
     * @return void
     */
    public static void main(String[] args) {
        Location p1 = new Location();
        Location p2 = new Location(100.0, 150.0);
        Location p3 = new Location();
        
        System.out.println(p1.equal(p3));
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p3));
    }
    
}
