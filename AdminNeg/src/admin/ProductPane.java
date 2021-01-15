package admin;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ProductPane extends javax.swing.JPanel {

    DBC con = DBC.getInstance();
    public ProductPane() {
        initComponents();
        chargeTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeProdBtn = new javax.swing.JButton();
        addProdBtn = new javax.swing.JButton();
        cleanProdBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        nameProdLabel = new javax.swing.JLabel();
        nameProdText = new javax.swing.JTextField();
        catProdLabel = new javax.swing.JLabel();
        nameProdLabel4 = new javax.swing.JLabel();
        quantProdSpinner = new javax.swing.JSpinner();
        delProdBtn = new javax.swing.JButton();
        priceProdSpinner = new javax.swing.JSpinner();
        nameProdLabel5 = new javax.swing.JLabel();
        catProdBox = new javax.swing.JComboBox<>();

        changeProdBtn.setText("Modificar");

        setPreferredSize(new java.awt.Dimension(700, 400));
        setLayout(null);

        addProdBtn.setText("Agregar");
        addProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBtnActionPerformed(evt);
            }
        });
        add(addProdBtn);
        addProdBtn.setBounds(30, 260, 107, 50);

        cleanProdBtn.setText("Limpiar");
        cleanProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanProdBtnActionPerformed(evt);
            }
        });
        add(cleanProdBtn);
        cleanProdBtn.setBounds(140, 260, 105, 50);

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CANTIDAD", "CATEGORIA"
            }
        ));
        jScrollPane1.setViewportView(prodTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(290, 40, 390, 305);

        nameProdLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameProdLabel.setText("Nombre:");
        add(nameProdLabel);
        nameProdLabel.setBounds(20, 30, 80, 20);
        add(nameProdText);
        nameProdText.setBounds(130, 20, 140, 39);

        catProdLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        catProdLabel.setText("Categoria:");
        add(catProdLabel);
        catProdLabel.setBounds(10, 210, 100, 26);

        nameProdLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameProdLabel4.setText("Precio:");
        add(nameProdLabel4);
        nameProdLabel4.setBounds(40, 80, 60, 26);

        quantProdSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        add(quantProdSpinner);
        quantProdSpinner.setBounds(130, 140, 80, 42);

        delProdBtn.setText("Borrar");
        delProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProdBtnActionPerformed(evt);
            }
        });
        add(delProdBtn);
        delProdBtn.setBounds(90, 320, 105, 50);

        priceProdSpinner.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(5000.0f), Float.valueOf(0.5f)));
        add(priceProdSpinner);
        priceProdSpinner.setBounds(130, 80, 80, 42);

        nameProdLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameProdLabel5.setText("Cantidad:");
        add(nameProdLabel5);
        nameProdLabel5.setBounds(20, 150, 90, 26);

        catProdBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                catProdBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        catProdBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catProdBoxActionPerformed(evt);
            }
        });
        add(catProdBox);
        catProdBox.setBounds(130, 210, 140, 40);
    }// </editor-fold>//GEN-END:initComponents
    public void chargeTable(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            prodTable.setModel(model);
            Connection connection = con.open();
            PreparedStatement selProd = connection.prepareStatement("select p.id,p.name,p.price,p.quantity,c.name "
                    + "from products as p, categorys     as c"
                    + " where p.id_category = c.id ");
            
            ResultSet data = selProd.executeQuery();
            model.addColumn("ID");
            model.addColumn("NOMBRE");
            model.addColumn("PRECIO");
            model.addColumn("CANTIDAD");
            model.addColumn("CATEGORIA");
            prodTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            prodTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            prodTable.getColumnModel().getColumn(2).setPreferredWidth(75);
            prodTable.getColumnModel().getColumn(3).setPreferredWidth(75);
            prodTable.getColumnModel().getColumn(4).setPreferredWidth(75);
            while(data.next()){
                Object row[] = new Object[5];
                for(int i=0;i<5;i++){
                    row[i] = data.getObject(i+1);
                }
                model.addRow(row);
            }
            con.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }
    private void addProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBtnActionPerformed
        if(nameProdText.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Nombre vacio");
            return;
        }
        try{
            Connection connection = con.open();
            PreparedStatement insertProd = connection.prepareStatement(""
                    + "insert into products values (?,?,?,?,?)");
            insertProd.setString(1,"0");
            insertProd.setString(2,nameProdText.getText().trim().toUpperCase());
            insertProd.setString(3,priceProdSpinner.getValue().toString());
            insertProd.setString(4,getIdCategory(catProdBox.getSelectedItem().toString()));
            insertProd.setString(5,quantProdSpinner.getValue().toString());
            insertProd.executeUpdate();
            JOptionPane.showMessageDialog(null,"Producto agregado");
            chargeTable();
            cleanProdBtnActionPerformed(evt);
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+ e);
        }
    }//GEN-LAST:event_addProdBtnActionPerformed
    private String getIdCategory(String name){
        try{
            Connection connection = con.open();
            PreparedStatement selCat = connection.prepareStatement("select id from categorys where name = '"+name+"'");
            ResultSet data =  selCat.executeQuery();
            data.next();
            return data.getObject(1).toString();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+ e);
            return "";
        }
    }
    private void cleanProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanProdBtnActionPerformed
        nameProdText.setText("");
        priceProdSpinner.setValue(0);
        quantProdSpinner.setValue(0);
    }//GEN-LAST:event_cleanProdBtnActionPerformed

    private void delProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProdBtnActionPerformed
        if(prodTable.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Selecciona una fila");
            return;
        }
        try{
            Connection connection = con.open();
            
            PreparedStatement delTable = connection.prepareStatement("delete from products where id = ?");
            delTable.setString(1, prodTable.getModel().getValueAt(prodTable.getSelectedRow(), 0).toString().trim());
            
            delTable.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Producto eliminado");
            chargeTable();
            con.close();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    
    }//GEN-LAST:event_delProdBtnActionPerformed

    private void catProdBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catProdBoxActionPerformed
        
    }//GEN-LAST:event_catProdBoxActionPerformed

    private void catProdBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_catProdBoxPopupMenuWillBecomeVisible
        try{
            Connection connection = con.open();
            PreparedStatement selCat = connection.prepareStatement("select name from categorys");
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            
            ResultSet data = selCat.executeQuery();
            while(data.next()){
                model.addElement(data.getObject(1));
            }
            catProdBox.setModel(model);
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_catProdBoxPopupMenuWillBecomeVisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProdBtn;
    private javax.swing.JComboBox<String> catProdBox;
    private javax.swing.JLabel catProdLabel;
    private javax.swing.JButton changeProdBtn;
    private javax.swing.JButton cleanProdBtn;
    private javax.swing.JButton delProdBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameProdLabel;
    private javax.swing.JLabel nameProdLabel4;
    private javax.swing.JLabel nameProdLabel5;
    private javax.swing.JTextField nameProdText;
    private javax.swing.JSpinner priceProdSpinner;
    private javax.swing.JTable prodTable;
    private javax.swing.JSpinner quantProdSpinner;
    // End of variables declaration//GEN-END:variables
}
