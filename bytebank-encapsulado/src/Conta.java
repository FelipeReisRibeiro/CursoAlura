public class Conta { // objeto conta
	private double saldo;  // atributos da conta ou propriedades
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public  Conta(int agencia, int numero) {
		total ++;
		System.out.println("o total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
public void deposita(double valor) {
		this.saldo += this.saldo;
	}

public boolean saca(double valor) {
	if (this.saldo >= valor) {
	this.saldo -= valor;
	return true;
}
	System.out.println("saldo insuficiente");
	return false;
	
	
}


public boolean transfere (double valor, Conta destino) {
	if(this.saldo >= valor) {
		this.saldo -=valor;
		destino.deposita(valor);
		return true;
	}
		return false;
	}

	public double getSaldo() {
		return this.saldo; 
	}
	
	public int getNumero() {
		return this.numero;
		 
	}
	
	public void setNumero(int Numero){
		if(numero <= 0) {
			System.out.println("nao pode valor menor ou igual a zero");
			return;
		}
		this.numero = Numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
}
	
