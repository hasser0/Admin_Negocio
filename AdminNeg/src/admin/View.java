package admin;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class View extends javax.swing.JFrame {
    
    
    public View(String user) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador de Negocios");
        usernameViewText.setText(user);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        srchProdPane = new admin.SrchProductPane();
        sellPane = new admin.SellPane();
        inventoryPane = new admin.InventoryPane();
        categoryPane = new admin.CategoryPane();
        productPane = new admin.ProductPane();
        providerPane = new admin.ProviderPane();
        userPane = new admin.UserPane();
        usernameViewLabel = new javax.swing.JLabel();
        usernameViewText = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.setPreferredSize(new java.awt.Dimension(750, 450));
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        srchProdPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                srchProdPaneFocusGained(evt);
            }
        });
        tabbedPane.addTab("Buscar Productos", srchProdPane);
        tabbedPane.addTab("Vender", sellPane);

        inventoryPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inventoryPaneFocusGained(evt);
            }
        });
        tabbedPane.addTab("Inventario", inventoryPane);
        tabbedPane.addTab("Categorias", categoryPane);

        productPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productPaneFocusGained(evt);
            }
        });
        tabbedPane.addTab("Productos", productPane);
        tabbedPane.addTab("Proveedores", providerPane);
        tabbedPane.addTab("Usuarios", userPane);

        usernameViewLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        usernameViewLabel.setText("Usuario:");

        usernameViewText.setEditable(false);
        usernameViewText.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        usernameViewText.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameViewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameViewText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameViewLabel)
                    .addComponent(usernameViewText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srchProdPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srchProdPaneFocusGained
        
    }//GEN-LAST:event_srchProdPaneFocusGained

    private void inventoryPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inventoryPaneFocusGained
        
    }//GEN-LAST:event_inventoryPaneFocusGained

    private void productPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productPaneFocusGained
        
    }//GEN-LAST:event_productPaneFocusGained

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        productPane.chargeTable();
        inventoryPane.chargeTable();
        srchProdPane.chargeTable();
    }//GEN-LAST:event_tabbedPaneStateChanged

    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private admin.CategoryPane categoryPane;
    private admin.InventoryPane inventoryPane;
    private javax.swing.JLabel jLabel1;
    private admin.ProductPane productPane;
    private admin.ProviderPane providerPane;
    private admin.SellPane sellPane;
    private admin.SrchProductPane srchProdPane;
    private javax.swing.JTabbedPane tabbedPane;
    private admin.UserPane userPane;
    private javax.swing.JLabel usernameViewLabel;
    private javax.swing.JTextField usernameViewText;
    // End of variables declaration//GEN-END:variables
}
