/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.persistencia;

/**
 *
 * @author mattheus
 */


import java.io.FileWriter;
import java.io.PrintWriter;

public class ExemploNumerosAleatorios {
  public static void main(String[] args) {
    PrintWriter arquivo = null;
    try {
      FileWriter out = new FileWriter("numeros.txt");
//Para utilizar um arquivo existente sem apagar os dados
//    FileWriter out = new FileWriter("numeros.txt", true);
      arquivo = new PrintWriter(out);
      for (int i = 0; i < 100; i++) {
        arquivo.println(Math.round(Math.random() * 10));
      }
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      arquivo.close();
    }
  }
}