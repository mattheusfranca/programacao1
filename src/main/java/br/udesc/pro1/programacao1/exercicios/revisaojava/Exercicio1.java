package br.udesc.pro1.programacao1.exercicios.revisaojava;

import java.util.Scanner;

/**
 *
 * @author mattheus
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        float altura;
        float peso;
        
        System.out.println("Digite o nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Digite a idade: ");
        idade = teclado.nextInt();
        
        System.out.println("Digite a altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("Digite o peso: ");
        peso = teclado.nextFloat();
        
        String resultado = getInformacoes(nome, idade, altura, peso);
        
        System.out.println(resultado);
    }
    
    public static String getInformacoes(String nome, int idade, float altura, float peso){
        String resultado = "Nome: " + nome + "\n"
                        + "Idade:" + idade + "\n"
                        + "Altura:" + altura + "\n"
                        + "Peso:" + peso + "\n";
        
        return resultado;
    }
    
    
}
