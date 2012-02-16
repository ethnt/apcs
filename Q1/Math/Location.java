
/**
 * A coordinate on a Map.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */

public class Location {
    
    /*
     * Instance variables.
     */
    
    public double x;
    public double y;
    
    
    /*
     * Constructors
     */
    
    /**
     * Default with 0.0 for both X- and Y-coordinates.
     */
    public Location() {
        x = 0.0;
        y = 0.0;
    }

    /**
     * Use your own coordinates.
     */
    public Location(double latitude, double longitude) {
        x = latitude;
        y = longitude;
    }
    
    
    /*
     * Methods
     */
    
    /**
     * Distance from this point to another point.
     * 
     * @param  destination  Other point.
     * @return              A double with the distance.
     */
    public double distance(Location destination) {
        double xDiff = destination.x - this.x;
        xDiff = Math.pow(xDiff, 2.0);
        
        double yDiff = destination.y - this.y;
        yDiff = Math.pow(yDiff, 2.0);
        
        double diff = xDiff + yDiff;
        
        return Math.sqrt(diff);
    }
    
    /**
     * Checks if another point and this point are in the same place.
     * 
     * @param other  Another point.
     * @return              True or false.
     */
    public boolean equal(Location other) {
        if (other.x - this.x < 0.000001 && other.y - this.y < 0.000001) {
            return true;
        }
        
        else {
            return false;
        }
    }
}
