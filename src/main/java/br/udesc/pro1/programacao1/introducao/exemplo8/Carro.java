/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo8;

/**
 *
 * @author mattheus
 */
public class Carro {
    private int velocidade;
  
    public Carro(int velocidade){
        this.velocidade = velocidade;
    }
    
    public Carro(){
        this.velocidade = 0;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void acelera(){
        this.velocidade++;
    }
    
    public void acelera(int v){
        this.velocidade += v; //velociadade = velociadade + v
    }
    
    public String toString(){
        return String.valueOf(velocidade);
    }
}
