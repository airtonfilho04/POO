/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfis;

import java.util.Vector;
import tweets.Tweet;

/**
 *
 * @author airton
 */
public abstract class Perfil {
    private String usuario;
    private Vector<Perfil> seguidos; 
    private Vector<Perfil> seguidores;
    private Vector<Tweet> timeline;
    private boolean ativo;
    
    public  Perfil(String usuario) {
        
    }
    
    public void addSeguido(Perfil usuario) {
        
    }
    
    public void addSeguidor(Perfil usuario) {
        
    }
    
    public void addTweet(Tweet tweet) {
        
    }
    
    public void setUsuario(String usuario) {
        
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public Vector<Perfil> getSeguidos() {
        return this.seguidos;
    } 
    
    public Vector<Perfil> getSeguidores() {
        return this.seguidores;
    } 
    
    public Vector<Tweet> getTimeline() {
        return this.timeline;
    }
    
    public void setAtivo(boolean valor) {
        
    }
    
    public boolean isAtivo() {
        return this.ativo;
    }
}
