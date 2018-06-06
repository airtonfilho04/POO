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
	atualizar();
    }
    
    @Override
    public void cadastrar(Perfil usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Perfil buscar(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Perfil usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
