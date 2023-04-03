/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo6;

/**
 * Exemplo demonstrando uso de métodos privados
 * @author mattheus
 */
public class Aluno {
    private String nome;
    private float[] notas;

    public Aluno(String nome) {
        this.nome = nome;
        inicializarNotas();
        
    }
    
    private void inicializarNotas(){
        notas = new float[3];
        for(int i=0; i<3;i++)
            notas[i] = -1;
    }
    private void setNota(float nota, int idNota){
        if(nota >= 0 && nota <=10)
            notas[idNota] = nota;
        else
            System.out.println("Nota inválida");
    }
    
    public void setNotaP1(float nota){
        setNota(nota, 0);
    }
        
    public void setNotaP2(float nota){
        setNota(nota, 1);
    }
    
    public void setNotaTrabalho(float nota){
        setNota(nota, 2);
    }
    
    
    private float getMedia(){
        float media = 0;
        
        for(int i=0; i<3;i++){
            if(notas[i] == -1){
                System.out.println("Faltam notas a serem lançadas");
                return -1;
            }
            media += notas[i];
        }
        
        media/=3;
        return media;
    }
    
    public void getResultado(){
        float media = getMedia();
        if(media > -1){
            System.out.println("Média: " + media);
            
            if(media > 7)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
        }
        
        
    }
}
