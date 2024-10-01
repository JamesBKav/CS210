import java.util.Scanner;
public class lab1two10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long card = sc.nextLong();
		sc.close();
		int sums = 0, multi = 1;
		
		//1
		while(card > 0) {
			if(multi == 1) {		// if multi is 1
				sums += (card%10);
				multi = 2;
			}else {					// if multi = 2
				if((card%10)*2 >=10) {
					sums += (card%10)*2-9;
				}else {
					sums += (card%10)*2;
				}
				multi = 1;
			}
			card = card/10;
		}
		if(sums%10 == 0) {
			System.out.println("VALID");
		}else {
			System.out.println("INVALID");
		}
		
	}
}
