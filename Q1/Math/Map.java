import java.util.*;

/**
 * A Map containing many Locations.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 * @uses Location
 */

public class Map {
    /*
     * Instance variables.
     */
    
    private String name;
    private Location location1;
    private Location location2;
    private Location location3;
    
    
    /*
     * Constructors.
     */
    
    /**
     * Default constructor.
     */
    public Map() {
        name = "Atlantis";
        location1 = new Location(100.0, 300.0);
        location2 = new Location(42.0, 80.0);
        location3 = new Location(82.32, 12.32);
    }
    
    /**
     * Make your own map. It needs a name and 3 Locations.
     */
    public Map(String mapName, Location p1, Location p2, Location p3) {
        name = mapName;
        location1 = p1;
        location2 = p2;
        location3 = p3;
    }

    
    /*
     * Methods.
     */
    
    /**
     * Checks to see if there is a triangle or not.
     * 
     * @return  True or false.
     */
    private boolean triangle() {
        boolean[] points = {location1.equal(location2), location2.equal(location3), location3.equal(location1)};
        
        for(int i = 0; i < points.length; i++) {
            if(points[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Returns the largest distance between points.
     * 
     * @return  The largest distance between locations.
     */
    public double getLargestDistance() { // This is really hacky!
        double l1l2 = location1.distance(location2);
        double l1l3 = location1.distance(location3);
        double l2l3 = location2.distance(location3);
        
        double[] distances = {l1l2, l1l3, l2l3};
        
        Arrays.sort(distances);
        
        return distances[2];
    }
    
    /**
     * Returns the perimeter of the triangle formed by the three points.
     * 
     * @return  The perimeter.
     */
    public double getPerimeter() {
        double l1l2 = location1.distance(location2);
        double l2l3 = location2.distance(location3);
        double l3l1 = location3.distance(location1);
        
        return l1l2 + l2l3 + l3l1;
    }
    
    /**
     * Returns the area of the triangle formed by the three points.
     * 
     * @return  The area.
     */
    public double getArea() {
        if(triangle()) {
            
            double l1l2 = location1.distance(location2);
            double l2l3 = location2.distance(location3);
            double l3l1 = location3.distance(location1);
            
            double p = getPerimeter() / 2;
            
            double a = p - l1l2;
            double b = p - l2l3;
            double c = p - l3l1;
            
            double abc = a * b * c;
            
            double inner = p * abc;
            
            return Math.sqrt(inner);
            
        }
        
        return 0.0;
    }
    
    /**
     * Returns the diameter of the bounding circle.
     * 
     * @return  The diameter of the circle.
     */
    public double calcBoundingCircleDiameter() {
        if(triangle()) {
            double l1l2 = location1.distance(location2);
            double l2l3 = location2.distance(location3);
            double l3l1 = location3.distance(location1);
            
            double doubleArea = 2.0 * getArea();
            
            return (l1l2 + l2l3 + l3l1) / doubleArea;
        }
        
        return 0.0;
    }
    
    /**
     * Returns the area of the bounding circle.
     * 
     * @return  The area of the circle.
     */
    public double calcBoundingCircleArea() {
        if(triangle()) {
            double a = Math.pow(location1.distance(location2), 2.0);
            double b = Math.pow(location2.distance(location3), 2.0);
            double c = Math.pow(location3.distance(location1), 2.0);
            
            double numerator = a * b * c;
            
            double denominator = Math.pow(16.0 * getArea(), 2.0);
            
            double fraction = numerator / denominator;
            
            return fraction * Math.PI;
        }
        
        return 0.0;
    }
}
