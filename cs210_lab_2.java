import java.util.Scanner;
public class cs210_lab_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// declares Scanner(sc)
		int x = sc.nextInt();		// takes the inputed number and sets to x
		sc.close();		// closes scanner(sc)
		System.out.println(x);		// prints the number
		
		// loops until break condition met (number reaches 1)
		while(x != 1) {
			// checks if number is even
			if( x % 2 == 0 ) {
				x = x/2;		// halves number if even
			}else {		// checks if number is odd
				x = x * 3 + 1;		// triples number and add 1
			}
			System.out.println(x);		// prints out number after operation
		}
	}
}
