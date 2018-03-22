public class Ventilador{

	private boolean isLigado;
	private int velocidade;
	private boolean isRodando;

	public Ventilador(){
		isLigado = false;
		isRodando = false;
		velocidade = 1;
	}

	public void ligar(){
		this.isLigado = true;
		this.velocidade = 1;
	}

	public void desligar(){
		this.isLigado = false;
	}

	public void aumentarVelocidade(){
		if(this.velocidade == 5){
			this.velocidade = 5;
		}
		else{
			this.velocidade += 1; 
		}
	}

	public void diminuirVelocidade(){
		if(this.velocidade == 1){
			this.velocidade = 1;
		}
		else{
			this.velocidade -= 1; 
		}
	}

	public void ligarRotacao(){
		this.isRodando = true;
	}

	public void desligarRotacao(){
		this.isRodando = false;
	}

	public boolean isLigado(){
		return this.isLigado;
	}

	public boolean isRodando(){
		return this.isRodando;
	}

	public int getVelocidade(){
		return this.velocidade;
	}
}