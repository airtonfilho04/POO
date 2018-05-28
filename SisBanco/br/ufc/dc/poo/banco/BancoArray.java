package br.ufc.dc.poo.banco;
import br.ufc.dc.poo.banco.contas.ContaAbstrata;

public class Banco implements IBanco{
	private ContaAbstrata[] contas;
	private int indice = 0;
	private double taxa;
	public Banco(){
		contas = new ContaAbstrata[100];
		taxa=0.02;
	}
	public void cadastrar(ContaAbstrata conta){
		contas[indice] = conta;
		indice++;
	}
	private Conta procurar(String numero){
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < indice)) {
		if (contas[i].numero().equals(numero)) {
			achou = true;
		} else {
			i++;
		}
		}
		if (achou == true) {
			return contas[i];
		} else {
			return null;
		}
	}
	public void creditar(String numero, double valor){
		ContaAbstrata conta;
		conta =procurar(numero);
		if(conta!=null){
			conta.creditar(valor);
		}else{
			System.out.println("Conta Inexistente!")
		}
	}
	public void transferir(String numero1, String numero2, double valor){
		ContaAbstrata conta1;
		ContaAbstrata conta2;
		conta1=procurar(numero1);
		conta2=procurar(numero2);
		if(conta1!=null && conta2!=null){
			conta1.debitar(valor);
			conta2.creditar(valor);
		}
	}
	public void saldo(String numero){
		ContaAbstrata conta;
		conta = procurar(numero);
		if(conta!=null){
			conta.getsaldo();
		}
	}
	public void debitar(String numero, double valor) {
		ContaAbstrata conta;
		conta = procurar(numero);
		if (conta != null) {
			conta.debitar(valor);
		} else {
			System.out.println("Conta Inexistente!");
		}
	}
	public void renderJuros(String numero) {
		ContaPoupanca conta = procurar(numero);
		if(conta != null && conta instanceof ContaPoupanca) {
			((ContaPoupanca) conta).renderJuros(this.taxa);
		}
	}
	public void renderbonus(String numero) {
		ContaPoupanca conta = procurar(numero);
		if(conta != null && conta instanceof ContaPoupanca) {
			((ContaEspecial) conta).renderBonus();
		}
	}
}