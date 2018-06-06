/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfis;

/**
 *
 * @author airton
 */
public class PessoaFisica extends Perfil {
    private long cpf;
    
    public PessoaFisica(String usuario) {
        super(usuario);
    }
    
    public void setCpf(long cpf) {
        
    }
    
    public long getCpf() {
        return this.cpf;
    }
}
