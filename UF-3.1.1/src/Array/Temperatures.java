package Array;

public class Temperatures {

	public static void main(String[] args) {
		int [] temperatures ={65,71,68,85,78,89,78};
		int [] dailyTemps = temperatures;
		temperatures[6]=101;
		System.out.println(temperatures[6]);
	}

}
