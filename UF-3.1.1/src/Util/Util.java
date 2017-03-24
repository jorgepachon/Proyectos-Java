package Util;

public class Util {
	public int getCount(int[] values) {//metodo para contar los ceros
		int count = 0;
		for (int current : values) {
			if (current==0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Util miEjemplo = new Util();
		int[] ceros ={0,12,0,0,5,0};
		System.out.println(miEjemplo.getCount(ceros));
			}

}
