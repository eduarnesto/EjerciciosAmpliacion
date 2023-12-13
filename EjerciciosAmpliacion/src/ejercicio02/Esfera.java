package ejercicio02;

public class Esfera {
	int radio;

	public Esfera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Esfera(int radio) {
		super();
		this.radio = radio;
	}
	
	public double superficie() {
		double res;
		res=4*Math.pow(radio, 2)*Math.PI;
		return res;
	}
	
	public double volumen() {
		double res;
		res=(4*Math.PI/3)*Math.pow(radio, 3);
		return res;
	}
}
