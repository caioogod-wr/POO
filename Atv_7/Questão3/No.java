/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7_questão3;

/**
 *
 * @author caioo
 */
public class No <T extends Comparable> {
    private T dado;
    private No<T> esq;
    private No<T> dir;
    
    public No(T dado) {
        this.dado = dado;
        esq = null;
        dir = null;
    }
    
    public T getDado() {
        return dado;
    }
    
    public void setDado(T dado) {
        this.dado = dado;
    }
    
    public void setEsq(T dado) {
        esq = new No(dado);
    }
    
    public void setEsqNull() {
        esq = null;
    }
    
    public void setDirNull() {
        dir = null;
    }
    
    public void setDir(T dado) {
        dir = new No(dado);
    }
    
    public No<T> getEsq() {
        return esq;
    }
    
    public No<T> getDir() {
        return dir;
    }
}
    

