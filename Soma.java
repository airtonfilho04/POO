import java.util.Scanner;

public class Soma{

	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numeroA = scanner.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numeroB = scanner.nextInt();

		if(numeroA == numeroB){
			System.out.println("Os numeros sao iguais!");
		}
		else if(numeroA > numeroB){
			System.out.println("O numero A é maior: " + numeroA);
		}
		else{
			System.out.println("O numero B é maior: " + numeroB);
		}
	}
}