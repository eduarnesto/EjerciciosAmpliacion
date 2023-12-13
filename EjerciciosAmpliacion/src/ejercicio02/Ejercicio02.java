package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variable para el radio
		int radio;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el radio de la esfera
		System.out.println("Introduzca el radio de la esfera:");
		
		//Leo del teclado
		radio=sc.nextInt();
		
		//Creo un objeto
		Esfera esfera = new Esfera (radio);
		
		//Muestro la superficie
		System.out.println("La superficie de la esfera es: " + esfera.superficie());
		
		//Muestro el volumen
		System.out.println("El volumen de la esfera es: " + esfera.volumen());

		//Cierro el Scanner
		sc.close();
	}

}
