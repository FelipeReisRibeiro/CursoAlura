
public class TestaConversao {
 public static void main(String[]args) {
	 
	 double salario = 1270.50;
	 int valor = (int)salario; //casting (remoldar uma instrução ou fazer uma conversão)
	 System.out.println(valor);
	 
	 int x = 2000000; //(numero muito grande para nurmeo utilizar long + l no final do numero)
	 long numeroGrande = 20000000000000000L; // numeros grandes
	 short valorPequeno = 2131; // numeros pequenos
	 byte b = 127; // numeros muito pequenos
	 float pontoflutuante = 3.14f; // (mesmo que double mas para numeros pequenos)
	 double valor1 = 0.2;
	 double valor2 = 0.1;
	 double total = valor1 + valor2;
	 System.out.println(total);
 }
}
