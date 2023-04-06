/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo5;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa(1990);
        maria.setNome("Maria");
        maria.setPeso(60.5);
        maria.setAltura(1.75);
        
        
        Pessoa joao = new Pessoa(1985);
        
        joao.setNome("João");
        joao.setPeso(80);
        joao.setAltura(1.85);
        
        maria.casar(joao);
        if(maria.ehCasado())
            System.out.println("Maria é casada");
        else
            System.out.println("Não é casada");

        
        if(joao.ehCasado())
            System.out.println("João é casado");
        else
            System.out.println("Não é casado");
        

        
        Pessoa jose = new Pessoa(1981);
        jose.setNome("Jose");
        
        maria.conjuge = jose;
        
        
        System.out.println(maria);
        
        System.out.println(joao);
        
        System.out.println(jose);
        
    }
}
