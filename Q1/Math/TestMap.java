/**
 * Testing the Map class.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */

public class TestMap {
    
    /**
     * The main method. Use for testing.
     * 
     * @return void
     */
    public static void main(String[] args) {
        Map atlantis = new Map();
        System.out.println(atlantis.getLargestDistance());
        System.out.println(atlantis.getPerimeter());
        System.out.println(atlantis.getArea());
        System.out.println(atlantis.calcBoundingCircleDiameter());
        System.out.println(atlantis.calcBoundingCircleArea());
        
        
        /*
         * New York City
         */
        Location statue = new Location(100.0, 302.23);
        Location empire = new Location(32.0, 42.0);
        Location rockefeller = new Location(23.0, 522.0);
        
        Map nyc = new Map("NYC", statue, empire, rockefeller);
        
        System.out.println(nyc.getLargestDistance());
        System.out.println(nyc.getPerimeter());
        System.out.println(nyc.getArea());
        System.out.println(nyc.calcBoundingCircleDiameter());
        System.out.println(nyc.calcBoundingCircleArea());
        
    }
    
}
