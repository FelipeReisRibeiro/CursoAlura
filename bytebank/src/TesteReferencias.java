
public class TesteReferencias {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300; // primeiraConta � uma referencia ao objeto conta
		
		System.out.println("o saldo da primeira conta � " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
	}
}
