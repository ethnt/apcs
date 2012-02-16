import java.util.*;

/**
 * Just some stuff with Strings.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */

public class StringStuff {
    
    /*
     * Constructors
     */
    public StringStuff() {
    }
    
    /*
     * Methods
     */
    
    public String dateString(String date) {
        date = date.replace("/", ":");
        
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6, 10);
        
        return day + "-" + month + "-" + year;
    }
    
    public String eliminateDashes(String text) {
        return text.trim().replaceAll("-", "");
    }
    
    public String scrollWhich(String text) {
        String first = text.substring(0, 1);
        String finish = text.substring(1, text.length());
        
        return finish + first;
    }
    
    public String middleThird(String one, String two, String three) {
        int oneBegin = one.length() / 3;
        int oneEnd = oneBegin * 2;
        int oneLength = oneEnd - oneBegin;
        String first = one.substring(oneBegin, oneLength);
        
        int twoBegin = two.length() / 3;
        int twoEnd = twoBegin * 2;
        int twoLength = twoEnd - twoBegin;
        String second = two.substring(twoBegin, twoLength);
        
        int threeBegin = three.length() / 3;
        int threeEnd = threeBegin * 2;
        int threeLength = threeEnd - threeBegin;
        String third = three.substring(threeBegin, threeLength);
        
        return first + second + third;
    }
    
    public String convertName(String name) {
        name = name.trim();
        int space = name.indexOf(" ");
        
        String first = name.substring(0, space);
        String last = name.substring(space, name.length());
        
        return last + ", " + first;
    }
    
    public boolean sameChars(String text) {
        String first = text.substring(0, 1);
        
        String[] strArray = text.split(first);
        
        if (strArray.length > 1) {
            return false;
        }
        
        return true;
        
        // It would be *much* better to use an array and looping for this.
    }
    
    public String lastInAlphabeticalOrder(String one, String two, String three) {
        String[] strArray = new String[]{one, two, three};
        
        Arrays.sort(strArray);
        
        return strArray[2];
    }
    
    public String insertThrees(String text) {
        String beginning = text.substring(0, 2);
        String ending = text.substring(2, text.length());
        
        return beginning + "3" + ending;
    }
    
    public int myIndexOf(String text, String findMe) {
        char[] textArray = text.toCharArray();
        
        
    }
}