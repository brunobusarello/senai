package view;


import dao.FornecedorDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author bruno_busarello
 */
public class CadFornecedor extends javax.swing.JInternalFrame {
    public static boolean editFor = false;
    FornecedorDaoImpl fornecedorDao = new FornecedorDaoImpl();
    
    public void loadFor(){
        DefaultTableModel defaultFor = new DefaultTableModel(new Object[]{
            "Código",
            "Empresa",
            "Contato",
            "Fone",
            "Email"
        }, 0);
        
        
        List<Fornecedor> fornecedores = fornecedorDao.getAllFornecedors();
        for (Fornecedor fornecedor : fornecedores) {
            Object linha[] = new Object[] {
                fornecedor.getCod(),
                fornecedor.getEmpresa(),
                fornecedor.getContato(),
                fornecedor.getFone(),
                fornecedor.getEmail(),
            };
            defaultFor.addRow(linha);
        }
        jTbFor.setModel(defaultFor);
    }
    /**
     * Creates new form CadFornecedor
     */
    public CadFornecedor() {
        initComponents();
        
        loadFor();
    }
    
    //<editor-fold defaultstate="collapsed" desc="FORNECEDOR: FUNÇÕES ADICIONAIS">
    public void enableFor(boolean ena){
        jTfCodFor.setEnabled(false);
        jTfCttFor.setEnabled(ena);
        jTfMailFor.setEnabled(ena);
        jTfPhoneFor.setEnabled(ena);
        jTaCompFor.setEnabled(ena);
    }
    
    public void newFor(){
        btnNewFor.setEnabled(true);
        btnSaveFor.setEnabled(false);
        btnDltFor.setEnabled(false);
        btnCnlFor.setEnabled(false);
        btnEditFor.setEnabled(false);
        enableFor(false);
        limpaFor();
    }
    
    public void limpaFor(){
        jTaCompFor.setText("");
        jTfCodFor.setText("");
        jTfMailFor.setText("");
        jTfPhoneFor.setText("");
        jTfCttFor.setText("");
    }
    
    public boolean verificaEdicaoFor(){
        return (!jTfCttFor.getText().isBlank() &&
            !jTfPhoneFor.getText().isBlank() && !jTfMailFor.getText().isBlank()
            && !jTaCompFor.getText().isBlank());
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTbFor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTfCodFor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTfCttFor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTfMailFor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTfPhoneFor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTaCompFor = new javax.swing.JTextArea();
        btnNewFor = new javax.swing.JButton();
        btnEditFor = new javax.swing.JButton();
        btnCnlFor = new javax.swing.JButton();
        btnSaveFor = new javax.swing.JButton();
        btnDltFor = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Fornecedor");
        setMinimumSize(new java.awt.Dimension(750, 550));

        jTbFor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Contato", "Email", "Telefone", "Empresa"
            }
        ));
        jTbFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbForMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbFor);

        jLabel2.setText("Código");

        jTfCodFor.setEnabled(false);
        jTfCodFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfCodForKeyReleased(evt);
            }
        });

        jLabel3.setText("Contato");

        jTfCttFor.setEnabled(false);
        jTfCttFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfCttForKeyReleased(evt);
            }
        });

        jLabel4.setText("Email");

        jTfMailFor.setEnabled(false);
        jTfMailFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfMailForKeyReleased(evt);
            }
        });

        jLabel5.setText("Telefone");

        jTfPhoneFor.setEnabled(false);
        jTfPhoneFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfPhoneForKeyReleased(evt);
            }
        });

        jLabel6.setText("Empresa");

        jTaCompFor.setColumns(20);
        jTaCompFor.setRows(5);
        jTaCompFor.setEnabled(false);
        jTaCompFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTaCompForKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTaCompFor);

        btnNewFor.setText("Novo");
        btnNewFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewForActionPerformed(evt);
            }
        });

        btnEditFor.setText("Editar");
        btnEditFor.setEnabled(false);
        btnEditFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditForActionPerformed(evt);
            }
        });

        btnCnlFor.setText("Cancelar");
        btnCnlFor.setEnabled(false);
        btnCnlFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCnlForActionPerformed(evt);
            }
        });

        btnSaveFor.setText("Salvar");
        btnSaveFor.setEnabled(false);
        btnSaveFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveForActionPerformed(evt);
            }
        });

        btnDltFor.setText("Excluir");
        btnDltFor.setEnabled(false);
        btnDltFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltForActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jTfCodFor)
                    .addComponent(jLabel3)
                    .addComponent(jTfCttFor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jTfMailFor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jTfPhoneFor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnNewFor)
                .addGap(18, 18, 18)
                .addComponent(btnEditFor)
                .addGap(18, 18, 18)
                .addComponent(btnCnlFor)
                .addGap(18, 18, 18)
                .addComponent(btnDltFor)
                .addGap(18, 18, 18)
                .addComponent(btnSaveFor)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfCodFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfCttFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfMailFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfPhoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewFor)
                    .addComponent(btnEditFor)
                    .addComponent(btnCnlFor)
                    .addComponent(btnDltFor)
                    .addComponent(btnSaveFor))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditForActionPerformed
        // TODO add your handling code here:
        editFor = true;
        btnDltFor.setEnabled(false);
        btnEditFor.setEnabled(false);
        enableFor(true);
    }//GEN-LAST:event_btnEditForActionPerformed

    private void btnCnlForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCnlForActionPerformed
        // TODO add your handling code here:
        limpaFor();
        enableFor(false);
        btnNewFor.setEnabled(true);
        btnSaveFor.setEnabled(false);
        btnCnlFor.setEnabled(false);
        btnEditFor.setEnabled(false);
        btnDltFor.setEnabled(false);
        
        jTbFor.setRowSelectionAllowed(false);
    }//GEN-LAST:event_btnCnlForActionPerformed

    private void btnSaveForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveForActionPerformed
        // TODO add your handling code here:
        int cod = Integer.parseInt(jTfCodFor.getText());
        String comp = jTaCompFor.getText();
        String contato = jTfCttFor.getText();
        String fone = jTfPhoneFor.getText();
        String email = jTfMailFor.getText();
        
        int opt = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente salvar essas informações?\n\n" + 
                "\nEmpresa: " + comp +
                "\nContato: " + contato +
                "\nFone: " + fone +
                "\nEmail: " + email,
                "Confirmar",
                JOptionPane.YES_NO_OPTION
                );
        
        if (opt == JOptionPane.YES_OPTION) {
            Fornecedor fornecedor = new Fornecedor(cod, comp, contato, fone, email);
            
            if (editFor) {
                fornecedorDao.updateFornecedor(fornecedor);
                editFor = false;
            }
            else{
                fornecedorDao.addFornecedor(fornecedor);
            }
            newFor();
            loadFor();
        }
    }//GEN-LAST:event_btnSaveForActionPerformed

    private void btnDltForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltForActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente excluir este registro?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            fornecedorDao.deleteFornecedor(Integer.parseInt(jTfCodFor.getText()));
            newFor();
            loadFor();
        }
    }//GEN-LAST:event_btnDltForActionPerformed

    private void jTbForMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbForMouseClicked
        // TODO add your handling code here:
        int selectedFor = jTbFor.getSelectedRow();
        
        enableFor(false);
        btnNewFor.setEnabled(false);
        btnCnlFor.setEnabled(true);
        btnEditFor.setEnabled(true);
        btnDltFor.setEnabled(true);
        
        jTbFor.setRowSelectionAllowed(true);
        
        jTfCodFor.setText(jTbFor.getValueAt(selectedFor, 0).toString());
        jTaCompFor.setText(jTbFor.getValueAt(selectedFor, 1).toString());
        jTfCttFor.setText(jTbFor.getValueAt(selectedFor, 2).toString());
        jTfPhoneFor.setText(jTbFor.getValueAt(selectedFor, 3).toString());
        jTfMailFor.setText(jTbFor.getValueAt(selectedFor, 4).toString());
    }//GEN-LAST:event_jTbForMouseClicked

    private void btnNewForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewForActionPerformed
        // TODO add your handling code here:
        jTfCodFor.setText(String.valueOf(fornecedorDao.getNextId()));
        btnCnlFor.setEnabled(true);
        btnNewFor.setEnabled(false);
        enableFor(true);
    }//GEN-LAST:event_btnNewForActionPerformed

    private void jTfCodForKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfCodForKeyReleased
        // TODO add your handling code here:
        btnSaveFor.setEnabled(verificaEdicaoFor());
    }//GEN-LAST:event_jTfCodForKeyReleased

    private void jTfCttForKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfCttForKeyReleased
        // TODO add your handling code here:
        btnSaveFor.setEnabled(verificaEdicaoFor());
    }//GEN-LAST:event_jTfCttForKeyReleased

    private void jTfMailForKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfMailForKeyReleased
        // TODO add your handling code here:
        btnSaveFor.setEnabled(verificaEdicaoFor());
    }//GEN-LAST:event_jTfMailForKeyReleased

    private void jTfPhoneForKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfPhoneForKeyReleased
        // TODO add your handling code here:
        btnSaveFor.setEnabled(verificaEdicaoFor());
    }//GEN-LAST:event_jTfPhoneForKeyReleased

    private void jTaCompForKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTaCompForKeyReleased
        // TODO add your handling code here:
        btnSaveFor.setEnabled(verificaEdicaoFor());
    }//GEN-LAST:event_jTaCompForKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCnlFor;
    private javax.swing.JButton btnDltFor;
    private javax.swing.JButton btnEditFor;
    private javax.swing.JButton btnNewFor;
    private javax.swing.JButton btnSaveFor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTaCompFor;
    private javax.swing.JTable jTbFor;
    private javax.swing.JTextField jTfCodFor;
    private javax.swing.JTextField jTfCttFor;
    private javax.swing.JTextField jTfMailFor;
    private javax.swing.JTextField jTfPhoneFor;
    // End of variables declaration//GEN-END:variables
}
