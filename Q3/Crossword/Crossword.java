import java.util.*;

/**
 * An implementation of Crosswords with two-dimensional arrays. See http://coo.ly/btsQ for information.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */
public class Crossword {
    private int[][] grid;
    private List<Integer> horizontalWordSize;  
    private List<Integer> verticalWordSize;
    
    public Crossword() {
        /* code not shown, added for work */
        int[][] theGrid = {{ 0, 0, 0, -1, -1, 0 },
                { -1, 0, -1, 0, 0, 0 },
                { 0, 0, 0, 0, -1, -1 },
                { -1, 0, -1, 0, -1, 0 },
                { -1, 0, -1, 0, 0, 0 }};
        
        grid = theGrid;
        createWordSizeLists();
    }
    
    /*
     * Part A. Detects if location is a start of a horizontal word.
     */
    public boolean horStart(int row, int col) {
        boolean result = true;
        
        if (row == 0)
            result = false;
        else if (grid[row][col - 1] == -1)
            result = false;
        else if (row == grid[row].length)
            result = false;
        else if (grid[row][col + 1] == 0)
            result = false;
        else
            result = true;
        
        return result;
    }
    
    public boolean vertStart(int row, int col) {
        /* code not shown */
        
        return true;
    }
    
    /*
     * Part B
     */
    public void placeNumbers() {
        int counter = 1;
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (horStart(r, c) ^ vertStart(r, c)) {
                    grid[r][c] = counter;
                    counter++;
                }
            }
        }
    }
    
    /*
     * Part C
     */
    public void createWordSizeLists() {
        horizontalWordSize = new ArrayList<Integer>();
        verticalWordSize = new ArrayList<Integer>();
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (horStart(r, c)) {
                    int length = 0;
                    
                    for (int w = c; w < grid[r].length; w++) {
                        if (grid[r][w] >= 0) {
                            length++;
                        } else {
                            break;
                        }
                        
                        if (length > 0) {
                            length++; // Add the start to the length.
                        }
                    }
                    
                    horizontalWordSize.add(length);
                }
            }
        }
        
        for (int c = 0; c < grid[0].length; c++) {
            for (int r = 0; r < grid.length; r++) {
                if (vertStart(r, c)) {
                    int length = 0;
                    
                    for (int w = r; w < grid[c].length; w++) {
                        if (grid[w][c] >= 0) {
                            length++;
                        } else {
                            break;
                        }
                        
                        if (length > 0) {
                            length++;
                        }
                    }
                    
                    verticalWordSize.add(length);
                }
            }
        }
    }
}