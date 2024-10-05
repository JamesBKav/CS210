package cs210_labs;

import java.util.Scanner;
public class cs210_lab_1 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	// defines scanner
		long card = sc.nextLong();		// takes in card value
		sc.close();				// closes Scanner
		int sums = 0, multi = 1;		// sets int variables
		
		// this is where the magic happens
		// the while loop starts at the end of the of the card number
		// the multi variable being defined at 1 at the beginning 
		// this causes the last number to be multiplied by 1 at all times
		// at the end of each run of the loop the multi varaible if shifted between
		// 1 and 2 this allows Luhns algorithm to run correctly
		
		while(card > 0) {
			if(multi == 1) {		// when multi is set to one it runs the following code
				sums += (card % 10);	// adds the number on without running the process
				multi = 2;
			}else {					// when mutli is set to 2 it runs the folowing code
				if( ( card % 10 ) * 2 > 9) {	// checks if when the doubled value is larger than 9
					sums += ( card % 10 ) * 2 - 9;	// when larger than 9 it subtracts 9 
									//from the value
				}else {				// when not larger than 9 it just adds onto the tot value
					sums += ( card % 10 ) * 2;
				}
				multi = 1;			// changes multi to allow for Luhns algorithm
			}
			card = card / 10;			// itterates to the next number
		}
		
		if( sums % 10 == 0 ) {				// if the total %10==0
								// then Luhns algorithm is valid
			System.out.println("VALID");
		}else {						// if not ==0 then algorithm is invalid
			System.out.println("INVALID");
		}		
	}
}
