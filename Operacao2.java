import java.util.Scanner;

public class Operacao2{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);

		System.out.println("Digite o primeiro numero da operacao: ");
		float numA = scanner.nextFloat();
		System.out.println("Digite o segundo numero da operacao: ");
		float numB = scanner.nextFloat();

		System.out.println("Digite o numero correspondente a operacao: ");
		System.out.println("1.Soma 2.Subtracao 3.Multiplicacao 4.Divisao ");
		int numOper = scanner.nextInt();

		switch (numOper) {
			case 1:
				System.out.println("O resultado da operacao e: " + (numA + numB));
				break;
			case 2:
				System.out.println("O resultado da operacao e: " + (numA - numB));
				break;
			case 3:
				System.out.println("O resultado da operacao e: " + (numA * numB));
				break;
			case 4:
				System.out.println("O resultado da operacao e: " + (numA / numB));
				break;
			default:
				System.out.println("Erro! Entrada Invalida!");		
		}
	}
}