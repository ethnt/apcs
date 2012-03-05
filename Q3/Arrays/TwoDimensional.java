
/**
 * Two Dimensional Arrays
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Multiple choice:
 * 29. B
 * 30. C
 * 31. D
 * 32. A
 */
public class TwoDimensional {
    public static void main(String[] args) {
        /*
         * # 1
         */
        int[][] fiveBySeven = new int[5][7];
        for (int r = 0; r < fiveBySeven.length; r++) {
            for (int c = 0; c < fiveBySeven[r].length; c++) {
                fiveBySeven[r][c] = 3;
            }
        }
        
        /*
         * # 2
         */
        String[][] threeByFour = {{ "a", "b", "c", "d" },
                                  { "e", "f", "g", "h" },
                                  { "i", "j", "k", "l" },
                                  { "m", "n", "o", "p" }};
        for (int r = 0; r < threeByFour.length; r++) {
            for (int c = 0; c < threeByFour[r].length; c++) {
                System.out.println("[" + r + "][" + c + "] : " + threeByFour[r][c]);
            }
        }
        
        System.out.println("=================================================");
        
        /*
         * # 3
         */
        for (int c = 0; c < threeByFour[0].length; c++) {
            for (int r = 0; r < threeByFour.length; r++) {
                System.out.println("[" + r + "][" + c + "] : " + threeByFour[r][c]);
            }
        }
        
        System.out.println("=================================================");
        
        /*
         * # 4
         */
        int[][] tenByTen = new int[10][10];
        
        int counter = 0;
        for (int r = 0; r < tenByTen.length; r++) {
            for (int c = 0; c < tenByTen[r].length; c++) {
                tenByTen[r][c] = counter;
                counter++;
            }
        }
        for (int i = 0; i < tenByTen[0].length; i++) {
            System.out.println(tenByTen[i][i]);
        }
    }
}
