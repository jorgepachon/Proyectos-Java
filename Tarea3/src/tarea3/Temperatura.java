package tarea3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperatura {

	
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("introduzca temperatura celsius: ");

		double celsius = Double.parseDouble(reader.readLine());

		double fahrenheit = (9.0 / 5.0) * celsius + 32;

		System.out.println("Temperature in Fahrenheit is : " + fahrenheit);

	}

}
