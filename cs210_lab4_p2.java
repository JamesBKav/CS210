package cs210_lab4_p2;
import java.util.Scanner;
public class cs210_lab4_p2 {	
//	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//	public static final String ANSI_RESET = "\u001B[0m"; 
	// sorter (bubble sort)
	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
        String[] ar = new String[sc.nextInt() + 1];
        
        for(int i = 0; i < ar.length; i++) {
        	ar[i] = sc.nextLine();
        }
        sc.close();
        // sorts array by length then alphabetical order if equal
      	stringSorter(ar.length, ar);
      	print(ar);
      	// sorts in reverse
      	stringSorterBackwards(ar.length, ar);
      	print(ar);
    }

    // Method to sort words by length, then alphabetically if lengths are equal
    public static void stringSorter(int n, String[] words) {
    	
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // First compare by length
                if (words[j].length() > words[j + 1].length()){
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }else if((words[j].length() == words[j + 1].length() && words[j].compareTo(words[j + 1]) > 0)) {
                	// Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
    // Method to sort words by length, then alphabetically if lengths are equal
    public static void stringSorterBackwards(int n, String[] words) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	if (words[j+1].length() > words[j].length()){
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }else if((words[j].length() == words[j + 1].length() && words[j + 1].compareTo(words[j]) > 0)) {
                	// Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
	
	// prints the String array
	static void print(String[] a) {
		System.out.println();
		for(int i = 0;i < a.length; i++) {
			//System.out.print(ANSI_YELLOW_BACKGROUND+a[i]+" ");
			System.out.print(a[i]+" ");
		}
	}
}
