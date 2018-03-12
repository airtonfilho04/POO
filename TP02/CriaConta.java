public class CriaConta{
	
	public static void main(String[] args){
		
		Banco bancoDoBrasil;
		bancoDoBrasil = new Banco();

		Conta conta000 = new Conta("000");

		bancoDoBrasil.cadastrar(conta000);
	}
}