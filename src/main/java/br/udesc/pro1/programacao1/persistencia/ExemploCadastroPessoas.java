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
import java.util.Scanner;

public class ExemploCadastroPessoas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    try (PrintWriter arquivo = new PrintWriter(new FileWriter("pessoas.txt", true))) {
      System.out.println("Primeiro nome: ");
      arquivo.print(teclado.next() + " ");
      System.out.println("Último nome: ");
      arquivo.print(teclado.next() + " ");
      System.out.println("Idade: ");
      arquivo.print(teclado.nextInt());
      arquivo.println();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}