import java.util.Arrays;

/**
 * A representation of a Java class.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */

public class Class {
    
    // Instance variables.
    private static int id;
    private static int lastID = 0;
    private String name;
    private int missed;
    private double test1;
    private double test2;
    private double test3;
    private double test4;
    private double average;
    
    // Constructors
    public Class() {
        name = "AP Computer Science";
        missed = 5;
        test1 = 100.0;
        test2 = 24.0;
        test3 = 47.0;
        test4 = 93.0;
    }
    
    public Class(String inName, int inMissed, double in1, double in2, double in3, double in4) {
        name = inName;
        missed = inMissed;
        
        if (test1 > 0.0) { test1 = in1; }
        if (test2 > 0.0) { test1 = in2; }
        if (test3 > 0.0) { test1 = in3; }
        if (test4 > 0.0) { test1 = in4; }
    }
    
    // Methods
    public void setGrades(double in1, double in2, double in3, double in4) {
        test1 = in1;
        test2 = in2;
        test3 = in3;
        test4 = in4;
        
        System.out.println("Graded.");
    }
    
    public int getMissed() {
        return missed;
    }
    
    private double calcSum() {
        double sum = test1 + test2 + test3 + test4;
        
        return sum;
    }
    
    public double calcAverage() {
        average = calcSum() / 4;
        
        this.deduct();
        
        if (average > 0.0) {
            return average;
        }
        
        else {
            return 0.0;
        }
    }
    
    public double getLowest() {
        double[] tests = { test1, test2, test3, test4 };
        
        Arrays.sort(tests);
        
        return tests[0];
    }
    
    public void deduct() {
        int remainder = missed % 5;
        
        if (remainder == 0) {
            double deduction = missed * 2.0;
            
            double newAverage = average * deduction;
            
            if (newAverage >= 0.0) {
                System.out.println("Cannot deduct below 0.");
            }
            
            else {
                average = average * deduction;
                
                System.out.println("Average is now " + calcAverage());
            }
        }
        
        else {
            System.out.println("No deduction.");
        }
    }
    
    public int missedUntilDeduction() {
        int remainder = missed % 5;
        
        return remainder;
    }
    
    public void printReport() {
        System.out.println("======= Report for " + name + " ======");
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.println("Test 4: " + test4);
        System.out.println("Average: " + calcAverage());
    }
}