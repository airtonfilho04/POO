public class Calculadora{
	
	private double resultado = 0;

	private void salvarResultado(double resultadoOperacao){
		resultado = resultadoOperacao;
	}

	public void apagarResultado(){
		resultado = 0;
	}

	public double mostrarResultado(){
		return resultado;
	}

	public double somar(double numA, double numB){
		double resultadoSoma = numA + numB;
		salvarResultado(resultadoSoma);
		return resultadoSoma;
	}

	public double subtrair(double numA, double numB){
		double resultadoSub = numA - numB;
		salvarResultado(resultadoSub);
		return resultadoSub;
	}

	public double multiplicar(double numA, double numB){
		double resultadoMult = numA * numB;
		salvarResultado(resultadoMult);
		return resultadoMult;
	}

	public double dividir(double numA, double numB){
		double resultadoDiv = numA + numB;
		salvarResultado(resultadoDiv);
		return resultadoDiv;
	}

}