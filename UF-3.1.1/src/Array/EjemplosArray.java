package Array;

public class EjemplosArray {

	public static void main(String[] args) {
		int m = 5;
		int [] a = new int [5];
		
		a[1]=2;
		a[2]=a[1];
		a[0]=a[1]+a[2]+2;
		a[0]++;
		a[3]=m+10;
		System.out.println(a[3]);
		
	}
	
}
