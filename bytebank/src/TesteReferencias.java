
public class TesteReferencias {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300; // primeiraConta é uma referencia ao objeto conta
		
		System.out.println("o saldo da primeira conta é " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
	}
}
