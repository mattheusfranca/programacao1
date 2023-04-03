/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.exercicios.revisaojava;

/**
 *
 * @author mattheus
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int numero = 123321;
        int numeroInvertido = inverterNumero(numero);
        System.out.println(numeroInvertido);
        if(numero == numeroInvertido)
            System.out.println("Número é palíndromo");
        else
            System.out.println("Número não é palíndromo");
    }
    
    public static int inverterNumero(int numero){
        int numeroInvertido = 0;
        while(numero > 0){
            int digito = numero % 10;
            //System.out.println(digito);
            numero /= 10;
            //System.out.println(numero);
            numeroInvertido *= 10;
            numeroInvertido += digito;
        }
        return numeroInvertido;
    }
}
