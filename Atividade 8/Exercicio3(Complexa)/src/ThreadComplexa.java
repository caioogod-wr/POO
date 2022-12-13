import java.util.Random;

public class ThreadComplexa implements Runnable{
	 private int tamanho;
	  private int valor;
	  
	  Random gerador = new Random(System.currentTimeMillis()); 
	  
	  ThreadComplexa(int potencia){
	    tamanho = (int) Math.pow(10, potencia);
	    valor = 0;
	  }
	  
	  public void run() {
		  for(long i = 0; i < tamanho/16; i++) {
			  valor = (int) (Math.pow(2, gerador.nextInt())+ Math.cos(gerador.nextInt()));
		}

		  
	  } 
	  public int getValor() {
		  return valor;
	  }
}
