public class Conta { // objeto conta
	double saldo;  // atributos da conta ou propriedades
	int agencia;
	int numero;
	String titular;
	String cpf;
	String profissao;
	
public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

public boolean saca(double valor) {
	if (this.saldo >= valor) {
	this.saldo = this.saldo - valor;
	return true;
}else {
	System.out.println("saldo insuficiente");
	return false;
	
}
}

public boolean transfere (double valor, Conta destino) {
	if(this.saldo >= valor) {
		this.saldo -=valor;
		destino.deposita(valor);
		return true;
	}else {
		return false;
	}
}
	}
