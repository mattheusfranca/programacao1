/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo1;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Categoria eletronicos = new Categoria("Eletronicos");
        Produto tv = new Produto(1, "TV Samsung", eletronicos);
        
        Categoria categoriaSelecionada = tv.getCategoria();
        
        System.out.println(categoriaSelecionada.getNome());
        System.out.println(tv.getCategoria().getNome());
    }
}
