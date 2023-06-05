/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo3.cc;

/**
 *
 * @author mattheus
 */
public class ContaCorrente {
    protected float saldo;
    
    public void saque(float valor){
        saldo -= valor;
    }
}
