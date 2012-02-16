import java.util.*;

public class ScrambledWordPuzzle
{
    private String[] scrambledStrings;
    private String[] solvedStrings;

    public ScrambledWordPuzzle() {
        String[] puzzles = { "computation", "randomness", "abstraction", "polymorphism", "structure", "analysis", "inheritance", "thinking" };
        solvedStrings = puzzles;
        
        fillScrambledStrings();
    }

    public String scrambleBy3(String str) {
        StringBuilder builder = new StringBuilder();
        
        int sectors = 0;
        
        if (str.length() % 3 == 0) {
            sectors = str.length() / 3;
        } else {
            StringBuilder temp = new StringBuilder(str);
            
            for (int i = str.length(); i < str.length() + 3; i++) {
                temp.append(" ");
                
                if (temp.toString().length() % 3 == 0) {
                    sectors = str.length() / 3;
                }
            }
        }
        
        for (int i = 0; i < sectors; i++) { // TO-DO: Handle last sector.
            if (i * sectors + 3 < str.length()) {
                builder = builder.insert(0, str.substring(i * sectors, i * sectors + 3));
            }
        }
                
        return builder.toString();
    }
    
    private void fillScrambledStrings() {
        String[] temp = new String[solvedStrings.length];
        
        for (int i = 0; i < solvedStrings.length; i++) {
            temp[i] = scrambleBy3(solvedStrings[i]);
        }
        
        scrambledStrings = temp;
    }
    
    public void printSolved() {
        for (String s : solvedStrings) {
            System.out.println(s);
        }
    }
    
    public void printScrambled() {
        for (String s : scrambledStrings) {
            System.out.println(s);
        }
    }
    
    public boolean guess(String guess, int num) {
        boolean result = false;
        
        if (scrambleBy3(guess).equals(scrambledStrings[num])) {
            result = true;
        }
        
        return result;
    }
}
