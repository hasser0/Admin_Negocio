/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
    
public class ProviderPane extends javax.swing.JPanel {

    DBC con = DBC.getInstance();
    public ProviderPane() throws SQLException{
        initComponents();
        chargeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameProvLabel = new javax.swing.JLabel();
        telProvLabel = new javax.swing.JLabel();
        nameProvText = new javax.swing.JTextField();
        telProvText = new javax.swing.JTextField();
        addProvBtn = new javax.swing.JButton();
        cleanProvBtn = new javax.swing.JButton();
        delProvBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        provTable = new javax.swing.JTable();

        nameProvLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameProvLabel.setText("Nombre:");

        telProvLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        telProvLabel.setText("Telefono:");

        nameProvText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameProvTextActionPerformed(evt);
            }
        });

        addProvBtn.setText("Agregar");
        addProvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProvBtnActionPerformed(evt);
            }
        });

        cleanProvBtn.setText("Limpiar");
        cleanProvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanProvBtnActionPerformed(evt);
            }
        });

        delProvBtn.setText("Borrar");
        delProvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProvBtnActionPerformed(evt);
            }
        });

        provTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TELEFONO"
            }
        ));
        jScrollPane1.setViewportView(provTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameProvLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nameProvText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telProvLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telProvText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addProvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cleanProvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delProvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameProvLabel)
                            .addComponent(nameProvText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telProvLabel)
                            .addComponent(telProvText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cleanProvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addProvBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delProvBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameProvTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameProvTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameProvTextActionPerformed
    private void chargeTable() throws SQLException{
        try{
            DefaultTableModel model = new DefaultTableModel();
            provTable.setModel(model);
            Connection connection = con.open();
            PreparedStatement provSel = connection.prepareStatement("Select id,name,tel from provider");

            ResultSet data = provSel.executeQuery();
            
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Telefono");
            provTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            provTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            provTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            
            while(data.next()){
                Object row[] = new Object[3];
                for(int i=0;i<3;i++){
                    row[i] = data.getObject(i+1);
                }
                model.addRow(row);
            }
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    private void addProvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProvBtnActionPerformed
        try{
            Connection connection = con.open();
            
            PreparedStatement addProv = connection.prepareStatement("insert into provider values (?,?,?)");
            addProv.setString(1, "0");
            addProv.setString(2,nameProvText.getText().trim().toUpperCase());
            addProv.setString(3,telProvText.getText().trim().toUpperCase());
            addProv.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proveedor añadido");
            chargeTable();
            cleanProvBtnActionPerformed(evt);
            con.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_addProvBtnActionPerformed

    private void cleanProvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanProvBtnActionPerformed
        nameProvText.setText("");
        telProvText.setText("");
    }//GEN-LAST:event_cleanProvBtnActionPerformed

    private void delProvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProvBtnActionPerformed
        if(provTable.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Selecciona una fila");
            return;
        }
        try{
            Connection connection = con.open();
            PreparedStatement delProv = connection.prepareStatement("delete from provider where id = ?");
            delProv.setString(1, provTable.getModel().getValueAt(provTable.getSelectedRow(), 0).toString());
            delProv.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            chargeTable();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_delProvBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProvBtn;
    private javax.swing.JButton cleanProvBtn;
    private javax.swing.JButton delProvBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameProvLabel;
    private javax.swing.JTextField nameProvText;
    private javax.swing.JTable provTable;
    private javax.swing.JLabel telProvLabel;
    private javax.swing.JTextField telProvText;
    // End of variables declaration//GEN-END:variables
}
