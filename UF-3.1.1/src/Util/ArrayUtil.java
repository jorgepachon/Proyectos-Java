package Util;

public class ArrayUtil {
	public String inReverse(int[] values)
	 {
	 String message ="";
	for (int i = values.length - 1; i >=0;i--) {
		System.out.print(values[i]+"");
	}
	
	return message;
	 }

	public static void main(String[] args) {
		System.out.println(new ArrayUtil().inReverse(new int[]{1,2,3,4}));
	}

}
