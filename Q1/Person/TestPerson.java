
public class TestPerson {
    
    public static void main(String[] args) {
        Person child;
        
        Person person1 = new Person();
        Person person2 = new Person();
        
        person1.age();
        person1.getAge();
        person1.getBirthday();
        person1.getHeight();
        person1.getIQ();
        person1.getName();
        person1.getSurname();
        person1.getWeight();
        person1.isFemale();
        person1.setIQ(140.0);
        child = person1.reproduce(person2, "Ethan", "9 July 1995");
        child.getInfo();
    }

}
