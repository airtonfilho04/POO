package br.ufc.br.poo.banco.persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import br.ufc.br.poo.banco.conta.ContaAbstrata;

public class XStreamConta implements IRepositorioConta{

	//arquivo que estará com as informaçoes
	private static String CAMINHO_ARQUIVO = "xstreamContas.xml";
	private XStream xstream;
	private List<ContaAbstrata> contasAbstratas;
	
	
	//instancia do XStream e chamada do método recuperarLista para o preenchimento da lista
	public XStreamConta() {
		xstream = new XStream();
		recuperarLista();
	}
	
	// ------ Esses métodos dentro desse "-------" tem a mesma implementação da classe VectorConta, com a implementação usando uma lista comum.
	@Override
	public void inserir(ContaAbstrata conta) {
		contasAbstratas.add(conta);
	}

	@Override
	public void remover(String numero) {
		ContaAbstrata conta = procurar(numero);
		if(conta!=null)
			contasAbstratas.remove(conta);
	}

	@Override
	public ContaAbstrata procurar(String numero) {
		for(ContaAbstrata contaAbstrata: contasAbstratas) {
			if(contaAbstrata.getNumero().equals(numero))
				return contaAbstrata;
		}
		return null;
	}

	@Override
	public ContaAbstrata[] listar() {
		ContaAbstrata[] contasAbstratasArray = new ContaAbstrata[contasAbstratas.size()];
		contasAbstratasArray = contasAbstratas.toArray(contasAbstratasArray);
		return contasAbstratasArray;
	}

	@Override
	public int tamanho() {
		return contasAbstratas.size();
	}
	
	private void recuperarLista() {
		File file = new File(CAMINHO_ARQUIVO);
		if(!file.exists()) {
			contasAbstratas = new ArrayList<>();
			return;
		}
		contasAbstratas = (List<ContaAbstrata>)xstream.fromXML(file);
	}
	
	private void salvarLista() {
		try {
			xstream.toXML(contasAbstratas, new FileOutputStream(CAMINHO_ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void atualizar() {
		salvarLista();
	}
}
