/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio6;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Carro bmw = new Carro("Azul", "JLM6432", "Mattheus");
        Carro fusca = new Carro("Verde", "MMG6789", "Marcelo");
        
        System.out.println(bmw);
        System.out.println(fusca);
        
        Garagem g1 = new Garagem();
        
        System.out.println(g1);
        
        g1.estacionarCarro(fusca, 1);
        
        System.out.println(g1);
        
        
        if(g1.estacionarCarro(bmw, 1))
            System.out.println(g1);
        else
            System.out.println("Não foi possível estacionar o carro");
        
        g1.estacionarCarro(bmw, 2);
        
        System.out.println(g1);
        
        g1.liberarVaga(1);
        g1.liberarVaga(2);
        
        System.out.println(g1);
    }
   
}
