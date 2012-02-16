
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Student {
    
    // Instance variables.
    private String name;
    private String surname;
    private Class course1;
    private Class course2;
    private Class course3;
    private Class course4;
    
    public Student() {
        name = "John";
        surname = "Doe";
        course1 = new Class();
        course2 = new Class("English", 0, 100.0, 24.0, 42.0, 76.0);
        course3 = new Class("APUSH", 10, 100.0, 100.0, 100.0, 100.0);
        course4 = new Class();
    }

    public Student(String inName, String inSurname, Class une, Class deux, Class trois, Class quatre) {
        name = inName;
        surname = inSurname;
        course1 = une;
        course2 = deux;
        course3 = trois;
        course4 = quatre;
    }
    
    // Methods
    
    public double calcFinalAverage() {
        double sum = course1.calcAverage() + course2.calcAverage() + course3.calcAverage() + course4.calcAverage();
        
        return sum / 4;
    }
    
    public int totalMissedClasses() {
        return course1.getMissed() + course2.getMissed() + course3.getMissed() + course4.getMissed();
    }
    
    public void printStudentReport() {
        System.out.println("===== Report for " + name + " " + surname + " ======");
        System.out.println("Average: " + calcFinalAverage());
        System.out.println("Missed Classes: " + totalMissedClasses());
    }
}
