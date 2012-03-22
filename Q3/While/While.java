import java.util.*;

public class While {
    public static void method1() {
		Scanner myScanner = new Scanner(System.in);
		
		int input = myScanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("out");
        }
    }	
	
    public static void method2() {
		//create a new Scanner object that will read input from the keyboard
		Scanner myScanner = new Scanner(System.in);

		System.out.println("I have a number in mind, Dave. Can you guess?");
        int number = (int)((Math.random() * 15) + 1);

        boolean correct = false;

		while (correct == false) {
            System.out.println("Guess: ");
            guess = myScanner.nextInt();

            if (guess == number) {
                result = true;
                System.out.println("You win!");
            }
        }
	}	
   
	public static void method3() {
		Scanner scan = new Scanner(System.in);

		ArrayList<String> shorter = new ArrayList<String>;
		ArrayList<String> longer = new ArrayList<String>;

		System.out.println("Keep entering words until you are told to stop!");

		while (shorter.size() < 10 && longer.size() < 10) {
			System.out.println("Enter a string: ");
			text = scan.next();

			if (text.length() > 6) {
				longer.add(text);
			} else {
				shorter.add(text);
			}
		}

		System.out.println("Both lists are full.");

		System.out.println("Longer list: ")
		for (int i = 0; i < longer.size(); i++) {
			System.out.println(longer.get(i));
		}

		System.out.println("Shorter list: ");
		for (int i = 0; i < shorter.size(); i++) {
			System.out.println(shorter.get(i));
		}
	}
}