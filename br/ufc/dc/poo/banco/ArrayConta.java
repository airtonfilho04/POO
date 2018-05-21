package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.*;

public class ArrayConta implements IRepositorioConta {
	
	private ContaAbstrata[] contas; 
	private int	indice = 0;

	public ArrayConta(){ 
    	contas = new Conta[100]; 
   	}

	public void inserir(ContaAbstrata conta){
		contas[indice] = conta; 
		indice++; 
	}

	public void remover(String numero){
		indice--; 
	}

	public ContaAbstrata procurar(String numero){
		int i = 0;  
		boolean achou = false; 
     	
     	while ((!achou) && (i < indice)){ 
       		if (contas[i].getNumero().equals(numero)){  
       			achou = true; 
       		} 
       		else{  
       			i++; 
       		} 
     	} 
     	
     	if (achou == true) {  
       		return contas[i]; 
     	} 
     	else {  
       		return null; 
     	}
	}

	public ContaAbstrata[] listar(){
		return contas;
	}

	public int tamanho(){
		return indice;
	}
} 