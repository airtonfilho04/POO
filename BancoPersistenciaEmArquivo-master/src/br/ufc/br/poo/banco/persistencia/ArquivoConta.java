package br.ufc.br.poo.banco.persistencia;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.ufc.br.poo.banco.conta.ContaAbstrata;

public class ArquivoConta implements IRepositorioConta{
	
	//Caminho do arquivo
	private static String CAMINHO_ARQUIVO = "contas.bin";
	//Lista de Contas Abstratas
	private List<ContaAbstrata> contasAbstratas;
	
	//Contrutor com a chamada para o preenchimento da lista com as informações do arquivo
	public ArquivoConta() {
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
	
	// ------  Acaba aqui
	
	
	//Método utilizado para obter os dados que tem no arquivo de texto
	private void recuperarLista() {
		//Instância do arquivo que será utilizado
		File file = new File(CAMINHO_ARQUIVO);
		
		//verificando se o arquivo existe, se sim, quer dizer que há dados para serem buscados
		if(!file.exists()) {
			//se o arquivo não existe, só se inicia a lista com um array vazio	
			contasAbstratas = new ArrayList<>();
			return;
		}
		FileInputStream fileInputStream;
		try {
			//Obtem o arquivo armazenado no disco
			fileInputStream = new FileInputStream(file);
			//prepara o Buffer para a conversão em bytes para o arquivo
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			//verifica se existe algum dado dentro do arquivo, para assim poder realizar a extração dos dados
			if(bufferedInputStream.available() > 0) {
				//Objeto responsável por ler o objeto armazenado 
				ObjectInputStream objectIn = new ObjectInputStream(bufferedInputStream);
				//Obtendo os dados do arquivo e convertendo na lista declarada.
				contasAbstratas = (List<ContaAbstrata>)objectIn.readObject();
				//Fechando conexão
				objectIn.close();
			}else {
				//se não existir algum dado no arquivo, a lista será instanciada com tamanho 0
				contasAbstratas = new ArrayList<>();
			}
		} catch (IOException | ClassNotFoundException e) {
			//caso de algum erro no meio do procedimento
			e.printStackTrace();
		}
	}
	
	private void salvarLista() {
		try {
			//Instância do arquivo que será utilizado 
			FileOutputStream fileOutputStream = new FileOutputStream(CAMINHO_ARQUIVO);
			//prepara o Buffer para a conversão em bytes para o arquivo
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			//Objeto responsável pela escrita do objeto no arquivo
			ObjectOutputStream objectOut = new ObjectOutputStream(bufferedOutputStream);		
			//Escrita do objeto lista no arquivo
			objectOut.writeObject(contasAbstratas);
			//fechando conexão
			objectOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void atualizar() {
		salvarLista();
	}
}
