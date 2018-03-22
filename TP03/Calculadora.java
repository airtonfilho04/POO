public class Calculadora{
	
	private double acumulador;

	public Calculadora(){
		acumulador = 0.0;
	}

	public double getAcumulador(){
		return acumulador;
	}

	public double somar(double numA, double numB){
		acumulador = numA + numB;
		return acumulador;
	}

	public double somarAcum(double numA){
		return somar(acumulador, numA);
	}

	public double subtrair(double numA, double numB){
		acumulador = numA - numB;
		return acumulador;
	}

	public double subtrairAcum(double numA){
		return subtrair(acumulador, numA);
	}

	public double multiplicar(double numA, double numB){
		acumulador = numA * numB;
		return acumulador;
	}

	public double multiplicarAcum(double numA){
		return multiplicar(acumulador, numA);
	}

	public double dividir(double numA, double numB){
		acumulador = numA / numB;
		return acumulador;
	}

	public double dividirAcum(double numA){
		return dividir(acumulador, numA);
	}
}