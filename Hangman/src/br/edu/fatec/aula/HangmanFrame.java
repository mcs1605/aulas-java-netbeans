/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1711 MXTI
 */
public class HangmanFrame extends javax.swing.JFrame {

    /**
     * Creates new form HangmanFrame
     */
    public HangmanFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dicaLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        respostaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 9 - Hangman");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new java.awt.GridLayout(2, 13, 2, 2));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(44, 62, 80));
        jButton1.setText("A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(44, 62, 80));
        jButton2.setText("B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(44, 62, 80));
        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(44, 62, 80));
        jButton4.setText("D");
        jPanel2.add(jButton4);

        jButton5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(44, 62, 80));
        jButton5.setText("E");
        jPanel2.add(jButton5);

        jButton6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(44, 62, 80));
        jButton6.setText("F");
        jPanel2.add(jButton6);

        jButton7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(44, 62, 80));
        jButton7.setText("G");
        jPanel2.add(jButton7);

        jButton8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(44, 62, 80));
        jButton8.setText("H");
        jPanel2.add(jButton8);

        jButton9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(44, 62, 80));
        jButton9.setText("I");
        jPanel2.add(jButton9);

        jButton10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(44, 62, 80));
        jButton10.setText("J");
        jPanel2.add(jButton10);

        jButton11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(44, 62, 80));
        jButton11.setText("K");
        jPanel2.add(jButton11);

        jButton12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(44, 62, 80));
        jButton12.setText("L");
        jPanel2.add(jButton12);

        jButton13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(44, 62, 80));
        jButton13.setText("M");
        jButton13.setToolTipText("");
        jPanel2.add(jButton13);

        jButton14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(44, 62, 80));
        jButton14.setText("N");
        jPanel2.add(jButton14);

        jButton15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(44, 62, 80));
        jButton15.setText("O");
        jPanel2.add(jButton15);

        jButton16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(44, 62, 80));
        jButton16.setText("P");
        jPanel2.add(jButton16);

        jButton17.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(44, 62, 80));
        jButton17.setText("Q");
        jPanel2.add(jButton17);

        jButton18.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(44, 62, 80));
        jButton18.setText("R");
        jPanel2.add(jButton18);

        jButton19.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(44, 62, 80));
        jButton19.setText("S");
        jPanel2.add(jButton19);

        jButton20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(44, 62, 80));
        jButton20.setText("T");
        jPanel2.add(jButton20);

        jButton21.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(44, 62, 80));
        jButton21.setText("U");
        jPanel2.add(jButton21);

        jButton22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(44, 62, 80));
        jButton22.setText("V");
        jPanel2.add(jButton22);

        jButton23.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(44, 62, 80));
        jButton23.setText("W");
        jPanel2.add(jButton23);

        jButton24.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(44, 62, 80));
        jButton24.setText("X");
        jPanel2.add(jButton24);

        jButton25.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(44, 62, 80));
        jButton25.setText("Y");
        jPanel2.add(jButton25);

        jButton26.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(44, 62, 80));
        jButton26.setText("Z");
        jPanel2.add(jButton26);

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        dicaLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        dicaLabel.setForeground(new java.awt.Color(255, 255, 255));
        dicaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dicaLabel.setText("A dica fica aqui");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        respostaLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        respostaLabel.setForeground(new java.awt.Color(255, 255, 255));
        respostaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respostaLabel.setText("RESPOSTA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respostaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respostaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<String> lista = new ArrayList<>();
    private String respostaCorreta = "";
    private String respostaAtual = "";
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String caminho = "src/br/edu/fatec/arquivo/dados.txt";
        File arquivo = new File(caminho);
        try {
            Scanner entrada = new Scanner(arquivo);
            while (entrada.hasNext()) {
                String linha = entrada.nextLine();      // Le uma linha do arquivo
                lista.add(linha);                       // adiciona na Lista  
            }
            
            Collections.shuffle(lista);                 // Embaralhar a lista

            adicionarInformacoesNaTela();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Falha ao ler o arquivo!",
                    "Erro de Arquivo",
                    JOptionPane.ERROR_MESSAGE);

            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificarLetra('A');
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verificarLetra('B');
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        verificarLetra('C');
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void adicionarInformacoesNaTela() {
        String linha = lista.remove(0);
        String[] partes = linha.split("[;]");
        dicaLabel.setText(partes[0].toUpperCase());
        
        respostaCorreta = partes[1].toUpperCase();
        respostaAtual = respostaCorreta.replaceAll("[a-zA-Z0-9]", "-");
        respostaLabel.setText(respostaAtual);
    }
    
    private void verificarLetra(char letra){
        for (int i = 0; i < respostaCorreta.length(); i++){
            if (respostaCorreta.charAt(i) == letra){
                char[] letras = respostaAtual.toCharArray();
                letras[i] = letra;
                respostaAtual = String.valueOf(letras); 
            }
        }
        
        respostaLabel.setText(respostaAtual);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dicaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel respostaLabel;
    // End of variables declaration//GEN-END:variables
}
