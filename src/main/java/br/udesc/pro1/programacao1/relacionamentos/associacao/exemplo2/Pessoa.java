/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo2;

/**
 *
 * @author mattheus
 */
public class Pessoa {
    private String nome;
    private TituloEleitor tituloEleitor;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void setTituloEleitor(TituloEleitor tituloEleitor){
        this.tituloEleitor = tituloEleitor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public TituloEleitor getTituloEleitor(){
        return this.tituloEleitor;
    }
}
