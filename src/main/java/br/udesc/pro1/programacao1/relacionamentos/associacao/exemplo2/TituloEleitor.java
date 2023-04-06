/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo2;

/**
 *
 * @author mattheus
 */
public class TituloEleitor {
    private String numero;
    private int zona;
    private boolean cancelado;
    
    public TituloEleitor(int zona, String numero){
        this.numero = numero;
        this.zona = zona;
        this.cancelado = false;
    }

    public String getNumero() {
        return numero;
    }

    public int getZona() {
        return zona;
    }
    
    public void cancelarTitulo(){
        this.cancelado = true;
    }
    
    public boolean estaCancelado(){
        return this.cancelado;
    }
    
    
    public String getInformacoes(){
        String informacoes = "Zona: " + zona + "\n Número: " + numero + "\n Cancelado: " + cancelado;
        return informacoes;
    }

    @Override
    public String toString() {
        return "TituloEleitor{" + "numero=" + numero + ", zona=" + zona + ", cancelado=" + cancelado + '}';
    }
    
    
    
}
