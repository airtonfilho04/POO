public class VentiladorTeste{

	public void testeLigar(){
		Ventilador vent = new Ventilador();
		vent.ligar();
		if(vent.isLigado() == true){
			System.out.println("testeLigar passou!");
		}
		else {
			System.out.println("testeLigar falhou!");
		}
	}

	public void testeDesligar(){
		Ventilador vent = new Ventilador();
		vent.desligar();
		if(vent.isLigado() == false){
			System.out.println("testeDesligar passou!");
		}
		else {
			System.out.println("testeDesligar falhou!");
		}
	}

	public void testeAumentarVelocidade(){
		Ventilador vent = new Ventilador();
		vent.aumentarVelocidade();
		if(vent.getVelocidade() == 2){
			System.out.println("testeAumentarVelocidade passou!");
		}
		else {
			System.out.println("testeAumentarVelocidade falhou!");
		}
	}

	public void testeDiminuirVelocidade(){
		Ventilador vent = new Ventilador();
		vent.aumentarVelocidade();
		if(vent.getVelocidade() == 1){
			System.out.println("testeDiminuirVelocidade passou!");
		}
		else {
			System.out.println("testeDiminuirVelocidade falhou!");
		}
	}

	public void testeLigarRotacao(){
		Ventilador vent = new Ventilador();
		vent.ligarRotacao();
		if(vent.isRodando() == true){
			System.out.println("testeLigarRotacao passou!");
		}
		else {
			System.out.println("testeLigarRotacao falhou!");
		}
	}

	public void testeDesligarRotacao(){
		Ventilador vent = new Ventilador();
		vent.desligarRotacao();
		if(vent.isRodando() == false){
			System.out.println("testeDesligarRotacao passou!");
		}
		else {
			System.out.println("testeDesligarRotacao falhou!");
		}
	}
}