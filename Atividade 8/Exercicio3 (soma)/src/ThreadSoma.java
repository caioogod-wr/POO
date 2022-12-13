import java.util.Random;

public class ThreadSoma implements Runnable {
	  private int tamanho;
	  private int valor;
	  
	  Random gerador = new Random(System.currentTimeMillis()); 
	  
	  ThreadSoma(int potencia){
	    tamanho = (int) Math.pow(10, potencia);
	    valor = 0;
	  }
	  
	  public void run() {
		  for(long i = 0; i < tamanho/16; i++) {
			  valor = 1 + gerador.nextInt();
		}

		  
	  } 
	  public int getValor() {
		  return valor;
	  }
	  
}
