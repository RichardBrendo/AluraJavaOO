
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testanto condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente vc � pode entrar");
		}
		
		
	}
}
