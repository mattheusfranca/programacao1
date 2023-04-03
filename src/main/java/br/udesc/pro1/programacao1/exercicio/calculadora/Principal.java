/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.exercicio.calculadora;

/**
 *
 * @author mattheus
 */
public class Principal {
    
    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();
        
        minhaCalculadora.somar(100);
        minhaCalculadora.subtrair(50);
        minhaCalculadora.multiplicar(3);
        minhaCalculadora.dividir(2);
        minhaCalculadora.imprimirValor();
        minhaCalculadora.limparMemoria();
        minhaCalculadora.imprimirValor();
    }
    
}
