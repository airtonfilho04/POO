package br.ufc.dc.tpi.mytwitter.persistencia.exception;

public class UNCException extends Exception{

	private static final long serialVersionUID = 1L;
	private String usuario;

	public UNCException(String usuario) {
		super("N�o foi possivel atualizar, usuario n�o existente: ");
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public String getMessage() {
		return super.getMessage() +  this.usuario;
	}

}
