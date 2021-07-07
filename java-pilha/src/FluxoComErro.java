public class FluxoComErro {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        metodo1();
       }catch(ArithmeticException | NullPointerException | MinhaExcecao ex ) {
           System.out.println("Arithmetic Excepition");
           String msg = ex.getMessage();
           System.out.println("Mensagem " + msg);
           ex.printStackTrace(); //imprime a pilha de erro da exception
       
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
        
    }
    private static void metodo2() {
    	System.out.println("ini do metodo 2");
    	metodo2(); // erro StackOverflowError
       System.out.println("fim do metodo 2");//erro loop infinito
    }
    }

