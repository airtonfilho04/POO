package br.ufc.br.poo.banco.conta;

import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable{

	public ContaPoupanca(String numero) {
		super(numero);
	}

	public void renderJuros(double taxa) {
		this.creditar(this.getSaldo() * taxa);
	}
}
