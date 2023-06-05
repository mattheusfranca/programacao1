/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.udesc.pro1.programacao1.tela.exemplo1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mattheus
 */
public class TelaCadastrarPessoa extends javax.swing.JFrame {

    private static ArrayList<Pessoa> pessoas = new ArrayList();
    
    //Simular um banco de dados
    public static void inicializarPessoas(){
        Pessoa p1 = new Pessoa("Pessoa1", "123");
        Pessoa p2 = new Pessoa("Pessoa2", "2123");
        Pessoa p3 = new Pessoa("Pessoa3", "3123");
        Pessoa p4 = new Pessoa("Pessoa4", "4123");
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
    }
    /**
     * Creates new form TelaCadastrarPessoa
     */
    public TelaCadastrarPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNomePessoa = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        btnCadastrarPessoa = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarPessoa.setText("Cadastrar Pessoa");
        btnCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPessoaActionPerformed(evt);
            }
        });

        lbNome.setText("Nome");

        lbCPF.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCPF)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                .addComponent(lbNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNomePessoa, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnCadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnCadastrarPessoa)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPessoaActionPerformed
        
        //Recuperar os dados da tela
        String nome = tfNomePessoa.getText();
        String CPF = tfCPF.getText();
        
        //Crie um objeto do tipo pessoa
        Pessoa pessoa = new Pessoa(nome, CPF);
        
        //Salve esse objeto pessoa
        pessoas.add(pessoa);
        
        //Apresente uma mensagem na tela
        JOptionPane.showMessageDialog(null, pessoa.toString());
        
        //Limpe os dados da tela
        tfNomePessoa.setText("");
        tfCPF.setText("");
        
        
        System.out.println(pessoas);
        
        
    }//GEN-LAST:event_btnCadastrarPessoaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPessoa;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfNomePessoa;
    // End of variables declaration//GEN-END:variables
}
