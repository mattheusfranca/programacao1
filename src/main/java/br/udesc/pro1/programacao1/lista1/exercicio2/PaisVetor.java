/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio2;

/**
 * 
 * @author mattheus
 */
public class PaisVetor {

    private String nome;
    private String capital;
    private int dimensao;
    private PaisVetor[] fronteiras;
    private final int NUMERO_MAX_FRONTEIRAS = 2;
    private int contadorFronteiras;

    public PaisVetor(String nome, String capital, int dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteiras = new PaisVetor[NUMERO_MAX_FRONTEIRAS];
        this.contadorFronteiras = 0;
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

    public boolean equals(PaisVetor outro) {
        if (outro == null) {
            return false;
        }
        return this.nome.equals(outro.getNome()) && this.capital.equals(outro.getCapital());
    }

    /**
     *
     * @param fronteira1 país que faz fronteira
     * @param fronteira2 país que faz fronteira
     * @return false se houver algum problema para adicionar qualque 1 das duas
     * fronteiras
     */
    public boolean addFronteiras(PaisVetor fronteira1, PaisVetor fronteira2) {
        return addFronteira(fronteira1) && addFronteira(fronteira2);
    }

    private boolean addFronteira(PaisVetor fronteira) {
        //se a fronteira for igual ao país
        if (this.equals(fronteira)) {
            return false;
        } 
        else {
            //Não existe posição disponível para adicionar uma fronteira
            if (contadorFronteiras == NUMERO_MAX_FRONTEIRAS) {
                return false;
            } //É possível adicionar a fronteira
            else {
                this.fronteiras[contadorFronteiras] = fronteira;
                contadorFronteiras++;
                return true;
            }
        }

    }
    
    
    @Override
    public String toString() {
        String stringFronteiras = "";
        for(int i=0; i<contadorFronteiras; i++)
            stringFronteiras += fronteiras[i].getNome() + ", ";
            
        return "PaisVetor{" + "nome=" + nome + ", capital=" + capital + ", dimensao=" + dimensao + ", fronteiras=" + stringFronteiras + '}';
    } 

}
