
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Felipe");
		g1.setCpf("3113635586-3");
		g1.setSalario(3000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(22222);
		boolean autentica = g1.autentica(22222);
		System.out.println(autentica);
		System.out.println(g1.getBonificacao()); 
	}
	
}