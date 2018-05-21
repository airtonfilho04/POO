public class BancoIndependente implements IBanco { 

	private IRepositorioConta contas; 
	private double taxa = 0.01;
	
	public BancoIndependente(IRepositorioConta contas){ 
		this.contas = contas; 
    }

    public double saldoTotal(){
    	int i = 0;
    	double saldoFinal = 0;
    	ContaAbstrata[] repositorioContas = contas.listar();
    	int tamanhoRepositorio = contas.tamanho();

    	while(i <= tamanhoRepositorio){
    		saldoFinal = saldoFinal + repositorioContas[i].getSaldo();
    		i++;
    	}

    	return saldoFinal;
    }

    public int numeroContas(){
    	return contas.tamanho();
    } 

	public void cadastrar(ContaAbstrata conta) { 
		contas.inserir(conta); 
    }

    private ContaAbstrata procurar(String numero){
    	return contas.procurar(numero);
    } 

    public void creditar(String numero, double valor){
    	ContaAbstrata conta = contas.procurar(numero);  
		if(conta != null) { 
			conta.creditar(valor);  
      	}
		else { 
			System.out.println("Conta inexistente!"); 
      }
    }

	public void debitar(String numero, double valor) { 
		ContaAbstrata conta = contas.procurar(numero);  
		if(conta != null) { 
			conta.debitar(valor);  
      	}
		else { 
			System.out.println("Conta inexistente!"); 
      } 
   	}

   	public double saldo(String numero){
   		ContaAbstrata conta = contas.procurar(numero);
   		if(conta != null) { 
			double saldo = conta.getSaldo();
			return saldo;  
      	}
      	else {
      		System.out.println("Conta inexistente!");
      	}
   	}

   	public void transferir(String origem, String destino, double valor){
   		ContaAbstrata contaOrigem;
 		ContaAbstrata contaDestino; 
   		contaOrigem = procurar(origem);
   		contaDestino = procurar(destino);
    	if((contaOrigem != null) && (contaDestino != null)){  
			contaOrigem.debitar(valor);
			contaDestino.creditar(valor);  
    	} 
		else{  
			System.out.println("Conta inexistente!");
     	} 
  	}

  	public void renderJuros(String numero){
    	ContaAbstrata conta;
    	conta = procurar(numero);

        if((conta != null) && conta instanceof ContaPoupanca){
      		((ContaPoupanca)conta).renderJuros(taxa);
        }
        else{
        	System.out.println("Conta Inexistente!");
        }
    }

    public void renderBonus(String numero) {
    	ContaAbstrata conta;
    	conta = procurar(numero);

        if((conta != null) && conta instanceof ContaEspecial){
            ((ContaEspecial)conta).renderBonus();
        }
        else{
            System.out.println("Conta Inexistente!");
        }
    }
}
 