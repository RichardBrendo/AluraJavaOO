
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testanto condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("vc ñ tem mais de 18 mas pode entrar acompanhado");
			} else {
				System.out.println("infelizmente vc ñ pode entrar");
			}
		}
	}
}
