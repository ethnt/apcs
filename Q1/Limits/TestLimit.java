public class TestLimit {
    
    public static void main(String[] args) {
        int value = 1;
        
        for (int i = 0; i < 999999; i++) {
            System.out.println("10 to the " + i + " = " + value);
            value = value * 2;
        }
    }
}