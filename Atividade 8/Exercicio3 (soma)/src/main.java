import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) throws IOException {
		
	    long tempoInicial;
	    double tempoTotal = 0 ; 
		Scanner in = new Scanner( System.in );
	    int nCores = Runtime.getRuntime().availableProcessors();
	    Random gerador = new Random(System.currentTimeMillis()); 
	    int valor = 0;
	    
	    System.out.println("Numero de nucleos:" + nCores); //na maquina utilizada para realizar o exercicio: numCores == 16
	    System.out.print("Digite a potencia: ");
	    
	    int potencia = in.nextInt();

	    int tamanho = (int) Math.pow(10, potencia);

	    
	    Thread t1 = new Thread(new ThreadSoma(potencia));
	    Thread t2 = new Thread(new ThreadSoma(potencia)); 
	    Thread t3 = new Thread(new ThreadSoma(potencia)); 
	    Thread t4 = new Thread(new ThreadSoma(potencia)); 
	    Thread t5 = new Thread(new ThreadSoma(potencia)); 
	    Thread t6 = new Thread(new ThreadSoma(potencia)); 
	    Thread t7 = new Thread(new ThreadSoma(potencia)); 
	    Thread t8 = new Thread(new ThreadSoma(potencia)); 
	    Thread t9 = new Thread(new ThreadSoma(potencia)); 
	    Thread t10 = new Thread(new ThreadSoma(potencia)); 
	    Thread t11 = new Thread(new ThreadSoma(potencia)); 
	    Thread t12 = new Thread(new ThreadSoma(potencia)); 
	    Thread t13 = new Thread(new ThreadSoma(potencia));
	    Thread t14 = new Thread(new ThreadSoma(potencia));
	    Thread t15 = new Thread(new ThreadSoma(potencia));
	    Thread t16 = new Thread(new ThreadSoma(potencia)); 
	    

	    

	    tempoInicial = System.currentTimeMillis();
	    
	    //CALCULAR METODO COMUM
	    for(int k = 0; k < 10 ; k++) {
	    	
	    	tempoInicial = System.currentTimeMillis();
	    	
	    	for (long i = 0; i < tamanho; i++) {
	    		valor = 1 + gerador.nextInt();
	    	}
	    	tempoTotal= tempoTotal + (System.currentTimeMillis() - tempoInicial) / 1000.0;
	    }
	    
	    System.out.println("Tempo sem threads: " + tempoTotal);
	    
	    
	    tempoInicial = System.currentTimeMillis();
	    tempoTotal = 0;
	    
	    //CALCULAR COM  THREADS
	    for(int k=0; k < 10; k++) {
	    	
	    	t1.run();
	    	t2.run();
	    	t3.run();
	    	t4.run();
	    	t5.run();
	    	t6.run();
	    	t7.run();
	    	t8.run();
	    	t9.run();
	    	t10.run();
	    	t11.run();
	    	t12.run();
	    	t13.run();
	    	t14.run();
	    	t15.run();
	    	t16.run();
	    	
	    	tempoTotal = tempoTotal  + (System.currentTimeMillis() - tempoInicial) / 1000.0;
	    }
	    
	    System.out.println("Tempo com Thread: "+ tempoTotal);
	  }
	
}
