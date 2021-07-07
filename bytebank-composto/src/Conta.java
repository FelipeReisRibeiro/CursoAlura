public class Conta { // objeto conta
	double saldo;  // atributos da conta ou propriedades
	int agencia;
	int numero;
	Cliente titular = new Cliente();
	
	
	
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

}
	
