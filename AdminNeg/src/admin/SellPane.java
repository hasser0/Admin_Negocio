package admin;

import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
    import javax.swing.table.DefaultTableModel;

public class SellPane extends javax.swing.JPanel {
    DBC con = DBC.getInstance();
    public SellPane() {
        initComponents();
        AutoCompleteDecorator.decorate(nameSellBox);
        chargeProducts();
        tmodel = new DefaultTableModel();   
        sellTable.setModel(tmodel);
        tmodel.addColumn("ID");
        tmodel.addColumn("PRODUCTO");
        tmodel.addColumn("CANTIDAD");
        tmodel.addColumn("PRECIO");
        tmodel.addColumn("TOTAL");
        
    }

    
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
        totalCurSellLabel = new javax.swing.JLabel();
        quantSellSpinner = new javax.swing.JSpinner();
        totalCurSellText = new java.awt.TextField();
        addSellBtn = new javax.swing.JButton();
        cleanSellBtn = new javax.swing.JButton();
        sellSellBtn = new javax.swing.JButton();
        delSellBtn = new javax.swing.JButton();
        cancelSellBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sellTable = new javax.swing.JTable();
        totalSellLabel = new javax.swing.JLabel();
        totalSellText = new javax.swing.JTextField();
        nameSellBox = new javax.swing.JComboBox<>();

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
        nameSellLabel.setBounds(10, 100, 86, 26);

        numSellLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        numSellLabel.setText("Cantidad:");
        add(numSellLabel);
        numSellLabel.setBounds(10, 150, 85, 26);

        totalCurSellLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        totalCurSellLabel.setText("Total:");
        add(totalCurSellLabel);
        totalCurSellLabel.setBounds(40, 210, 60, 26);

        quantSellSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 0, 200, 1));
        quantSellSpinner.setValue(1);
        quantSellSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantSellSpinnerStateChanged(evt);
            }
        });
        add(quantSellSpinner);
        quantSellSpinner.setBounds(100, 150, 60, 40);

        totalCurSellText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        totalCurSellText.setEditable(false);
        totalCurSellText.setEnabled(false);
        totalCurSellText.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        totalCurSellText.setText("$0");
        add(totalCurSellText);
        totalCurSellText.setBounds(100, 210, 180, 40);

        addSellBtn.setText("Agregar");
        addSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSellBtnActionPerformed(evt);
            }
        });
        add(addSellBtn);
        addSellBtn.setBounds(70, 270, 96, 51);

        cleanSellBtn.setText("Limpiar");
        cleanSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanSellBtnActionPerformed(evt);
            }
        });
        add(cleanSellBtn);
        cleanSellBtn.setBounds(180, 270, 91, 51);

        sellSellBtn.setText("Compra");
        sellSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellSellBtnActionPerformed(evt);
            }
        });
        add(sellSellBtn);
        sellSellBtn.setBounds(340, 230, 99, 45);

        delSellBtn.setText("Borrar");
        delSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSellBtnActionPerformed(evt);
            }
        });
        add(delSellBtn);
        delSellBtn.setBounds(450, 230, 96, 47);

        cancelSellBtn.setText("Cancelar");
        cancelSellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSellBtnActionPerformed(evt);
            }
        });
        add(cancelSellBtn);
        cancelSellBtn.setBounds(560, 230, 100, 48);

        sellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane3.setViewportView(sellTable);

        add(jScrollPane3);
        jScrollPane3.setBounds(310, 40, 373, 172);

        totalSellLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        totalSellLabel.setText("Total:");
        add(totalSellLabel);
        totalSellLabel.setBounds(390, 330, 50, 26);

        totalSellText.setEditable(false);
        totalSellText.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        totalSellText.setText("$0");
        totalSellText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSellTextActionPerformed(evt);
            }
        });
        add(totalSellText);
        totalSellText.setBounds(452, 313, 220, 60);

        nameSellBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nameSellBoxItemStateChanged(evt);
            }
        });
        nameSellBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                nameSellBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        add(nameSellBox);
        nameSellBox.setBounds(100, 90, 190, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void addSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSellBtnActionPerformed
        int quantSpinner = Integer.parseInt(quantSellSpinner.getValue().toString());
        if(quantSpinner == 0){
            return;
        }
        if(quantSpinner > quantityCur){
            JOptionPane.showMessageDialog(null,"Existencia del producto: "+quantityCur);
            return;
        }
        for(int i = 0;i < tmodel.getRowCount();i++){
            String rowName = tmodel.getValueAt(i,1).toString().trim();
            if(rowName.equals(nameCur)){
                int quantRow =  Integer.parseInt(tmodel.getValueAt(i,2).toString());
                if(quantRow + quantSpinner  > quantityCur){
                    JOptionPane.showMessageDialog(null,"Existencia del producto: "+quantityCur);
                    return;
                }
                tmodel.setValueAt(quantRow + quantSpinner, i, 2);
                float subtotal = Float.parseFloat(tmodel.getValueAt(i, 4).toString());
                tmodel.setValueAt(subtotal+totalCur, i, 4);
                total += totalCur;
                totalSellText.setText("$"+total);
                return;
            }
        }
        try{
            Object[] row = new Object[5];
            row[0] = idCur;
            row[1] = nameCur;
            row[2] = Integer.parseInt(quantSellSpinner.getValue().toString());
            row[3] = priceCur;
            row[4] = totalCur;
            tmodel.addRow(row);
            total += totalCur;
            totalSellText.setText("$"+total);
            cleanSellBtnActionPerformed(evt);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }//GEN-LAST:event_addSellBtnActionPerformed

    private void sellSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellSellBtnActionPerformed
        try{
            Connection connection = con.open();
            PreparedStatement insSales = connection.prepareStatement(""
                    + "insert into sales values(?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            java.util.Date date = new java.util.Date();
            int idSales;
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            insSales.setString(1, "0");
            insSales.setString(2, sqlDate.toString());
            insSales.executeUpdate();
            ResultSet sale = insSales.getGeneratedKeys();
            sale.next();
            idSales = sale.getInt(1);
            
            PreparedStatement insProdSales = connection.prepareStatement(""
                    + "insert into product_sell values(?,?,?)");
            PreparedStatement updateProd = connection.prepareStatement(""
                    + "update products set quantity = quantity - ? where id = ?");
            for(int i = 0; i <  tmodel.getRowCount();i++){
                int idProd = Integer.parseInt(tmodel.getValueAt(i, 0).toString());
                int quanti = Integer.parseInt(tmodel.getValueAt(i, 2).toString());
                insProdSales.setString(1, ""+idProd);
                insProdSales.setString(2, ""+idSales);
                insProdSales.setString(3, ""+quanti);
                insProdSales.executeUpdate();
                updateProd.setString(1, ""+quanti);
                updateProd.setString(2, ""+idProd);
                updateProd.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Compra exitosa");
            cancelSellBtnActionPerformed(evt);
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_sellSellBtnActionPerformed

    private void cleanSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanSellBtnActionPerformed
        nameSellBox.setSelectedIndex(0);
        quantSellSpinner.setValue(1);
        totalCurSellText.setText("$0");
    }//GEN-LAST:event_cleanSellBtnActionPerformed
    private void chargeProducts(){
        try{
            Connection connection = con.open();            
            PreparedStatement select = connection.prepareStatement(""
                    + "select name from products");
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ResultSet data = select.executeQuery();
            model.addElement("");
            while(data.next()){
                model.addElement(data.getObject(1));
            }
            nameSellBox.setModel(model);
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
        }
    }
    private void cancelSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSellBtnActionPerformed
        cleanSellBtnActionPerformed(evt);
        while(tmodel.getRowCount() > 0){
            tmodel.removeRow(0);
        }
        total=0;
        totalSellText.setText("$0");
    }//GEN-LAST:event_cancelSellBtnActionPerformed

    private void totalSellTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSellTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSellTextActionPerformed

    private void quantSellSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantSellSpinnerStateChanged
        totalCur = priceCur * (int) quantSellSpinner.getValue();
        setTotalCur(totalCur);
    }//GEN-LAST:event_quantSellSpinnerStateChanged

    private void nameSellBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_nameSellBoxPopupMenuWillBecomeVisible
        chargeProducts();
    }//GEN-LAST:event_nameSellBoxPopupMenuWillBecomeVisible
    private void setTotalCur(float value){
        totalCurSellText.setText("$"+value);
    }
    private void nameSellBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nameSellBoxItemStateChanged
        if(nameSellBox.getSelectedIndex() == -1 ||
                nameSellBox.getSelectedItem().toString().trim().equals("")){
            setTotalCur(0);
            return;
        }
        try{
            Connection connection = con.open();
            PreparedStatement sel = connection.prepareStatement(""
                    + "select id, name, price,quantity"
                    + " from products"
                    + " where name LIKE \"" 
                    + nameSellBox.getSelectedItem().toString().trim() + "\"");
            ResultSet data = sel.executeQuery();
            data.next();
            idCur = Integer.parseInt(data.getObject(1).toString());
            nameCur = data.getObject(2).toString();
            priceCur = Float.parseFloat(data.getObject(3).toString());
            quantityCur = Integer.parseInt(data.getObject(4).toString());
            totalCur = priceCur * (int) quantSellSpinner.getValue();
            
            setTotalCur(totalCur);
            con.close();
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_nameSellBoxItemStateChanged
    private void delSellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSellBtnActionPerformed
        if(sellTable.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Selecciona una fila");
            return;
        }
        float removeTotal = Float.parseFloat(tmodel.getValueAt(sellTable.getSelectedRow(), 4).toString());
        total = total - removeTotal;
        totalSellText.setText("$"+total);
        tmodel.removeRow(sellTable.getSelectedRow());
        
    }//GEN-LAST:event_delSellBtnActionPerformed

    private int idCur;
    private String nameCur;
    private float priceCur;
    private int quantityCur;
    private float totalCur;
    private float total=0;
    private DefaultTableModel tmodel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSellBtn;
    private javax.swing.JButton cancelSellBtn;
    private javax.swing.JButton cleanSellBtn;
    private javax.swing.JButton delSellBtn;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> nameSellBox;
    private javax.swing.JLabel nameSellLabel;
    private javax.swing.JLabel numSellLabel;
    private javax.swing.JSpinner quantSellSpinner;
    private javax.swing.JButton sellSellBtn;
    private javax.swing.JTable sellTable;
    private javax.swing.JLabel totalCurSellLabel;
    private java.awt.TextField totalCurSellText;
    private javax.swing.JLabel totalSellLabel;
    private javax.swing.JTextField totalSellText;
    // End of variables declaration//GEN-END:variables
}
