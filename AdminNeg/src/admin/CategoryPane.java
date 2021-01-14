package admin;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CategoryPane extends javax.swing.JPanel {
    DBC con = DBC.getInstance();

    public CategoryPane() {
        initComponents();
        chargeTable();
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        addCatBtn = new javax.swing.JButton();
        nameCatLabel = new javax.swing.JLabel();
        nameCatText = new javax.swing.JTextField();
        delCatBtn = new javax.swing.JButton();

        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        catTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(catTable);
        catTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        addCatBtn.setText("Agregar");
        addCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCatBtnActionPerformed(evt);
            }
        });

        nameCatLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameCatLabel.setText("Categoria:");

        delCatBtn.setText("Borrar");
        delCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameCatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameCatText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCatText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCatLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void chargeTable(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            catTable.setModel(model);
            Connection connection = con.open();
            PreparedStatement catSel = connection.prepareStatement("select * from categorys");
            
            ResultSet data = catSel.executeQuery();
            ResultSetMetaData metadata = catSel.getMetaData();
            int numCol = metadata.getColumnCount();
            model.addColumn("ID");
            model.addColumn("Categoria");
            catTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            catTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            
            while(data.next()){
                Object row[] = new Object[2];
                for(int i=0;i<2;i++){
                    row[i] = data.getObject(i+1);
                }
                model.addRow(row);
            }
            con.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }
    private void addCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCatBtnActionPerformed
        if(nameCatText.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Nombre vacio");
            return;
        }
        try{
            Connection connection = con.open();
            PreparedStatement insertCat = connection.prepareStatement("insert into categorys values (?,?)");
            insertCat.setString(1,"0");
            insertCat.setString(2,nameCatText.getText().trim().toUpperCase());
            insertCat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Categoria agregada");
            chargeTable();
            nameCatText.setText("");
            con.close();
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+ e);
        }
    }//GEN-LAST:event_addCatBtnActionPerformed
    
    private void delCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCatBtnActionPerformed
        if(catTable.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Selecciona una fila");
            return;
        }
        try{
            Connection connection = con.open();
            
            PreparedStatement delTable = connection.prepareStatement("delete from categorys where id = ?");
            delTable.setString(1, catTable.getModel().getValueAt(catTable.getSelectedRow(), 0).toString().trim());
            
            delTable.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria eliminada");
            chargeTable();
            con.close();
        }catch(SQLException e){
            if (e.getClass()== SQLIntegrityConstraintViolationException.class){
                JOptionPane.showMessageDialog(null,"No se puede eliminar este elemento");
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e);
            }
        }
    }//GEN-LAST:event_delCatBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCatBtn;
    private javax.swing.JTable catTable;
    private javax.swing.JButton delCatBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameCatLabel;
    private javax.swing.JTextField nameCatText;
    // End of variables declaration//GEN-END:variables
}
