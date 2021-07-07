
public class TestaCondicional2 {

public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {   // usando verdadeiro ou falso (idade maior que 18 e acompanhado verdadeiro)
	 // if (idade >= 18 || quantidadePessoas >= 2) // || condicional ou (idade igual a 18 ou quantidade de pessoas igual maior que 2)
	 // if (idade >= 18 && qauntidadePessoas >= 2) // && condicional e (idade igual a 18 e pessoas igual maior que 2)
			System.out.println("voce é maior de idade");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("voce é menor de idade volte com um acompanhante");
		}
	}
}

