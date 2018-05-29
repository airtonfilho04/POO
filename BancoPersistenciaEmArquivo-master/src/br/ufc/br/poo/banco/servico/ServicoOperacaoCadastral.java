package br.ufc.br.poo.banco.servico;

import br.ufc.br.poo.banco.conta.ContaAbstrata;
import br.ufc.br.poo.banco.persistencia.IRepositorioConta;

public class ServicoOperacaoCadastral implements IServicoOperacaoCadastral {

	private IRepositorioConta repositorio;

	public ServicoOperacaoCadastral(IRepositorioConta repositorio) {
		this.repositorio = repositorio;
	}

	public void cadastrar(ContaAbstrata conta) {
		this.repositorio.inserir(conta);
		this.repositorio.atualizar();
	}

	public void remover(String numero) {
		this.repositorio.remover(numero);
		this.repositorio.atualizar();
	}

	public ContaAbstrata procurar(String numero) {
		return this.repositorio.procurar(numero);
	}
}
