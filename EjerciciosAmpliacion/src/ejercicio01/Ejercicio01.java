package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int num = 0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el número
		System.out.println("Introduzca un número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Creo un objeto
		Numeros numero = new Numeros(num);
		
		//Compruebo si es primo
		System.out.println("¿El número es primo? " + numero.esPrimo());
		
		//Compruebo si es capicúa
		System.out.println("¿El número es capicúa? " + numero.esCapicua());
		
		//Cierro el Scanner
		sc.close();

	}

}
