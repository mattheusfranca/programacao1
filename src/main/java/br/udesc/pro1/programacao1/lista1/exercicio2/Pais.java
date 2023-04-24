/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio2;


/**
 *
 * @author mattheus
 */
public class Pais {

    private String nome;
    private String capital;
    private int dimensao;
    private Pais fronteira1;
    private Pais fronteira2;
    
    
    public Pais(String nome, String capital, int dimensao){
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public int getDimensao() {
        return dimensao;
    }
    
    
    public boolean equals(Pais outro) {
        if (outro == null) {
            return false;
        }
        return this.nome.equals(outro.getNome()) && this.capital.equals(outro.getCapital());
    }
    
    /**
     * Este método vai adicionar as fronteiras ao país
     * @param fronteira1 país que faz fronteira1
     * @param fronteira2 país que faz fronteira2
     * @return false se houver algum problema para adicionar qualque 1 das duas fronteiras
     */
    public boolean addFronteiras(Pais fronteira1, Pais fronteira2){
        return addFronteira1(fronteira1) && addFronteira2(fronteira2);
    }

    private boolean addFronteira1(Pais fronteira1){
        //se a fronteira for igual ao país
        if(this.equals(fronteira1))
            return false;
        //frointeira é diferente do país
        else {
            //se a fronteira já foi adicionada então fronteira1 não será nulo
            if(this.fronteira1 != null)
                return false;
            //nenhuma país foi atribuído a fronteira1, logo é possível adicionar
            else {
                this.fronteira1 = fronteira1;
                return true;
            }
        }
    }
    
    
    private boolean addFronteira2(Pais fronteira2){
        //se a fronteira for igual ao país
        if(this.equals(fronteira2))
            return false;
        //frointeira é diferente do país
        else {
            //se a fronteira já foi adicionada então fronteira1 não será nulo
            if(this.fronteira2 != null)
                return false;
            //nenhuma país foi atribuído a fronteira1, logo é possível adicionar
            else {
                this.fronteira2 = fronteira2;
                return true;
            }
        }
    }

    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + ", capital=" + capital + ", dimensao=" + dimensao + ", "
                + "fronteira1=" + fronteira1.getNome() + ", fronteira2=" + fronteira2.getNome() + '}';
    }
    
    

}
