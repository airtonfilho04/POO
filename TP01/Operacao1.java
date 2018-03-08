import java.util.Scanner;

public class Operacao1{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);

		System.out.println("Digite o primeiro numero da operacao: ");
		float numA = scanner.nextFloat();
		System.out.println("Digite o segundo numero da operacao: ");
		float numB = scanner.nextFloat();

		System.out.println("Digite o numero correspondente a operacao: ");
		System.out.println("1.Soma 2.Subtracao 3.Multiplicacao 4.Divisao ");
		int numOper = scanner.nextInt();

		if(numOper == 1){
			System.out.println("O resultado da operacao e: " + (numA + numB));
		}
		else if(numOper == 2){
			System.out.println("O resultado da operacao e: " + (numA - numB));
		}
		else if(numOper == 3){
			System.out.println("O resultado da operacao e: " + (numA * numB));
		}
		else if(numOper == 4){
			System.out.println("O resultado da operacao e: " + (numA / numB));
		}
		else{
			System.out.println("Erro! Entrada Inválida!");
		}
	}
}