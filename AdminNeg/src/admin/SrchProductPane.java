/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author hasser
 */
public class SrchProductPane extends javax.swing.JPanel {

    /**
     * Creates new form ProductoPanel
     */
    public SrchProductPane() {
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

        nameSrchProdText = new javax.swing.JTextField();
        nameSrchProdLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        srchProdTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(700, 400));

        nameSrchProdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSrchProdTextActionPerformed(evt);
            }
        });

        nameSrchProdLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameSrchProdLabel.setText("Productos: ");

        srchProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CATEGORIA"
            }
        ));
        jScrollPane2.setViewportView(srchProdTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(nameSrchProdLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nameSrchProdText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSrchProdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSrchProdLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameSrchProdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSrchProdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSrchProdTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameSrchProdLabel;
    private javax.swing.JTextField nameSrchProdText;
    private javax.swing.JTable srchProdTable;
    // End of variables declaration//GEN-END:variables
}