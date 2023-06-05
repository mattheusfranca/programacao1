/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo2;

/**
 *
 * @author mattheus
 */
public class ContaCorrente {
    private float saldo;
    
    public boolean sacar(float valor){
        saldo -= valor;
        return true;
    }
    
    public void depositar(float valor){
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }

    
    @Override
    public String toString() {
        return "ContaCorrente{" + "saldo=" + saldo + '}';
    }
    
    
}
