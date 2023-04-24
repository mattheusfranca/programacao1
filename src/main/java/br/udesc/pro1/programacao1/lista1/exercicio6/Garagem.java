/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio6;

/**
 *
 * @author mattheus
 */
public class Garagem {
    private Carro carro1;
    private Carro carro2;
    //private Carro[] carros;
    //private ArrayList<Carro> carros;
    
    public Garagem(){
        //carro1 = null;
        //carro2 = null;
    }
    
    public Garagem(Carro carro1, Carro carro2){
        this.carro1 = carro1;
        this.carro2 = carro2;
    }
    
    
    public boolean estacionarCarro(Carro novoCarro, int numVaga){
        if(numVaga == 1 || numVaga == 2) {
            //lógica
            if(numVaga == 1){
                //Já existe um carro estacionado na vaga1
                if(carro1 != null)
                    return false;
                carro1 = novoCarro;
                    
            }
            if(numVaga == 2){
                //Já existe um carro estacionado na vaga1
                if(carro2 != null)
                    return false;
                carro2 = novoCarro;
                    
            }
            return true;
        }
        else {
            return false;
        }
    }
        
    
    public void liberarVaga(int numVaga){
        if(numVaga == 1){
            carro1 = null;
        } 
        if(numVaga == 2)
            carro2 = null;
    }
    
    public Carro getCarroVaga(int numVaga){
        if(numVaga == 1)
            return carro1;
        else if(numVaga == 2)
            return carro2;
        else
            return null;
    }

    @Override
    public String toString() {
        String strCarro1 = "";
        if(carro1 == null)
            strCarro1 = "Nenhum carro estacionado";
        else
            strCarro1 = carro1.toString();
        
        String strCarro2 = "";
        if(carro2 == null)
            strCarro2 = "Nenhum carro estacionado";
        else
            strCarro2 = carro2.toString();
        return "Garagem{" + "vaga1=" + strCarro1 + ", vaga2=" + strCarro2 + '}';
    }
    
    
}
