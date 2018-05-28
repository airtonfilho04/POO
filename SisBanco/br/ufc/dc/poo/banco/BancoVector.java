package br.ufc.dc.poo.banco;

import java.util.Vector;
import br.ufc.dc.poo.banco.contas.Conta;
import br.ufc.dc.poo.banco.contas.ContaPoupanca;

public class BancoVector implements IBanco {
	private Vector<ContaAbstrata> contas;
	private double taxa;
	
	public BancoVector() {
		contas = new Vector<ContaAbstrata>();
		taxa = 0.01;
	}     

	public void cadastrar(ContaAbstrata conta){
		if(procurar(conta.getNumero()) == null) {
			contas.add(conta);
		}
	} 

	private Conta procurar(String numero){
		for(ContaAbstrata conta : contas) {
			if(conta.getNumero().equals(numero)) {
				return conta;
			}
		}
		return null;	
	} 

	public void creditar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null) {
			conta.creditar(valor);
		}
	} 

	public void debitar(String numero, double valor){
		ContaAbstrata conta = procurar(numero);
		if(conta != null && conta.getSaldo() >= valor) {
			conta.debitar(valor);
		}
	} 
	
	public double saldo(String numero) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null) {
			return conta.getSaldo();
		}
		
		return 0.0;
	} 

	public void transferir(String origem, String destino, double valor){
		ContaAbstrata contaOrigem = procurar(origem);
		ContaAbstrata contaDestino = procurar(destino);
		
		if(contaOrigem != null && contaDestino != null && contaOrigem.getSaldo() >= valor) {
			contaOrigem.debitar(valor);
			contaDestino.creditar(valor);
		}
	
	}
	
	public void renderJuros(String numero) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null && conta instanceof ContaPoupanca) {
			((ContaPoupanca) conta).renderJuros(this.taxa);
		}
	}
	public void renderbonus(String numero) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null && conta instanceof ContaPoupanca) {
			((ContaEspecial) conta).renderBonus();
		}
	}





}
