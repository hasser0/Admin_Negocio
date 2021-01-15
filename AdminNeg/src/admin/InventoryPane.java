package admin;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventoryPane extends javax.swing.JPanel {

    DBC con = DBC.getInstance();
    public InventoryPane() {
        initComponents();
        chargeTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delStcBtn = new javax.swing.JButton();
        nameStcLabel = new javax.swing.JLabel();
        numStcLabel = new javax.swing.JLabel();
        provStcBox = new javax.swing.JComboBox<>();
        provStcLabel = new javax.swing.JLabel();
        buyStcBtn = new javax.swing.JButton();
        cleanStcBtn = new javax.swing.JButton();
        nameStcText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        stcTable = new javax.swing.JTable();
        quantStcSpinner = new javax.swing.JSpinner();

        delStcBtn.setText("Borrar");
        delStcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delStcBtnActionPerformed(evt);
            }
        });

        setLayout(null);

        nameStcLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameStcLabel.setText("Articulo:");
        add(nameStcLabel);
        nameStcLabel.setBounds(50, 90, 75, 26);

        numStcLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        numStcLabel.setText("Cantidad:");
        add(numStcLabel);
        numStcLabel.setBounds(450, 120, 85, 26);

        provStcBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                provStcBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        provStcBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provStcBoxActionPerformed(evt);
            }
        });
        add(provStcBox);
        provStcBox.setBounds(550, 170, 180, 40);

        provStcLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        provStcLabel.setText("Proveedor:");
        add(provStcLabel);
        provStcLabel.setBounds(440, 180, 97, 26);

        buyStcBtn.setText("Comprar");
        buyStcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyStcBtnActionPerformed(evt);
            }
        });
        add(buyStcBtn);
        buyStcBtn.setBounds(470, 240, 100, 50);

        cleanStcBtn.setText("Limpiar");
        cleanStcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanStcBtnActionPerformed(evt);
            }
        });
        add(cleanStcBtn);
        cleanStcBtn.setBounds(600, 240, 100, 50);

        nameStcText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameStcTextKeyReleased(evt);
            }
        });
        add(nameStcText);
        nameStcText.setBounds(140, 80, 250, 40);

        stcTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ARTICULO", "STOCK"
            }
        ));
        jScrollPane1.setViewportView(stcTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 360, 200);

        quantStcSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 200, 1));
        add(quantStcSpinner);
        quantStcSpinner.setBounds(550, 110, 60, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void provStcBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provStcBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provStcBoxActionPerformed

    private void delStcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delStcBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delStcBtnActionPerformed

    private void cleanStcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanStcBtnActionPerformed
        nameStcText.setText("");
        provStcBox.setSelectedIndex(0);
        quantStcSpinner.setValue(1);
        chargeTable();
    }//GEN-LAST:event_cleanStcBtnActionPerformed

    private void buyStcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyStcBtnActionPerformed
        try{
            Connection connection = con.open();
            PreparedStatement ins = connection.prepareStatement(""
                    + "insert into purchases values (?,?,?,?)");
            PreparedStatement upd = connection.prepareStatement(""
                    + "update products set quantity = quantity + ? where id = ?");
            
            String idProd = stcTable.getModel().getValueAt(stcTable.getSelectedRow(),0).toString().trim();
            java.util.Date date = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            
            ins.setString(1,sqlDate.toString());
            ins.setString(2,quantStcSpinner.getValue().toString());
            ins.setString(3,idProd);
            ins.setString(4,getIdProvider(provStcBox.getSelectedItem().toString()));

            upd.setString(1,quantStcSpinner.getValue().toString());
            upd.setString(2, idProd);
            
            upd.executeUpdate();
            ins.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Compra exitosa");
            cleanStcBtnActionPerformed(evt);
            chargeTable();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_buyStcBtnActionPerformed
    private String getIdProvider(String name){
        try{
            Connection connection = con.open();
            PreparedStatement selProv = connection.prepareStatement("select id from providers where name = '"+name+"'");
            ResultSet data =  selProv.executeQuery();
            data.next();
            return data.getObject(1).toString();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return "";
        }
    }
    private void provStcBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_provStcBoxPopupMenuWillBecomeVisible
        try{
            Connection connection = con.open();
            PreparedStatement selCat = connection.prepareStatement("select name from providers");
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            
            ResultSet data = selCat.executeQuery();
            while(data.next()){
                model.addElement(data.getObject(1));
            }
            provStcBox.setModel(model);
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_provStcBoxPopupMenuWillBecomeVisible
    public void chargeTable(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            stcTable.setModel(model);
            Connection connection = con.open();
            PreparedStatement selProd = connection.prepareStatement("select id,name,quantity "
                    + "from products "
                    + "WHERE name LIKE \"%"+ nameStcText.getText().trim().toUpperCase() +"%\"");
            
            ResultSet data = selProd.executeQuery();
            model.addColumn("ID");
            model.addColumn("ARTICULO");
            model.addColumn("STOCK");
            stcTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            stcTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            stcTable.getColumnModel().getColumn(2).setPreferredWidth(75);
            while(data.next()){
                Object row[] = new Object[3];
                for(int i=0;i<3;i++){
                    row[i] = data.getObject(i+1);
                }
                model.addRow(row);
            }
            con.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }
    private void nameStcTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameStcTextKeyReleased
        chargeTable();
    }//GEN-LAST:event_nameStcTextKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyStcBtn;
    private javax.swing.JButton cleanStcBtn;
    private javax.swing.JButton delStcBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameStcLabel;
    private javax.swing.JTextField nameStcText;
    private javax.swing.JLabel numStcLabel;
    private javax.swing.JComboBox<String> provStcBox;
    private javax.swing.JLabel provStcLabel;
    private javax.swing.JSpinner quantStcSpinner;
    private javax.swing.JTable stcTable;
    // End of variables declaration//GEN-END:variables
}
