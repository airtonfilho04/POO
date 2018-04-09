package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.Conta;
import br.ufc.dc.poo.banco.contas.ContaPoupanca;

public class BancoArray{
	
	private Conta[] contas; 
	private int	indice = 0;
  private double taxa;

	public BancoArray(){ 
    	contas = new Conta[100]; 
      taxa = 0.01;
   	}

   	public void cadastrar(Conta conta){ 
      contas[indice] = conta; 
		  indice++; 
   	}

   	private Conta procurar(String numero){
		
		int i = 0;  
		boolean achou = false; 
     	
     	while ((!achou) && (i < indice)){ 
       		if (contas[i].numero().equals(numero)){  
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

	public void debitar(String numero, double valor){ 
     	
     	Conta conta; 
     	conta = procurar(numero);  
		
		if(conta != null){  
			conta.debitar(valor);  
     	} 
		else{  
			System.out.println("Conta Inexistente!"); 
     	} 
  	}

  	public void creditar(String numero, double valor){

  		Conta conta; 
     	conta = procurar(numero);

     	if(conta != null){  
			conta.creditar(valor);  
     	} 
		else{  
			System.out.println("Conta Inexistente!"); 
     	}
  	}

  	public double saldo(String numero){

  		Conta conta;
  		conta = procurar(numero);

  		if(conta != null){  
			double saldo = conta.saldo();
			return saldo;  
     	} 
		else{  
			System.out.println("Conta Inexistente!"); 
     		return 0;
     	}
  	}

  public void transferir(String origem, String destino, double valor){

		Conta contaOrigem;
 		Conta contaDestino; 
   	contaOrigem = procurar(origem);
   	contaDestino = procurar(destino);

    if((contaOrigem != null) && (contaDestino != null)){  
			contaOrigem.debitar(valor);
			contaDestino.creditar(valor);  
    } 
		else{  
			System.out.println("Erro! O númeo de uma das contas está errado!"); 
     	} 
  	}

    public void renderJuros(String numero){
          ContaPoupanca conta;
          conta = procurar(numero);

          if(conta != null){
            conta.renderJuros(taxa);
          }
          else{
            System.out.println("Conta Inexistente!");
          }
        }   	
}