package br.ufc.dc.poo.banco;

import java.util.Vector;
import br.ufc.dc.poo.banco.contas.*;

public class VectorConta implements IRepositorioConta {
	
	private Vector<ContaAbstrata> contas;

	public VectorConta(){
		this.contas = new Vector<ContaAbstrata>();
	}

	public void inserir(ContaAbstrata conta){
		contas.add(conta);
	}

	public void remover(String numero){
		ultimoElemento = contas. 
	}

	public ContaAbstrata procurar(String numero){
		int i = 0;  
		boolean achou = false; 
     	
     	while ((!achou) && (i < contas.size())){ 
       		if (contas.get(i).getNumero().equals(numero)){  
       			achou = true; 
       		} 
       		else{  
       			i++; 
       		} 
     	} 
     	
     	if (achou == true) {  
       		return contas.get(i); 
     	} 
     	else {  
       		return null; 
     	}
	}

	public ContaAbstrata[] listar(){
		return contas;
	}

	public int tamanho(){
		return contas.size();
	}
} 