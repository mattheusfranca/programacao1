/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo2;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa mattheus = new Pessoa("Mattheus");
        
        TituloEleitor tituloEleitorIlheus = new TituloEleitor(80, "12345");
        
        //2006
        mattheus.setTituloEleitor(tituloEleitorIlheus);       
        System.out.println(mattheus.getTituloEleitor());
        
        //2019
        //mattheus.getTituloEleitor().cancelarTitulo();
        tituloEleitorIlheus.cancelarTitulo();
        System.out.println(mattheus.getTituloEleitor());
        
        if(mattheus.getTituloEleitor().estaCancelado()){
            TituloEleitor tituloEleitorIndaial = new TituloEleitor(90, "456");
            mattheus.setTituloEleitor(tituloEleitorIndaial);
        }
        else {
            System.out.println("Possui título ativo");
        }
        
        System.out.println(mattheus.getTituloEleitor());
    }
}
