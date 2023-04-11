/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio2;

import java.util.ArrayList;

/**
 *
 * @author mattheus
 */
public class PaisArrayList {
    private String nome;
    private String capital;
    private int dimensao;
    private ArrayList<PaisArrayList> fronteiras;
    private final int NUMERO_MAX_FRONTEIRAS = 2;
    
    public PaisArrayList(String nome, String capital, int dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList();
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

    public boolean equals(PaisArrayList outro) {
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
    public boolean addFronteiras(PaisArrayList fronteira1, PaisArrayList fronteira2) {
        return addFronteira(fronteira1) && addFronteira(fronteira2);
    }

    private boolean addFronteira(PaisArrayList fronteira) {
        //se a fronteira for igual ao país
        if (this.equals(fronteira)) {
            return false;
        } 
        else {
            //Não existe posição disponível para adicionar uma fronteira
            if (fronteiras.size() == NUMERO_MAX_FRONTEIRAS) {
                return false;
            } //É possível adicionar a fronteira
            else {
                this.fronteiras.add(fronteira);
                return true;
            }
        }
    }

    @Override
    public String toString() {
        String stringFronteiras = "";
        for(PaisArrayList f: fronteiras)
            stringFronteiras += f.getNome() + ", ";
            
        return "PaisArrayList{" + "nome=" + nome + ", capital=" + capital + ", dimensao=" + dimensao + ", fronteiras=" + stringFronteiras + '}';
    } 
    
}
