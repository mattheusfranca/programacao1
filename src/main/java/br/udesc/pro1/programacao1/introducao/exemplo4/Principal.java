/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo4;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Circulo c = new Circulo("verde", 6);
        c.setX(10);
        c.setY(4);
        
        System.out.println(c.apresentar());
        c.desenhar();
    }
}
