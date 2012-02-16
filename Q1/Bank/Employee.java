//Solution to Employee class

public class Employee
{
//fields
    private String firstName;
    private String lastName;
    private int age;
    private String idNum;
    private String title;
    private double salary;
    
//constructors
    public Employee (String first , String last , int howOld , String theTitle , double startingSalary)
    {
        firstName = first;
        lastName = last;
        age = howOld;
        title = theTitle;
        salary = startingSalary;
        idNum = "000-00-0000";
    }
    
//default constructor Ð not required but makes testing easier
    public Employee ()
    {
        firstName = "Jacoby";
        lastName = "Ellsbury";
        age = 27;
        title = "Center Fielder";
        salary = 2400000.0;
        idNum = "000-00-0000";
    }

//methods
    public String getFirst()
    {
        return firstName;
    }
    
    public String getLast()
    {
        return lastName;
    }
    
    public void setID(String newID)
    {
        idNum = newID;
    }

    public String getID()
    {
        return idNum;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }

    public void increaseAge()
    {
        age = age + 1;          //or age++;
    }
 
    public void giveRaise(double howMuch)
    {
        salary = salary + howMuch;          //or salary += howMuch;
    }

    public void changePosition(String newTitle ,  double newSalary)
    {
        title = newTitle;
        salary = newSalary;
    }
    
    public void fire()
    {
        title = "terminated";
        salary = 0.0;
    }
    
    public void printPersonnelReport()
    {
         System.out.println ("First Name: " + firstName );
        System.out.println ("Last Name: " + lastName ); 
        System.out.println ("Age: " + age );
        System.out.println ("Title: " +title );
        System.out.println ("Salary: " + salary );
    }
}

