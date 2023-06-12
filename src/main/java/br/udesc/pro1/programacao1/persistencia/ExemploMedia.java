/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.persistencia;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ExemploMedia {
  public static void main(String[] args) {
    Scanner arquivo = null;
    try {
      FileReader in = new FileReader("numeros.txt");
      arquivo = new Scanner(in);
      int soma = 0;
      for (int i = 0; i < 100; i++) {
        soma += arquivo.nextInt();
      }
      System.out.println("Média: " + soma / 100f);
    } catch (Exception e) {
      System.out.println("Arquivo não encontrado");
    } finally {
        if(arquivo != null)
            arquivo.close();
    }
  }
}
