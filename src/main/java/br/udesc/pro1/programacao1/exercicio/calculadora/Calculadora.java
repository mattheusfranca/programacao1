/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.exercicio.calculadora;

/**
 *
 * @author mattheus
 */
public class Calculadora {
    private float total;
    
    public Calculadora(){
        this.total = 0.0f;
    }
    
    public void somar(float valor){
        this.total += valor;
    }
    
    public void subtrair(float valor){
        this.total -= valor;
    }
    
    public void multiplicar(float valor){
        this.total *= valor;
    }
    
    public void dividir(float valor){
        if(valor == 0)
            System.out.println("Não é possível realizar a divisão");
        else
            this.total /= valor;
    }
    
    public void limparMemoria(){
        this.total = 0;
    }
    
    public void imprimirValor(){
        System.out.println(total);
    }
}
