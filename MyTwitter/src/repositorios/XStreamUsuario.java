/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import perfis.Perfil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Vector;
import com.thoughtworks.xstream.XStream;
/**
 *
 * @author airton
 */
public class XStreamUsuario implements IRepositorioUsuario {

    private static String CAMINHO_ARQUIVO = "xstreamUsuarios.xml";
    private XStream xstream;
    private Vector<Perfil> usuarios;
    
    public XStreamUsuario() {
	xstream = new XStream();
	recuperar();
    }
    
    @Override
    public void cadastrar(Perfil usuario) {
        
    }

    @Override
    public Perfil buscar(String usuario) {
        return usuarios;
    }

    @Override
    public void atualizar(Perfil usuario) {
        salvar();
    }
    
    private void recuperar() {
	File file = new File(CAMINHO_ARQUIVO);
	if(!file.exists()) {
            usuarios = new Vector<>();
            return;
	}
	usuarios = (Vector<Perfil>)xstream.fromXML(file);
	}
	
	private void salvar() {
		try {
			xstream.toXML(usuarios, new FileOutputStream(CAMINHO_ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
