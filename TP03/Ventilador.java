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
		isLigado = true;
		this.velocidade = 1;
	}

	public void desligar(){
		isLigado = false;
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
		isRodando = true;
	}

	public void desligarRotacao(){
		isRodando = false;
	}

	public boolean isLigado(){
		return isLigado;
	}

	public boolean isRodando(){
		return isRodando;
	}

	public int getVelocidade(){
		return velocidade;
	}
}