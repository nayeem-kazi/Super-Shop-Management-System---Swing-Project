
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame {


    public LoginPage() {
        initComponents();
        userType();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfUname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        cmbActype = new javax.swing.JComboBox<>();
        psdPass = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Super Shop - Login");

        jPanel2.setBackground(new java.awt.Color(163, 69, 238));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 158, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Login Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Login As :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, 146, -1));

        tfUname.setBackground(new java.awt.Color(255, 158, 42));
        tfUname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(tfUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 105, 148, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("User Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 105, 146, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 146, -1));

        btnLogin.setBackground(new java.awt.Color(255, 158, 42));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 235, -1, -1));

        cmbActype.setBackground(new java.awt.Color(255, 158, 42));
        cmbActype.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(cmbActype, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 52, 148, -1));

        psdPass.setBackground(new java.awt.Color(255, 158, 42));
        psdPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(psdPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 160, 148, -1));

        btnClear.setBackground(new java.awt.Color(255, 158, 42));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 235, -1, -1));

        btnClose.setBackground(new java.awt.Color(255, 158, 42));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 239, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 158, 42));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 194, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 117, 346, 333));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(216, 78, 21));
        jLabel6.setText("MANAGEMENT SYSTEM");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 440, 170));

        jLabel7.setBackground(new java.awt.Color(255, 158, 42));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 158, 42));
        jLabel7.setText("SUPER SHOP");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -50, 260, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 330));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 510, 330));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAll.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    PreparedStatement pst; 
    
    String sqlUrl = "jdbc:mysql://localhost:3306/super_shop_management_dtbs";
    String sqlUser = "root";
    String sqlPassword = "nclc123"; 
    

    
    void userType(){

            try {
            con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            pst = con.prepareStatement("SELECT DISTINCT user_type FROM user_info");
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cmbActype.addItem(rs.getString(1));
            }   
             
        } catch (SQLException e) {
            System.out.println(e);
        }
            try {
                
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
    }
       
    void login(){
        String users, passwords,types, p="", u="", t = "";
        types = cmbActype.getSelectedItem().toString();
        users = tfUname.getText();
        passwords = psdPass.getText();
        if (users.isEmpty()|| passwords.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter User Name and Password First!");
        } else {
            try {
            con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            pst = con.prepareStatement("SELECT pass, user_name, user_type FROM user_info WHERE user_name = ?");
            pst.setString(1, users);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            p = rs.getString(1);                              
            u = rs.getString(2);                              
            t = rs.getString(3);                              
            }
            
            if (passwords.equals(p) && users.equals(u) && types.equals(t)) {
             
                //db.su = tfUname.getText();
                JOptionPane.showMessageDialog(rootPane, "Congratulations!\nYour are login Sucessfully!");
                //DashBoard.lblUserName.setText((String)LoginPage.tfUname.getText());
                new DashBoard().setVisible(true);
                
                
            } else {
                JOptionPane.showMessageDialog(this, "SORRY!\nYour user or password is Wrong!");
            }
                          
        } catch (SQLException e) {
            System.out.println(e);
        }
            try {
                
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }    
    void clear(){
        tfUname.setText("");
        psdPass.setText("");
    }
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            psdPass.setEchoChar((char)0);
        } else {
            psdPass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    public static javax.swing.JComboBox<String> cmbActype;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField psdPass;
    public static javax.swing.JTextField tfUname;
    // End of variables declaration//GEN-END:variables
}
