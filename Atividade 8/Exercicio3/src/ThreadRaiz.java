import java.util.Random;

class ThreadRaiz implements Runnable{
  
  private int tamanho;
  Random gerador = new Random(System.currentTimeMillis()); 
  
  ThreadRaiz(int potencia){
    tamanho = (int) Math.pow(10, potencia);
  }
  
  public void run() {
	  
	  for(long i = 0; i < tamanho/16; i++)
		  Math.sqrt(gerador.nextDouble());

	  
  } 
  
}