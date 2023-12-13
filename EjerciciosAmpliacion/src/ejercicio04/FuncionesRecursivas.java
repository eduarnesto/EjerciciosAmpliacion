package ejercicio04;

public class FuncionesRecursivas {
	
	public static int sumatorio(int numero) {
		int res=0;
		if(numero==1) {
			res=0;
		} else {
			res+=numero+sumatorio(numero-1);
		}
		return res;
	}
	
	public static int potencial(int a, int n) {
		int res=0;
		if(n==0) {
			res=1;
		} else {
			res=a*potencial(a, n-1);
		}
		return res;
	}
	
	public static int serieFibonacci(int numero) {
		int res=0;
		if(numero==0) {
			res=0;
		} 
		if(numero==1 || numero==2){
			res=1;
		}
		res = serieFibonacci(numero-2) + serieFibonacci (numero-1);
		return res;
	}
}
