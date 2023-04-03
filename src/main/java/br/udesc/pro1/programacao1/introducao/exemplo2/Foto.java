/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo2;

/**
 *
 * @author mattheus
 */

//exemplo para demonstrar uso de métodos públicos e privados
public class Foto {
    
    //método público acessível
    public void aplicarFiltro(){
        preProcessamento();
        redimensionarImagem();
        equalizardoCor();
        gerarFotoFinal();
    }
    
    
    //métodos privados 
    private void preProcessamento(){
        System.out.println("Pré processando a foto...");
    }
    
    private void redimensionarImagem(){
        System.out.println("Redimensionando foto...");
    }
    private void equalizardoCor(){
        System.out.println("Equalizando cor...");
    }
    private void gerarFotoFinal(){
        System.out.println("Gerando foto final...");
    }
    
}
