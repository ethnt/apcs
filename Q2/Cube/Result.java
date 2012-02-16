
/**
 * Write a description of class Result here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Result {
    
    public static int[] getCubeTosses(NumberCube cube, int tosses) {
        int[] results = new int[tosses];
        
        for (int i = 0; i < tosses; i++) {
            results[i] = cube.toss();
        }
        
        return results;
    }
    
    public static int getLongestRun(int[] values) {
        int result = -1;
        int length = 0;
        int longestLength = 0;
        int longestIndex = -1;
        
        for (int i = 0; i < values.length; i++) {
            if (values[i] == values[i + 1] && values[i++] < values.length) {
                length++;
                result = i - length + 1;
                
                longestLength = length;
                longestIndex = result;
            }
            
            else {
                length = 0;
                result = -1;
            }
        }
        
        return longestIndex;
    }
    
}
