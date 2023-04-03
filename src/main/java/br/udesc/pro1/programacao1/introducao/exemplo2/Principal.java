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
public class Principal {
    public static void main(String[] args) {
        
        
        Foto foto = new Foto();
        
        //chamada método público
        foto.aplicarFiltro();
        
        //Não é possível chamar o método abaixo pois é um método privado
        //foto.preProcessamento();
    }
}
