/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

import java.util.Scanner;

/**
 *
 * @author caioo
 */
public class Generic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Q1<Integer> algo = new Q1<Integer>(a, b);
        System.out.println("Max: " + algo.getMax() + "\nMin: " + algo.getMin() + "\ntoString: " + algo.toString());
    }
    
}

