
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(); // instanciando objeto conta 
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo); // instanciando objeto conta
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		
		System.out.println("a primeira conta tem " + primeiraConta.saldo);
		System.out.println("a segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia); // atributos iniciam zerados por default quando instancimamos um objeto
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		
		System.out.println("a agencia da primeira conta é " + primeiraConta.agencia);
	}
}
