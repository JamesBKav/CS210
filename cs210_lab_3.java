package cs210_lab;
import java.util.Scanner;

public class cs210_lab_3 {
	public static void main(String[] args) {
		// variables		n = nth prime number, prime = prime no. found, digit = the number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// stops running if number is outside parameters
		if(1>= n || n >= 1000) {
			System.out.println("Your number is too Small/Large");
			System.out.println("Please stay within the numbers 1-1000");
			System.exit(0);
		}
		System.out.println(finder(n));
		System.out.println(finder(n*2));
	}

	
	// checks for prime number
	static boolean isPrime(int n){
		if( n <= 1) {
			return false;
		}
		
		for(int i = 2; i < n; i++){
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int finder(int n) {
		int  prime = 0, digit = 1;
		// finds the nth prime number
		while(prime < n) {
			digit += 1;
			if( isPrime(digit) ) {
				prime += 1;
			}
		}
		return digit;
	}
}
