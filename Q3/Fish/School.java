import java.util.*;

/**
 * This class represents a very simplified School of fish.
 * 
 * @author (Ethan Turkeltaub)
 * @version (1.0)
 */

public class School {
    public static void main(String[] args) {
        ArrayList<Fish> school = new ArrayList<Fish>();
        
        // Fill the ArrayList.
        for (int i = 0; i < 20; i++) {
            school.add(new Fish());
        }
        
        // The Iterator.
        Iterator<Fish> i = school.iterator();
        
        // 1. Change the colors to blue.
        while (i.hasNext()) {
            i.next().setColor("blue");
        }
        
        // 2. Change #8 to green.
        school.get(8).setColor("green");
        
        // 3. Add to the school.
        Fish fish = new Fish();
        school.add(fish);
        
        // 4. Remove the last fish, store to "nemo".
        Fish nemo = school.get(school.size() - 1);
        school.remove(school.size() - 1);
        
        // 5. Change numbers 2, 3, 7, 14, 17.
        int[] numbers = { 2, 3, 7, 14, 17 };
        for (int j : numbers) {
            school.get(j).setColor("orange");
        }
        
        // 6. Add 3 new Fish.
        school.add(new Fish());
        school.add(0, new Fish());
        school.add(4, new Fish());
        
        // 7. Print number of Fish in School.
        System.out.println(school.size());
        
        // 8. Loop through and set age randomly from 0-60.
        Iterator<Fish> f = school.iterator();
        int random = 0;
        
        while (f.hasNext()) {
            random = (int)(Math.random() * 60);
            
            f.next().setAge(random);
        }
        
        // 9. Remove five Fish.
        for (int j = 0; j < 4; j++) {
            school.remove(school.size() -1);
        }
        
        // 10. Print out all Fish ages, and colors.
        System.out.println("#10 fishies.");
        Iterator<Fish> g = school.iterator();
        while (g.hasNext()) {
            System.out.println(g.next().getAge() + " " + g.next().getColor());
        }
        
        // 11. Loop through and kill all fish over the age of 40.
        while (i.hasNext()) {
            if (i.next().getAge() > 40) {
                i.next().die();
            }
        }
        
        // 12. Loop through and print all ages and colors of fish that are alive.
        System.out.println("#12 fishies.");
        
        while (i.hasNext()) {
            if (i.next().isAlive()) {
                System.out.println(i.next().getAge() + " " + i.next().getColor());
            }
        }
        
        // 13. Loop through and print all ages and colors of fish that are dead.
        System.out.println("#13 fishes, may they rest in peace.");
        
        while (i.hasNext()) {
            if (!i.next().isAlive()) {
                System.out.println(i.next().getAge() + " " + i.next().getColor());
            }
        }

        // 14. The Great Beyond
        ArrayList<Fish> cemetary = new ArrayList<Fish>();
        
        for (int j = school.size(); j >= 0; j = j - 1) {
            if (!school.get(j).isAlive()) {
                cemetary.add(school.get(j));
                school.remove(j);
            }
        }
        
        for (int j = 0; j < 5; j++) {
            cemetary.add(new Fish());
        }
        
        // 15. JAWS
        Shark jaws = new Shark();
    }
}
