package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "Alura ";
		String outroVazio = vazio.trim(); //.trim tira os espaços
	
		
		System.out.println(vazio.isEmpty());// perguntando se vazio é vazio
		//System = classe, java.lang, acesso publuco(public
		//out = atributo, publico, referencia, static
		//println = metodo, publico, nao static, sobrecarga, nao joga excecoes do tipo checked
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		int a = 3;
		String nome = "Alura";  //object literal
		//String outros = new String ("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i< nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
//		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
//		
//		char c = nome.charAt(2);
//		System.out.println(c);
//		
//		char c = 'A';
//		
//		String outra = nome.replace("A", "a");
	//	nome.toLowerCase();
//		System.out.println(nome);
//		System.out.println(outra);
	}

}
