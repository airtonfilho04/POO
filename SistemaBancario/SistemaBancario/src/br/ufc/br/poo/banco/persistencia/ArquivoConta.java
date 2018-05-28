package br.ufc.br.poo.banco.persistencia;

import br.ufc.br.poo.banco.conta.ContaAbstrata;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoConta implements IRepositorioConta {
	
	public void criarArquivo() {
		File diretorio = new File("/home/408338/Área de Trabalho/Git/POO/SistemaBancario/SistemaBancario/arquivos");
		diretorio.mkdir();
		File arquivo = new File(diretorio, "ListaContas.txt");
	    try {
	        FileWriter gravador = new FileWriter(arquivo);
	        gravador.close();
	      } catch (IOException ioe) {
	        ioe.printStackTrace();
	      }
	      String[] arquivos = diretorio.list();
	      for (int i = 0; i < arquivos.length; i++) {
	         File filho = new File(diretorio, arquivos[i]);
	         System.out.println(filho.getAbsolutePath());
	      }
	}
	
	public void escreverArquivo() {
		fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		if(bufferedInputStream.available() > 0) {
			ObjectInputStream objectIn = new ObjectInputStream(bufferedInputStream);
			contasAbstratas = (List<ContaAbstrata>)objectIn.readObject();
			objectIn.close();
		}else {
			contasAbstratas = new ArrayList<>();
		}
	}
	
	@Override
	public void inserir(ContaAbstrata conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public ContaAbstrata procurar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaAbstrata[] listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

}
