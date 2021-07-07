
public class TestaValores {
public static void main(String[] args) {
	int total = 0;
	Conta conta = new Conta(1337, 24226);
	
	
	System.out.println(conta.getAgencia());
	
	conta.setAgencia(12322434);
	
	Conta conta2 = new Conta(1337, 24566);
	
	Conta conta3 = new Conta(1337, 23466);
	
	
	System.out.println(Conta.getTotal());
			
}
}
