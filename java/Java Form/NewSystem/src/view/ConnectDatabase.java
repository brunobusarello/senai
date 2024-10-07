/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import dao.ClienteDaoImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Arquivo;
import model.DbConnection;

/**
 *
 * @author gusta
 */
public class ConnectDatabase extends javax.swing.JInternalFrame {
    DbConnection dbConnection = new DbConnection();
    /**
     * Creates new form ConnectDatabase
     */
    public ConnectDatabase() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRbIp);
        bg.add(jRbLocal);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jRbDefault);
        bg1.add(jRbPort);
        
    }
    
    public void connection(){
        if (dbConnection.testConnection(jTfIp.getText(), jTfPort.getText(), jTextField1.getText(), "root", "")) {
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão!");
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTfIp = new javax.swing.JTextField();
        jRbLocal = new javax.swing.JRadioButton();
        jRbIp = new javax.swing.JRadioButton();
        jTfPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRbDefault = new javax.swing.JRadioButton();
        jRbPort = new javax.swing.JRadioButton();
        btnTestConnection = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Informe o nome do banco");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço do servidor");

        jTfIp.setText("127.0.0.1");
        jTfIp.setEnabled(false);

        jRbLocal.setSelected(true);
        jRbLocal.setText("Localhost");
        jRbLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbLocalActionPerformed(evt);
            }
        });

        jRbIp.setText("Endereço IP");
        jRbIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbIpActionPerformed(evt);
            }
        });

        jTfPort.setText("3306");
        jTfPort.setEnabled(false);
        jTfPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfPortActionPerformed(evt);
            }
        });

        jLabel3.setText("Porta do servidor");

        jRbDefault.setSelected(true);
        jRbDefault.setText("Padrão");
        jRbDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbDefaultActionPerformed(evt);
            }
        });

        jRbPort.setText("Endereço da Porta");
        jRbPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbPortActionPerformed(evt);
            }
        });

        btnTestConnection.setText("Testar Conexão");
        btnTestConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestConnectionActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTfIp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jRbLocal)
                            .addComponent(jRbIp))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jRbDefault)
                            .addComponent(jRbPort)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTestConnection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbDefault)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbIp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTestConnection)
                    .addComponent(btnSave))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRbIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbIpActionPerformed
        // TODO add your handling code here:
        jTfIp.setEnabled(true);
        jTfIp.setText("");
    }//GEN-LAST:event_jRbIpActionPerformed

    private void jRbLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbLocalActionPerformed
        // TODO add your handling code here:
        jTfIp.setEnabled(false);
        jTfIp.setText("127.0.0.1");
    }//GEN-LAST:event_jRbLocalActionPerformed

    private void jRbDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbDefaultActionPerformed
        // TODO add your handling code here:
        jTfPort.setEnabled(false);
        jTfPort.setText("3306");
    }//GEN-LAST:event_jRbDefaultActionPerformed

    private void jRbPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbPortActionPerformed
        // TODO add your handling code here:
        jTfPort.setEnabled(true);
        jTfPort.setText("");
    }//GEN-LAST:event_jRbPortActionPerformed

    private void jTfPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfPortActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTfPortActionPerformed

    private void btnTestConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestConnectionActionPerformed
        // TODO add your handling code here:
        connection();
        
    }//GEN-LAST:event_btnTestConnectionActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        DbConnection dbConnection = new DbConnection();
        dbConnection.dbConnect();
        Arquivo arquivo = new Arquivo();
        arquivo.write("db_config.db", jTfIp.getText() + ";" + jTfPort.getText() + ";" + jTextField1.getText() + ";root;;");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTestConnection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRbDefault;
    private javax.swing.JRadioButton jRbIp;
    private javax.swing.JRadioButton jRbLocal;
    private javax.swing.JRadioButton jRbPort;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTfIp;
    private javax.swing.JTextField jTfPort;
    // End of variables declaration//GEN-END:variables
}
