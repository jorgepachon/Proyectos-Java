import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int rnum = 0;
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		String miStr = Integer.toString(num);
		// Create a Stack of Character
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < miStr.length(); i++)
			st.push(miStr.charAt(i));
		/// {write your code here
		Iterator<Character> it = st.iterator();
		miStr = "";
		while (it.hasNext())
			miStr += st.pop();
		rnum = Integer.parseInt(miStr);
		/// }
		System.out.println("Reverse is :" + rnum);
	}
}
