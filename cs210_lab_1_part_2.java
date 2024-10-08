package cs210_labs;

import java.util.Scanner;
public class cs210_lab_1_part_2 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	// defines scanner
		long card = sc.nextLong();		// takes in card value
		sc.close();				// closes Scanner
		int sums = 0, multi = 1;		// sets int variables
		
		while(card > 0) {
			if(multi == 1) {		// when multi is set to one it runs the following code
				sums += (card % 10);	// adds the number on without running the algo
				multi = 2;
			}else {					// when mutli is set to 2 it runs the following code
				if( ( card % 10 ) * 2 > 9) {		// checks if when the doubled value is larger than 9
					sums += ( card % 10 ) * 2 - 9;	// when larger than 9 it subtracts 9 
													//from the value
				}else {				// when not larger than 9 it just adds onto the total value
					sums += ( card % 10 ) * 2;
				}
				multi = 1;			// changes multi to allow for Luhns algorithm
			}
			card = card / 10;			// itterates to the next number
		}
		// if( sums % 5 == 0){
		if( sums % 10 == 0 ) {				// if the total %10==0
			System.out.println("VALID");		// then Luhns algorithm is valid
		}else {						// if not ==0 then algorithm is invalid
			System.out.println("INVALID");
		}		
	}
}
