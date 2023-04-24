/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio6;

import java.util.ArrayList;

/**
 *
 * @author mattheus
 */
public class GaragemArray {
    private final int TAM = 10;
    private ArrayList<Carro> carros;

    
    public GaragemArray(){
        carros = new ArrayList();
        for(int i=0; i<TAM; i++){
            carros.add(null);
        }
    }
    
    public GaragemArray(Carro carro1, Carro carro2){
        carros = new ArrayList();
        carros.add(0, carro1);
        carros.add(1, carro2);
    }
    
     public boolean estacionarCarro(Carro novoCarro, int numVaga){
         if(numVaga > TAM-1) //Só teremos 10 vagas
             return false;
         if(carros.get(numVaga) != null)
            return false;
         
         carros.set(numVaga, novoCarro);
         return true;
     }
     
     
     public void liberarVaga(int numVaga){
         if(numVaga < TAM){
             carros.set(numVaga, null);
         }
     }
     
     public Carro getCarroVaga(int numVaga){
         if(numVaga < TAM){
            return carros.get(numVaga);
         }
         return null;
     }

    @Override
    public String toString() {
        return "GaragemArray{carros=" + carros + '}';
    }
    
    public void imprimirCarros(){
        for(int i=0; i<TAM; i++){
            System.out.println("Vaga: " + i + " - " + carros.get(i));
        }
    }
     
     
}
