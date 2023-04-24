/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo8;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro(70);
        
        Carro c3 = new Carro(82);
        
        c1.acelera();
        c1.acelera(30);
        int v1 = c1.getVelocidade();
        int v2 = c2.getVelocidade();
        int v3 = c3.getVelocidade();
        
        float media = (v1 + v2 + v3) / (float) 3;  //casting
        
        System.out.println("Media: " + media);
        System.out.println(c1);
        System.out.println(c2);
    }
}
