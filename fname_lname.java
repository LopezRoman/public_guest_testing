
package guest_interview;

public class fname_lname {
	
	/**
	 * Main function.
	 */
	public static void main (String[] args) {
		System.out.println("I am in main");
		String num_input = args[0];
		System.out.println("The number input is: " + num_input);
		print_date_many_times(Integer.valueOf(num_input));
	}

	/**
	 * Used to print out recursively todays date based on program input.
	 */
	public static int print_date_many_times(int x) {
		if (x != 0) {
			System.out.println(x + ": 8/14/2023, " +x+ " ^2 = " + sq(x));
			x--;
			print_date_many_times(x);
		}
		return x;
	}

	/**
	 * Used to print out sq of input.
	 */
	public static int sq(int y) {
		int sq = y * y;
		return sq;
	}

}
