/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.polimorfismo;

/**
 *
 * @author mattheus
 */
public class Cachorro extends Animal {
 
    @Override
    public void fala(){
        System.out.println("Au au au");
    }
    
    public void corre(){
        System.out.println("correndo!!");
    }
}
