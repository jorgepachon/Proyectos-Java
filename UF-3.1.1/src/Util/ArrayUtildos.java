package Util;

public class ArrayUtildos {
	public String inReverse(int[] values)
	 {
	 String message ="";
	for (int i : values) {
		message = i + " " + message;
	}
	
	return message;
	 }

	public static void main(String[] args) {
		System.out.println(new ArrayUtildos().inReverse(new int[]{1,2,3,4,5}));
	}

}