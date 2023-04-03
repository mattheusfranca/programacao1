/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.exercicios.revisaojava;

/**
 *
 * @author mattheus
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
         int valor = 294;
         
         int[] moedas = {100, 50, 25, 10, 5, 1};
         int[] qntMoedas = new int[6];
         
         for(int i=0; i<6; i++){
            qntMoedas[i] = valor / moedas[i];
            if(qntMoedas[i] > 0){
                System.out.println("Moedas: " + qntMoedas[i]);
                valor %= moedas[i];
                System.out.println(valor);
            }  
         }
         
         
    }
    
}
