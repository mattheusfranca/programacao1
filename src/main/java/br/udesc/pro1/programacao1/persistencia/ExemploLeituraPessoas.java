/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.persistencia;

/**
 *
 * @author mattheus
 */


import java.io.FileReader;
import java.util.Scanner;

public class ExemploLeituraPessoas {
  public static void main(String[] args) {
    try (Scanner arquivo = new Scanner(new FileReader("pessoas.txt"))) {
      while (arquivo.hasNext()) {
        String primeiroNome = arquivo.next();
        String ultimoNome = arquivo.next();
        int idade = arquivo.nextInt();
        System.out.println(primeiroNome + " " + ultimoNome + " tem " +
						idade + " anos de idade.");
        
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}