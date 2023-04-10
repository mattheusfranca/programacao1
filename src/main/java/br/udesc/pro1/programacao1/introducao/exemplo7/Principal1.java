/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo7;


import java.util.ArrayList;
/**
 *
 * @author mattheus
 */
public class Principal1 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        
        pessoas.add(new Pessoa("Diogo"));
        pessoas.add(new Pessoa("Guilherme"));
        pessoas.add(new Pessoa("Mateus"));
        pessoas.add(new Pessoa("Lucas"));
        pessoas.add(new Pessoa("Fernando"));
        
        System.out.println(pessoas);
        
         for(int i=0; i<pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }
        
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }
}
