
public class TestaMetodo {

	public static void main(String[] args) {
	
	Conta contaDoPaulo = new Conta();
	contaDoPaulo.saldo = 100;
	System.out.println("saldo conta do paulo " + contaDoPaulo.saldo);
	
	contaDoPaulo.deposita(50);
	System.out.println("saldo conta do paulo " + contaDoPaulo.saldo);
	
	contaDoPaulo.saca(20);
	System.out.println("saldo conta do paulo " + contaDoPaulo.saldo);
	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	if(contaDaMarcela.transfere(300, contaDoPaulo)) {
		System.out.println("trasnferencia realizada com sucesso");
	}else {
		System.out.println("saldo insuficiente");
	}
	System.out.println("saldo conta da Marcela " +contaDaMarcela.saldo);
	System.out.println("saldo conta do paulo " + contaDoPaulo.saldo);

	contaDoPaulo.titular = "Paulo Silveira";
	System.out.println(contaDoPaulo.titular);
	
	}			
}


