package For;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int count = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = in.nextLine().toLowerCase();
		

		for (int i = 0; i < word.length(); i++) {
			String letter = word.substring(i, i + 1);
			
			if ("aeiouAEIOU".contains(letter)) {
				count++;
			}else{
				System.out.print(letter);
			}
		}
		System.out.println(count + " vowels");
	}

}
