
public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			
		} catch (MinhaExcecao ex) {
			System.out.println("tratamento");
		}
		c.deposita();
	}
}
