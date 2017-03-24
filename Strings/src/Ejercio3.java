import java.util.Scanner;

public class Ejercio3 {

	public String replaceLast3words (String input){
		String res ="";
		int lenght = input.length();
		if (lenght<=3)
			res=input.toUpperCase();
			else{
				String s= input.substring(input.length()-3);
				String p= input.substring(0,input.length()-3);
				s=s.toUpperCase();
				res=p+s;
			}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.next();
		
		Ejercio3 obj = new Ejercio3();
		System.out.println(obj.replaceLast3words(s));
	}

}
