
public class TestaGetSet {
	
public static void main(String[] args) {
	Conta conta = new Conta(1337, 24226);
	System.out.println(conta.getNumero()); 
	
	Cliente paulo = new Cliente();
	paulo.setNome("Paulo Silveira");
	conta.setTitular(paulo);
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("Programador");
	// o mesmo so que em duas linhas abaixo
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("Programador");
}
}
