public class Employee {
    
    /* Fields */
    public int id;
    public String name;
    public String surname;
    public int age;
    public String title;
    public static int nextID = 0;
    
    /* Contructors */
    public Employee(String inName, String inSurname, int inAge, String inTitle) {
        name = inName;
        surname = inSurname;
        age = inAge;
        title = inTitle;
        
        id = nextID;
        nextID++;
    }
    
    public Employee() {
        id = 42;
        name = "Joe";
        surname = "Shmoe";
        age = 3;
        title = "Baby";
    }
    
    /* Methods */
    public void increaseAge(int amount) {
        age = age + amount;
        System.out.println(name + "'s is now " + age);
    }
    
    public void getName() {
        System.out.println(name + " " + surname);
    }
    
    public void getAge() {
        System.out.println(name + "'s age is " + age);
    }
    
}