import java.lang.Math; 

public class Calculadora{
	
	public Calculadora(){

	}

	public double adicionar(double operandoA, double operandoB){
		double resultadoSoma = operandoA + operandoB;
		return resultadoSoma;
	}

	public double subtrair(double operandoA, double operandoB){
		double resultadoSub = operandoA - operandoB;
		return resultadoSub;
	}

	public double multiplicar(double operandoA, double operandoB){
		double resultadoMult = operandoA * operandoB;
		return resultadoMult;
	}

	public double dividir(double operandoA, double operandoB){
		double resultadoDiv = operandoA / operandoB;
		return resultadoDiv;
	}

	public double potencia(double base, int expoente){
		double resultadoPot = Math.pow(base, expoente);
		return resultadoPot;
	}

	public double raiz(double radicando){
		double resultadoRaiz = Math.sqrt(radicando);
		return resultadoRaiz;
	}

	public double seno(double angulo){
		double resultadoSeno = Math.sin(Math.toRadians(angulo));
		return resultadoSeno;
	}	

	public double coseno(double angulo){
		double resultadoCoseno = Math.cos(Math.toRadians(angulo));
		return resultadoCoseno; 
	}

	public double tangente(double angulo){
		double resultadoTangente = Math.tan(Math.toRadians(angulo));
		return resultadoTangente;
	}
}