package Array;

public class EjercicioArray {

	public static void main(String[] args) {
		int [] temperatures = {65, 71, 68, 85, 87, 89, 78};
		int [] dailyTemps = temperatures;
		dailyTemps[6] = 101;
		System.out.println(temperatures[6]);
	}

}
