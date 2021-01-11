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
public class SellPane extends javax.swing.JPanel {

    /**
     * Creates new form VentasPanel
     */
    public SellPane() {
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

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        nameSellLabel = new javax.swing.JLabel();
        numSellLabel = new javax.swing.JLabel();
        totalSellLabel = new javax.swing.JLabel();
        numSellSpinner = new javax.swing.JSpinner();
        nameSellText = new java.awt.TextField();
        totalSellText = new java.awt.TextField();
        addSellBtn = new javax.swing.JButton();
        cleanSellBtn = new javax.swing.JButton();
        sellSellBtn = new javax.swing.JButton();
        delSellBtn = new javax.swing.JButton();
        cancelSellBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sellTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setPreferredSize(new java.awt.Dimension(700, 400));
        setLayout(null);

        nameSellLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameSellLabel.setText("Producto:");
        add(nameSellLabel);
        nameSellLabel.setBounds(42, 52, 86, 26);

        numSellLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        numSellLabel.setText("Cantidad:");
        add(numSellLabel);
        numSellLabel.setBounds(42, 105, 85, 26);

        totalSellLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        totalSellLabel.setText("Total:");
        add(totalSellLabel);
        totalSellLabel.setBounds(42, 168, 85, 26);

        numSellSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        numSellSpinner.setValue(1);
        add(numSellSpinner);
        numSellSpinner.setBounds(139, 107, 127, 28);

        nameSellText.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        nameSellText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSellTextActionPerformed(evt);
            }
        });
        add(nameSellText);
        nameSellText.setBounds(138, 48, 128, 30);

        totalSellText.setEditable(false);
        totalSellText.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        totalSellText.setText("$0");
        totalSellText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSellTextActionPerformed(evt);
            }
        });
        add(totalSellText);
        totalSellText.setBounds(137, 164, 129, 30);

        addSellBtn.setText("Agregar");
        addSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSellBtnActionPerformed(evt);
            }
        });
        add(addSellBtn);
        addSellBtn.setBounds(71, 225, 96, 51);

        cleanSellBtn.setText("Limpiar");
        cleanSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanSellBtnActionPerformed(evt);
            }
        });
        add(cleanSellBtn);
        cleanSellBtn.setBounds(185, 225, 91, 51);

        sellSellBtn.setText("Compra");
        sellSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellSellBtnActionPerformed(evt);
            }
        });
        add(sellSellBtn);
        sellSellBtn.setBounds(319, 228, 99, 45);

        delSellBtn.setText("Borrar");
        add(delSellBtn);
        delSellBtn.setBounds(430, 227, 96, 47);

        cancelSellBtn.setText("Cancelar");
        cancelSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSellBtnActionPerformed(evt);
            }
        });
        add(cancelSellBtn);
        cancelSellBtn.setBounds(544, 226, 100, 48);

        sellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane3.setViewportView(sellTable);

        add(jScrollPane3);
        jScrollPane3.setBounds(293, 22, 373, 172);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setText("Total:");
        add(jLabel4);
        jLabel4.setBounds(430, 337, 50, 26);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jTextField1.setText("$0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(532, 313, 65, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void nameSellTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSellTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSellTextActionPerformed

    private void totalSellTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSellTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSellTextActionPerformed

    private void addSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSellBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSellBtnActionPerformed

    private void sellSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellSellBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellSellBtnActionPerformed

    private void cleanSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanSellBtnActionPerformed

        nameSellText.setText("");
        numSellSpinner.setValue(1);
        totalSellText.setText("$0");
    }//GEN-LAST:event_cleanSellBtnActionPerformed

    private void cancelSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSellBtnActionPerformed
        if(evt.getSource() == cancelSellBtn){
            cleanSellBtnActionPerformed(evt);
            sellTable.removeAll();
        }
    }//GEN-LAST:event_cancelSellBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSellBtn;
    private javax.swing.JButton cancelSellBtn;
    private javax.swing.JButton cleanSellBtn;
    private javax.swing.JButton delSellBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nameSellLabel;
    private java.awt.TextField nameSellText;
    private javax.swing.JLabel numSellLabel;
    private javax.swing.JSpinner numSellSpinner;
    private javax.swing.JButton sellSellBtn;
    private javax.swing.JTable sellTable;
    private javax.swing.JLabel totalSellLabel;
    private java.awt.TextField totalSellText;
    // End of variables declaration//GEN-END:variables
}
