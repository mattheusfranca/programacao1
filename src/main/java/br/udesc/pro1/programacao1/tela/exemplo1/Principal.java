/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.tela.exemplo1;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        TelaCadastrarPessoa.inicializarPessoas();
        TelaCadastrarPessoa telaCadastrarPessoa = new TelaCadastrarPessoa();
        telaCadastrarPessoa.setVisible(true);
    }
}
