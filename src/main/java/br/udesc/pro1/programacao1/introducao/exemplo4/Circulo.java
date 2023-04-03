/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo4;

/**
 *
 * @author mattheus
 */
public class Circulo {
    private String cor;
    private int diametro;
    private int x;
    private int y;
    
    public Circulo(String cor, int diametro){
        this.cor = cor;
        this.diametro = diametro;
    }

    public String getCor() {
        return cor;
    }

    public int getDiametro() {
        return diametro;
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    public void moverHorizontal(int distancia){
        this.x += distancia;
    }
    
    public void moverVertical(int distancia){
        this.y += distancia;
    }
    
    public void desenhar(){
        //codigo para desenhar no console ou na tela
        for(int i=0; i<this.y; i++)
            System.out.println();
        
        
        for(int i=0; i<this.x; i++)
            System.out.print(" ");
        
        for(int i=0; i<this.diametro;i++)
            System.out.print("*");
    }
    
    public void apagar(){
        
    }

    public String apresentar() {
        return "Circulo{" + "cor=" + cor + ", diametro=" + diametro + ", x=" + x + ", y=" + y + '}';
    }

    
}
