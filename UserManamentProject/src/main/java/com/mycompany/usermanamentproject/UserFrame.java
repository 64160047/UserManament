/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.usermanamentproject;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author minnie
 */
public class UserFrame extends javax.swing.JFrame {

    private final AbstractTableModel model;
    private int userEditedIndex = -1;

    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
        userService = new UserService();
        User newAdmin = new User("admin", "Administrator", "pass@1234", 'M', 'A');
        User newUser1 = new User("user1", "User 1", "pass@1234", 'M', 'U');
        User newUser2 = new User("user2", "User 2", "pass@1234", 'M', 'U');
        User newUser3 = new User("user3", "User 3", "pass@1234", 'M', 'U');
        User newUser4 = new User("user4", "User 4", "pass@1234", 'M', 'U');
        userService.addUser(newAdmin);
        userService.addUser(newUser1);
        userService.addUser(newUser2);
        userService.addUser(newUser3);
        userService.addUser(newUser4);
        model = new AbstractTableModel() {
            @Override
            public int getRowCount() {
               return userService.getSize();
            }

            @Override
            public int getColumnCount() {
               return 5;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                User user = userService.getUser(rowIndex);
                switch (columnIndex) {
                    case 0:
                        return user.getId();
                    case 1:
                        return user.getLogin();
                    case 2:
                        return user.getName();
                    case 3:
                        return user.getGenderString();
                    case 4:
                        return user.getRoleString();
                    default:
                        break;
                }
                return "";
                
            }

            @Override
            public String getColumnName(int column) {
                switch (column) {
                    case 0:
                        return "ID";
                    case 1:
                        return "LOGIN";
                    case 2:
                        return "NAME";
                    case 3:
                        return "GENDER";
                    case 4:
                        return "ROLE";
                    default:
                        break;
                }
                return "";
            }
            
        };
        tableUsers.setModel(model);
        enbleForm(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox<>();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 228, 228));

        jLabel1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        lblUserId.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        lblUserId.setText("-1");

        jLabel3.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Login :");

        jLabel4.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name :");

        jLabel6.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Role :");

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        bgGender.add(rdMale);
        rdMale.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        rdMale.setSelected(true);
        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        bgGender.add(rdFemale);
        rdFemale.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        rdFemale.setText("Female");

        btnSave.setBackground(new java.awt.Color(160, 225, 139));
        btnSave.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(236, 107, 107));
        btnClear.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLogin)
                    .addComponent(txtPassword)
                    .addComponent(cbRole, javax.swing.GroupLayout.Alignment.TRAILING, 0, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdMale, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdFemale)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUserId)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableUsers);

        btnEdit.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddNew.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String login = txtLogin.getText();
        String name = txtName.getText();
        String password = new String(txtPassword.getPassword());
        char role = 'U';
        if (cbRole.getSelectedItem().equals("Admin")) {
            role = 'A';
        }
        char gender = 'M';
        if (rdFemale.isSelected()) {
            gender = 'F';
        }
        User newUser = new User(login, name, password, gender, role);
        System.out.println(newUser);
        if(userEditedIndex<0){
            userService.addUser(newUser);
        }else {
            userService.updateUser(userEditedIndex, newUser);
            userEditedIndex = -1;
        }
        
        model.fireTableDataChanged();
        userService.logUserList();
        clearForm();
        enbleForm(false);


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     userEditedIndex = tableUsers.getSelectedRow();
     User editedUser = userService.getUser(userEditedIndex);
     enbleForm(true);
     txtLogin.setText(editedUser.getLogin());
     txtName.setText(editedUser.getName());
     txtPassword.setText(editedUser.getPassword());
     if(editedUser.getRole() == 'A') {
         cbRole.setSelectedIndex(0);
     }else{
         cbRole.setSelectedIndex(1);
         
     }
     if(editedUser.getGender() == 'M') {
         rdMale.setSelected(true);
     } else{
         rdFemale.setSelected(false);
     }
     lblUserId.setText(""+editedUser.getId());
     System.out.println(userService.getUser(userEditedIndex));
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int index = tableUsers.getSelectedRow();
      userService.deleteUser(index);
      model.fireTableDataChanged();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
      enbleForm(true);
      txtLogin.requestFocus();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void clearForm() {
        txtLogin.setText("");
        txtPassword.setText("");
        txtName.setText("");
        cbRole.setSelectedIndex(0);
        rdMale.setSelected(true);
        txtLogin.requestFocus();
        lblUserId.setText("-1");
    }
      private void enbleForm(boolean isEnable) {
        txtLogin.setEnabled(isEnable);
        txtPassword.setEnabled(isEnable);
        txtName.setEnabled(isEnable);
        cbRole.setEnabled(isEnable);
        rdMale.setEnabled(isEnable);
        rdFemale.setEnabled(isEnable);
        btnSave.setEnabled(isEnable);
        btnClear.setEnabled(isEnable);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    private UserService userService;
}
