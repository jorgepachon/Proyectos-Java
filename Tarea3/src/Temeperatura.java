
public class Temeperatura {
	
	public static double celsiusTofarenheit (double temperatura){
		return (1.8)*temperatura+32;
	}

	public static double farenheitTocelsius (double temperatura){
		return (temperatura-32)/1.8;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Si tenemos 0 grados ceslsius en farenheit son "+celsiusTofarenheit(0));
		System.out.println("Si tenemos 18 grados ceslsius en farenheit son "+celsiusTofarenheit(18));
		System.out.println("Si tenemos 30 grados ceslsius en farenheit son "+celsiusTofarenheit(30));
		System.out.println("Si tenemos 0 grados farenheit en ceslsius son "+farenheitTocelsius(0));
		System.out.println("Si tenemos 18 grados farenheit en ceslsius son "+farenheitTocelsius(18));
		System.out.println("Si tenemos 30 grados farenheit en ceslsius son "+farenheitTocelsius(30));

	}

}
