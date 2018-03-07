import java.util.Scanner;

public class RaizesEquacao{
	
	public static float calcDelta(float a, float b, float c){
		float delta = b * b - 4 * a * c;
		return delta;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);

		System.out.println("Indique os coeficientes da equacao do tipo ax2 + bx + c: ");
		System.out.println("Valor de a: ");
		float coefA = scanner.nextFloat();
		System.out.println("Valor de b: ");
		float coefB = scanner.nextFloat();
		System.out.println("Valor de c: ");
		float coefC = scanner.nextFloat();

		float delta = calcDelta(coefA, coefB, coefC);
		System.out.println(delta);

		if(delta == 0){
			double raizA = (-coefB) / 2 * coefA;
			double raizB = raizA;

			System.out.println("Valor da raiz A: " + raizA);
			System.out.println("Valor da raiz B: " + raizB);
		}

		else if(delta > 0){
			double raizA = - coefB + Math.sqrt(delta) / 2 * coefA;
			double raizB = - coefB - Math.sqrt(delta) / 2 * coefA;
			
			System.out.println("Valor da raiz A: " + raizA);
			System.out.println("Valor da raiz B: " + raizB);
		}

		else{
			System.out.println("Nao sei ainda!");
		}
	}
}