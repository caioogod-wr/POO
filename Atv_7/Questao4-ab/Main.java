import java.util.*;

public class Main {

    public static void main(String[] args) {

        int tamanhoP = (int) Math.pow(10, 7);
        int tamanhoG = (int) Math.pow(10, 8);
        
        // cria estruturas
        ArrayList<Double> a = new ArrayList();
        Double[] b = new Double[tamanhoP];
        
        // auxiliares
        Random gerador = new Random(System.currentTimeMillis()); // inicializa a semente de geracao de numeros (pseudo)aleatorios
      
        long tempoInicial;
        
        // gera numeros aleatorios e os guarda nas estruturas
        for (int i = 0; i < tamanhoG; i++) {
            a.add(gerador.nextDouble()); // insere numero aleatorio entre 0 e 1 no final do ArrayList
        }
      
        tempoInicial = System.currentTimeMillis();
        // seleciona os valores para a comparacao
        for (int i = 0; i < tamanhoP; i++)
            b[i] = a.get((int) (gerador.nextDouble() * tamanhoP));
        
        System.out.println("Tempo de busca no ArrayList:" + (System.currentTimeMillis() - tempoInicial) / 1000.0 );
      
        tempoInicial = System.currentTimeMillis();
      
        //remove e cria um novo dado
        for (int i = 0; i < tamanhoP; i++){
          a.remove((int) (gerador.nextDouble() * tamanhoP));
          a.add(gerador.nextDouble());
        }
      
        System.out.println("Tempo de remocao no ArrayList:" + (System.currentTimeMillis() - tempoInicial) / 1000.0 );
    }

    
}