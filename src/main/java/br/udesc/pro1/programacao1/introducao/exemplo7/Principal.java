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
public class Principal {
    public static void main(String[] args) {
        
        ArrayList<String> alunos = new ArrayList();
        alunos.add("João Victor");
        alunos.add("Victor");
        alunos.add("Andre");
        alunos.add("Maria Eduarda");
        
        System.out.println(alunos);
        
        for(int i=0; i<alunos.size(); i++){
            System.out.println(alunos.get(i));
        }
        
        for(String a : alunos){
            System.out.println(a);
        }
    }
}
