package admin;

public class View extends javax.swing.JFrame {
    

    public View() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        srchProdPane = new admin.SrchProductPane();
        sellPane = new admin.SellPane();
        inventoryPane = new admin.InventoryPane();
        categoryPane = new admin.CategoryPane();
        productPane = new admin.ProductPane();
        providerPane = new admin.ProviderPane();
        userPane = new admin.UserPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.setPreferredSize(new java.awt.Dimension(750, 450));
        tabbedPane.addTab("Buscar Productos", srchProdPane);
        tabbedPane.addTab("Vender", sellPane);
        tabbedPane.addTab("Inventario", inventoryPane);
        tabbedPane.addTab("Categorias", categoryPane);
        tabbedPane.addTab("Productos", productPane);
        tabbedPane.addTab("Proveedores", providerPane);
        tabbedPane.addTab("Usuarios", userPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        View v = new View();
        v.setVisible(true);
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private admin.CategoryPane categoryPane;
    private admin.InventoryPane inventoryPane;
    private admin.ProductPane productPane;
    private admin.ProviderPane providerPane;
    private admin.SellPane sellPane;
    private admin.SrchProductPane srchProdPane;
    private javax.swing.JTabbedPane tabbedPane;
    private admin.UserPane userPane;
    // End of variables declaration//GEN-END:variables
}
