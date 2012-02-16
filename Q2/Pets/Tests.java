
public class Tests {
    public static void main(String[] args) {
        /*
        Pet p1 = new Pet("Harry");
        Dog d1 = new Dog("Rufus");
        Pet p2 = new Dog("Fido");
        
        System.out.println(p1.getName());
        System.out.println(p1.makeNoise());
        System.out.println(d1.getName());
        System.out.println(d1.makeNoise());
        System.out.println(p2.getName());
        System.out.println(p2.makeNoise());
        
        System.out.println("Zoo tests====");*/
        Pet lion = new Lion("Rufus");
        Pet penguin = new Penguin("Pengy");
        Pet dog = new Dog("Harry");
        Pet cat = new Cat("Socks");
        
        Pet[] animals = { lion, penguin, dog, cat };
        
        Zoo zoo = new Zoo(animals);
        zoo.makeRuckus();
        zoo.playWith(0, 1);
        zoo.roleCall();
        
        
    }
}