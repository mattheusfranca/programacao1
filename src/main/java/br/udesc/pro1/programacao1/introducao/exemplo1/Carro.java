/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo1;

/**
 *
 * @author mattheus
 */
public class Carro {
    private int velocidade;
    
    public Carro(int velocidade){
        this.velocidade = velocidade;
    }
    
    public void acelera(){
        velocidade++;
    }
    
    public void freia(){
        velocidade--;
    }
    
    public void imprimirVelocidade(){
        System.out.println(velocidade);
    }
    
}
