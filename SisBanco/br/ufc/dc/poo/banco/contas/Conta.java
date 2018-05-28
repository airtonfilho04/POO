package br.ufc.dc.poo.banco.contas;

public class Conta extends ContaAbstrata {
	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public void debitar(double valor){ 
       	saldo = saldo - valor;
    }
    
}
