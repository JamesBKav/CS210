package cs210_lab_4;
import java.util.*;
public class cs210_lab_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// defines array length
		String[] list = new String[sc.nextInt()+1];
    // puts values in array
		for(int i = 0; i < list.length;i++) {
			list[i] = sc.nextLine();
		}
		sc.close();    // closes scanner
    // prints list
		for(int i = 0; i < list.length;i++) {
			System.out.println(list[i]);
		}
	}
  // sorts string
	static void sorter(String[] s) {
		//
	}
}
