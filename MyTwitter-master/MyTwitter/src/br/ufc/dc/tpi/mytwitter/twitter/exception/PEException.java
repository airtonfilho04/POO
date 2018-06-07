package br.ufc.dc.tpi.mytwitter.twitter.exception;

public class PEException extends Exception{

	private static final long serialVersionUID = 1L;
	private String usuario;
	
	public PEException(String usuario) {
		super("N�o foi possivel criar perfil, usuario j� existente: ");
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public String getMessage() {
		return super.getMessage() +  this.usuario;
	}

	
	
	
	
}
