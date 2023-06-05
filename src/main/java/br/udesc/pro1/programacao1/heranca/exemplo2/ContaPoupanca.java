/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo2;

/**
 *
 * @author mattheus
 */
public class ContaPoupanca extends ContaCorrente {
    
    @Override
    public boolean sacar(float valor){
        if(valor > getSaldo()){
            System.out.println("Você não tem saldo suficiente");
            return false;
        }
        else 
            return super.sacar(valor);
    }
}
