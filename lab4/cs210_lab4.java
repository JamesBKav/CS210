package cs210_lab_4;
import java.util.Scanner;
public class cs210_lab4 {	
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_RESET = "\u001B[0m"; 
	// sorter (bubble sort)
	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
        String[] ar = new String[sc.nextInt() + 1];
        
        for(int i = 0; i < ar.length; i++) {
        	ar[i] = sc.nextLine();
        }
        sc.close();
      	sorter(ar, ar.length);
      	print(ar);
    }

    // Method to sort words by length, then alphabetically if lengths are equal
    public static void sorter(String[] words, int N) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                // First compare by length
                if (words[j].length() > words[j + 1].length() || 
                    (words[j].length() == words[j + 1].length() && words[j].compareTo(words[j + 1]) > 0)) {
                    
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
	
	
	static void print(String[] a) {
		System.out.println();
		for(int i = 0;i < a.length; i++) {
			System.out.print(ANSI_YELLOW_BACKGROUND+a[i]+" ");
		}
	}
}


