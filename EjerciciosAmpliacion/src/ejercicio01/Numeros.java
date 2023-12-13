package ejercicio01;

public class Numeros {
	int numero;

	public Numeros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Numeros(int numero) {
		super();
		this.numero = numero;
	}



	public boolean esPrimo() {
		boolean primo = true;
		int div = 2;
		if(numero == 1) {
			primo = false;
		} else {
			
		while(div <= Math.sqrt(numero) && primo) {
				if(numero%div == 0) {
					primo = false;
				}
				div++;
			}
		}
		return primo;
	}
	
	public boolean esCapicua() {
		boolean capicua=false;
		int auxiliar=numero;
		int numReves = 0;
		int ultimaCifra;
		
		while(auxiliar>0) {
			ultimaCifra = auxiliar%10;
			numReves = numReves * 10 + ultimaCifra;
			auxiliar /= 10;
		}
		
		if(numReves==numero) {
			capicua=true;
		}
		return capicua;
	}
}
