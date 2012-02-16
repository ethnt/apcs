import java.util.*;

/**
 * Write a description of class Tests here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tests {
    public static void main(String args[]) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account(1000000000000.0);
        Account a4 = new Account();
        Account[] accounts = { a1, a2, a3, a4 };
        
        System.out.println("Unsorted accounts.");
        for (Account a : accounts) {
            a.printSlip();
        }
        
        System.out.println("Sorted accounts.");
        Arrays.sort(accounts);
        for (Account a : accounts) {
            a.printSlip();
        }
        
        Pet p1 = new Dog("Harry");
        Pet p2 = new Dog("Oliver");
        Pet p3 = new Dog("Berkeley");
        Pet[] pets = { p1, p2, p3 };
        
        System.out.println("Unsorted pets.");
        for (Pet p : pets) {
            System.out.println(p.getName());
        }
        
        
        System.out.println("Sorted pets.");
        Arrays.sort(pets);
        for (Pet p : pets) {
            System.out.println(p.getName());
        }
    }
}
