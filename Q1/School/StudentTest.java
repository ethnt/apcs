
public class StudentTest {
    
    public static void main(String[] args) {
        Student john = new Student();
        System.out.println(john.calcAverage());
        System.out.println(john.missedClasses());
        john.printReport();
        
        Class apcs = new Class();
        Class english = new Class("English", 0, 100.0, 95.0, 85.0, 75.0);
        Class apush = new Class("AP US H", 0, 95.0, 85.0, 75.0, 65.0);
        Class art = new Class("Art", 10, 100.0, 100.0, 100.0, 100.0);
        Student jane = new Student("Jane", "Doe", apcs, english, apush, art);
        System.out.println(jane.calcAverage());
        System.out.println(jane.missedClasses());
        jane.printReport();
        
    }
    
}
