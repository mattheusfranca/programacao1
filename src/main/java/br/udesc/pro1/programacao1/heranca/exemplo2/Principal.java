/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo2;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        
        contaCorrente.depositar(100);
        contaCorrente.sacar(150);
        
        System.out.println(contaCorrente);
    }
}
