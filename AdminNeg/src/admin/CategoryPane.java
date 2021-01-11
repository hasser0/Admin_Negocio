package admin;

import java.awt.HeadlessException;
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
                "ID", "NOMBRE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(catTable);

        addCatBtn.setText("Agregar");
        addCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCatBtnActionPerformed(evt);
            }
        });

        nameCatLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameCatLabel.setText("Nombre Categoria");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(nameCatLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(addCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameCatText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(nameCatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameCatText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void chargeTable(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            catTable.setModel(model);
            Connection connection = con.open();
            PreparedStatement catSel = connection.prepareStatement("select * from category");
            
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
        try{
            Connection connection = con.open();
            PreparedStatement insertCat = connection.prepareStatement("insert into category values (?,?)");
            insertCat.setString(1,"0");
            insertCat.setString(2,nameCatText.getText().trim().toUpperCase());
            insertCat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Categoria agregada");
            chargeTable();
            nameCatText.setText("");
            con.close();
        }catch(HeadlessException | SQLException e){
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
            
            PreparedStatement delTable = connection.prepareStatement("delete from category where id = ?");
            delTable.setString(1, catTable.getModel().getValueAt(catTable.getSelectedRow(), 0).toString().trim());
            
            delTable.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria eliminada");
            chargeTable();
            con.close();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
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
