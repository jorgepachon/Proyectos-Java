package Arrays;


public class Array {

	public static void main(String[] args) {
		int []iArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			iArray[i] = i *5;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("5 x "+i+" = "+ iArray[i]);
			
		}
	}

}
