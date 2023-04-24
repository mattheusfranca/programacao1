/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio6;

/**
 *
 * @author mattheus
 */
public class Carro {
    private String cor;
    private String placa;
    private String proprietario;

    public Carro(String cor, String placa, String proprietario) {
        this.cor = cor;
        this.placa = placa;
        this.proprietario = proprietario;
    }

    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", placa=" + placa + ", proprietario=" + proprietario + '}';
    }
    
    
}
