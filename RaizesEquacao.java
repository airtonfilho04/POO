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

		if(delta == 0){
			raizA = (-coefB) / 2 * coefA;
		}

		else if(delta > 0){
			
		}
	}
}