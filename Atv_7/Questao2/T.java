import java.util.*;
   

public class T implements Comparable<T> {
      private int valor;
  
      T(int valor){
        this.valor = valor;
      }

      public int getValor(){return valor;}
      public void setValor(int valor){this.valor = valor;}
    

      public static void main(String[] args) {
          //VETOR DE INTEIROS
          T [] vetor = new T[10];
          //DECLARAR VALORES
          vetor [0] = new T(9);
          vetor [1] = new T(8);
          vetor [2] = new T(7);
          vetor [3] = new T(6);
          vetor [4] = new T(5);
          vetor [5] = new T(4);
          vetor [6] = new T(3);
          vetor [7] = new T(2);
          vetor [8] = new T(1);
          vetor [9] = new T(0);
        
          //IMPRIME O VETOR ANTES DA ORDENACAO
        
          System.out.print("<");
          for (int i = 0; i < 9; i++)
              System.out.print(vetor[i] + ", ");
          System.out.println(vetor[9]+">");
        
          // ordena vetor
          int i, j;
          T temp = new T(0);
          for (j = 1; j < vetor.length ; j++) {
              temp.setValor(vetor[j].getValor());
              i = j - 1;
              while (i > -1 && vetor[i].compareTo(temp) > 0) {
                  vetor[i+1].setValor(vetor[i].getValor());
                  i -= 1;
              }
              vetor[i+1].setValor(temp.getValor());
          }
        
          //IMPRIME O VETOR APOS ORDENACAO
          System.out.print("<");
          for (int k = 0; k < 9; k++)
              System.out.print(vetor[k].getValor() + ", ");
          System.out.println(vetor[9].getValor()+">");
        
      }
    //IMPLEMENTA O METODO COMPARETO
    @Override
    public int compareTo(T x){
      if(x.valor > this.valor)
        return 1;
      else
        return -1;
    
    }  
}