package br.ufc.br.poo.banco.conta;

import java.io.Serializable;

public class ContaImposto extends ContaAbstrata implements Serializable{

	public ContaImposto(String numero) {
		super(numero);
	}

	public void debitar(double valor) {
		this.saldo -= (valor + (valor * 0.001));
	}

}
