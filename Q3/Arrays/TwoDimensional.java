
/**
 * Write a description of class TwoDimensional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        int[][] tenByTen = {{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                            { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
                            { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 },
                            { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 },
                            { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
                            { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 },
                            { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 },
                            { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
                            { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 },
                            { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 }};
        for (int i = 0; i < tenByTen[0].length; i++) {
            System.out.println(tenByTen[i][i]);
        }
    }
}
