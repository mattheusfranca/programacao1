/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo3;

/**
 *
 * @author mattheus
 */
public class Aluno {
    
    private String[] duvidas;
    private String nome;
    private int anoIngresso;
    private int matricula;
    
    public static int geradorMatricula = 0;
    
    private int contadorDuvidas;
    
    public Aluno(String nome, int anoIngresso){
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.matricula = ++geradorMatricula;
        
        duvidas = new String[2];
        contadorDuvidas = 0;
        
    }
    
    public String obterInformacoesAluno(){
        String informacoes = "Nome: " + nome + "\n" +
                "Ano: " + anoIngresso + "\n" +
                "Matrícula:" + matricula;
        return informacoes;
    }
    
    public void adicionarDuvida(String duvida){
        if(contadorDuvidas < 2)
            duvidas[contadorDuvidas++] = duvida;
        else
            System.out.println("O aluno já possui muitas dúvidas!");
    }
    
    public void imprimirDuvidas(){
        for(int i=0; i< contadorDuvidas; i++){
            System.out.println(duvidas[i]);
        }
    }

    
    public static void getCursosDisponiveis(){
        System.out.println("ESO, Contábeis, Civil");
    }
    
}
