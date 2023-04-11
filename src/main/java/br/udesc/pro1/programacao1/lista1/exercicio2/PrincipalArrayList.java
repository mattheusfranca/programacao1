/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio2;

/**
 *
 * @author mattheus
 */
public class PrincipalArrayList {
    public static void main(String[] args) {
        PaisArrayList brasil = new PaisArrayList("Brasil", "Brasília", 8516000);
        PaisArrayList argentina = new PaisArrayList("Argentina", "Buenos Aires", 2780000);
        PaisArrayList urugruai = new PaisArrayList("Uruguai", "Montevieu", 176215);
        
        
        if(brasil.addFronteiras(argentina, urugruai)){
            //Vai entrar neste fluxo pois não possui nenhuma fronteira adicionada
            System.out.println("Fronteiras adicionadas com sucesso");
            System.out.println(brasil);
        }
        else {
            System.out.println("Falha em adicionar fronteiras");
            System.out.println(brasil);
        }
        
        PaisArrayList chile = new PaisArrayList("Chile", "Santiago", 756950);
        PaisArrayList colombia = new PaisArrayList("Colômbia", "Bogotá", 1139000);
        
        
        if(brasil.addFronteiras(chile, colombia)){
            System.out.println("Fronteiras adicionadas com sucesso");
            System.out.println(brasil);
        }
        else {
            //Vai entrar neste fluxo pois já possui duas fronteiras adicionadas
            System.out.println("Falha ao adicionar fronteiras");
            System.out.println(brasil);
        }
    }
}
