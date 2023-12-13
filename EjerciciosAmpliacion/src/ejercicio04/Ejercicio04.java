package ejercicio04;

import java.util.Scanner;

import ejercicio01.Numeros;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int num = 0;
		
		//Variable para guardar otro número
		int num2 = 0;
		
		//Variable para guardar el resultado
		int res;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el número
		System.out.println("Introduzca un número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Llamo a la función de sumatorio
		res = FuncionesRecursivas.sumatorio(num);
		
		//Imprimo el resultado
		System.out.println("La suma de todos los números del 1 al número es " + (res-num));
		
		//Pregunto por un segundo número
		System.out.println("Introduzca otro número");
		
		//Leo del teclado
		num2=sc.nextInt();
		
		//Llamo a la función potencial
		res = FuncionesRecursivas.potencial(num, num2);
		
		//Imprimo el resultado
		System.out.println("El primer número elevado al segundo es: " + res);
		
		//Llamo a la función serieFibonacci
		res = FuncionesRecursivas.serieFibonacci(num);
		
		//Imprimo el resultado
		System.out.println(res);

	}

}
