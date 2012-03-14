/*
 * Recursion exercises. http://programmedlessons.org/java5/index.html#70
 */

public class Recursion {
	public Recursion() {}

	/* Chpt. 71, Exercise 3 */
	public int square(int number) {
		if (number == 1) {
			return 1;
		} else {
			return square(number - 1) + (2 * square(n - 1));
		}
	}

	/* Chpt. 71, Exercise 4 */
	public int log(int number) {
		if (number == 1) {
			return 1;
		} else {
			return 1 + log(number / 2);
		}
	}

	/* Chpt. 72, Exercise 3 */
	public int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			gcd(b % a, a);
		}
	}

	/* Chpt. 75, Exercise 7 */
	public boolean palindrome(String text) {
		if (text.equals("") || text.length() == 1) {
			return true;
		} else {
			if (text.substring(0, 1).equals(text.substring(text.length() - 1, text.length()))) {
				palindrome(text.substring(1, text.length() - 1));
			} else {
				return false;
			}
		}
	}
}