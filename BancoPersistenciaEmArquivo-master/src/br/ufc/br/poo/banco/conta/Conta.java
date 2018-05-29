package br.ufc.br.poo.banco.conta;

import java.io.Serializable;

public class Conta extends ContaAbstrata implements Serializable{

	public Conta(String numero) {
		super(numero);
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
	}

}
