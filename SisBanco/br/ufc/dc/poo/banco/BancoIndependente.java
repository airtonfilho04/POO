
public class BancoIndependente implements IBanco {
private IRepositorioConta contas;

	public BancoIndependente(IRepositorioConta contas){
		this.contas = contas;
	}

	public void cadastrar(ContaAbstrata conta){
		contas.inserir(conta);
	}

	public void debitar(String numero, double valor) {
		ContaAbstrata conta = contas.procurar(numero);
		if (conta != null) {
			conta.debitar(valor);
		}else{
			System.out.println("Conta inexistente!");
		}
	}
}