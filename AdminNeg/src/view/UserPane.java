/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author hasser
 */
public class UserPane extends javax.swing.JPanel {

    /**
     * Creates new form UsuariosPanel
     */
    public UserPane() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tableUser1 = new javax.swing.JTable();
        idUserLabel = new javax.swing.JLabel();
        nameUserLabel = new javax.swing.JLabel();
        permUserBox = new javax.swing.JComboBox<>();
        addUserBtn = new javax.swing.JButton();
        cleanUserBtn = new javax.swing.JButton();
        delUserBtn = new javax.swing.JButton();
        idUserText = new javax.swing.JTextField();
        nameUserText = new javax.swing.JTextField();
        pwdUserLabel = new javax.swing.JLabel();
        permUserLabel = new javax.swing.JLabel();
        pwdUserText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        tableUser1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PERMISO"
            }
        ));
        jScrollPane2.setViewportView(tableUser1);

        idUserLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        idUserLabel.setText("ID:");

        nameUserLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        nameUserLabel.setText("Nombre:");

        permUserBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajador", "Administrador", "Jefe (no crear)" }));
        permUserBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permUserBoxActionPerformed(evt);
            }
        });

        addUserBtn.setText("Agregar");

        cleanUserBtn.setText("Limpiar");
        cleanUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanUserBtnActionPerformed(evt);
            }
        });

        delUserBtn.setText("Borrar");

        pwdUserLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        pwdUserLabel.setText("Contraseña:");

        permUserLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        permUserLabel.setText("Permiso:");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PERMISO"
            }
        ));
        jScrollPane3.setViewportView(userTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idUserLabel)
                            .addComponent(pwdUserLabel)
                            .addComponent(nameUserLabel)
                            .addComponent(permUserLabel))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameUserText)
                            .addComponent(pwdUserText)
                            .addComponent(permUserBox, 0, 142, Short.MAX_VALUE)
                            .addComponent(idUserText))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addUserBtn)
                        .addGap(24, 24, 24)
                        .addComponent(cleanUserBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idUserLabel)
                            .addComponent(idUserText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameUserLabel)
                            .addComponent(nameUserText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdUserText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdUserLabel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(permUserBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(permUserLabel))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUserBtn)
                            .addComponent(cleanUserBtn)
                            .addComponent(delUserBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void permUserBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permUserBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permUserBoxActionPerformed

    private void cleanUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cleanUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton cleanUserBtn;
    private javax.swing.JButton delUserBtn;
    private javax.swing.JLabel idUserLabel;
    private javax.swing.JTextField idUserText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameUserLabel;
    private javax.swing.JTextField nameUserText;
    private javax.swing.JComboBox<String> permUserBox;
    private javax.swing.JLabel permUserLabel;
    private javax.swing.JLabel pwdUserLabel;
    private javax.swing.JTextField pwdUserText;
    private javax.swing.JTable tableUser1;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}