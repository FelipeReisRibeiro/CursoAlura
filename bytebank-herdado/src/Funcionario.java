// nao pode instaciar e criar objetos desta classe por que é abstrata
public abstract class Funcionario {

			
private String nome;
private String cpf;
protected double salario;


// metodo sem corpo, nao ha implementação neste momento so nos metodos filhos
public abstract double getBonificacao();



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}


}
