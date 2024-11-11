package cs210_lab_5_part1;

import java.util.Scanner;
import java.util.Stack;

public class cs210_lab_5_part1 {
	public static void main(String[] args) {
    	Stack<String> directions = new Stack<>();
    	// Create a new stack
    	directions = stacker(directions);
    	// prints directions back
        wayBack(directions);
        
    }
    
    // creates Stack of directions
    static Stack<String> stacker(Stack<String> stk) {
    	Scanner sc = new Scanner(System.in);
    	String s = "";
    	int x=0;
    	
        // Push elements onto the stack
    	while(s.equals("arrived") != true && x < 100) {
    		stk.push(sc.nextLine().toLowerCase());
    		s = stk.peek();
    		// removed previous direction when go back is typed
    		if(s.equals("go back")) {
    			stk.pop();
    			stk.pop();
    			s = stk.peek();
    		}
    		x++;
    	}
    	
    	if(x<1) {		// terminates code if not enough directions
    		System.out.println("must have 1 or more directions");
    		System.exit(0);
    	}
        sc.close();		// closes scanner
        stk.pop();		// removes arrived for further operation
        return stk;		// returns stack
    }
    
    static void wayBack(Stack<String> a) {
    	while(!a.isEmpty()) {
    		switch (a.pop()) {
    		case ("go north"):
    			System.out.println("Go South");
    			break;
    		case ("go south"):
    			System.out.println("Go North");
    			break;
    		case ("go east"):
    			System.out.println("Go West");
    			break;
    		case ("go west"):
    			System.out.println("Go East");
    			break;
    		}
    	}
    	
    }
}
