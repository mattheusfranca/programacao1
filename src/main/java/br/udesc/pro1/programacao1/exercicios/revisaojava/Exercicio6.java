/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.exercicios.revisaojava;

import java.util.Scanner;

/**
 *
 * @author mattheus
 */
public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        float resultado = 0;
        while(opcao != 6){
            float num;
            switch (opcao) {
                case 1:
                    num = teclado.nextFloat();
                    resultado = somar(resultado, num);
                    break;
                case 2:
                    num = teclado.nextFloat();
                    resultado = subtrair(resultado, num);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public static float somar(float num1, float num2){
        return num1 + num2;
    }
    
    public static float subtrair(float num1, float num2){
        return num1 - num2;
    }
    
    public static float dividir(float num1, float num2){
        return num1 / num2;
    }
}
