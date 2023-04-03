/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo1;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Carro bmw = null;
        //bmw = new Carro(10);
        
        Carro fusca;
        fusca = new Carro(2);
        
        bmw.acelera();
        bmw.acelera();
        bmw.acelera();
        bmw.acelera();
        bmw.acelera();
        
        
        fusca.acelera();
        
        bmw.imprimirVelocidade();
        fusca.imprimirVelocidade();
        
        
    }
}
