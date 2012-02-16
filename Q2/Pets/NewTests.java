
public class NewTests {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.speak();
        
        Dog pet1 = new Dog("Harry");
        pet1.speak();
        
        Talkative person2 = new Person();
        person2.speak();
        
        Talkative[] animals = { person1, person2, pet1 };
        
        for(Talkative a : animals) {
            a.speak();
        }
    }
}