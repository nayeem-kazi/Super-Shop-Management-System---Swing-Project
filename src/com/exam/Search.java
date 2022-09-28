
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Search extends javax.swing.JFrame {


    public Search() {
        initComponents();
        tableColumn();
        loadCatagory();
        loadBrand();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfProduct = new javax.swing.JTextField();
        rbtnPname = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        cmbCat = new javax.swing.JComboBox<>();
        rbtnCatagory = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        cmbBrand = new javax.swing.JComboBox<>();
        rbtnBrand = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblReportName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(163, 69, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 158, 42));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(172, 213, 233));

        tfProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfProductKeyReleased(evt);
            }
        });

        rbtnPname.setBackground(new java.awt.Color(172, 213, 233));
        buttonGroup1.add(rbtnPname);
        rbtnPname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbtnPname.setText("Search By Product Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtnPname))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(tfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnPname)
                .addGap(18, 18, 18)
                .addComponent(tfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(172, 213, 233));

        cmbCat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCatItemStateChanged(evt);
            }
        });

        rbtnCatagory.setBackground(new java.awt.Color(172, 213, 233));
        buttonGroup1.add(rbtnCatagory);
        rbtnCatagory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbtnCatagory.setText("Search By Catagory");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnCatagory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnCatagory)
                .addGap(15, 15, 15)
                .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(172, 213, 233));

        cmbBrand.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBrandItemStateChanged(evt);
            }
        });

        rbtnBrand.setBackground(new java.awt.Color(172, 213, 233));
        buttonGroup1.add(rbtnBrand);
        rbtnBrand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbtnBrand.setText("Search By Brand");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnBrand)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rbtnBrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 158, 42));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblReportName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReportName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportName.setText("Search Result");

        tableReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableReport);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(lblReportName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(440, 440, 440))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReportName)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     Connection con;
    PreparedStatement pst;
    
    String SqlUrl = "jdbc:mysql://localhost:3306/super_shop_management_dtbs";
    String SqlUser = "root";
    String SqlPass = "nclc123";
    DefaultTableModel dtm;
    
    
        void tableColumn(){
       dtm = (DefaultTableModel) tableReport.getModel();
       dtm.setColumnCount(0);
       dtm.addColumn("Product ID");
       dtm.addColumn("Product name");
       dtm.addColumn("Brand");
       dtm.addColumn("Catagory");
       dtm.addColumn("Unit");
       dtm.addColumn("Unit Price");
       dtm.addColumn("Stock");
       dtm.addColumn("Rak No");

    }
        
            void loadCatagory(){
        
        try {
            cmbCat.addItem("Select One");
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT DISTINCT catagory FROM product_info ");
            ResultSet rs = pst.executeQuery();
            
            String id;
            while (rs.next()) {
                id = rs.getString(1);
                cmbCat.addItem(id);                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
     
     }
      
        void loadBrand(){
        
        try {
            cmbBrand.addItem("Select One");
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT DISTINCT brand FROM product_info ");
            ResultSet rs = pst.executeQuery();
            
            String id;
            while (rs.next()) {
                id = rs.getString(1);
                cmbBrand.addItem(id);                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
     
     }
     
        void tableSearchProductName(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE p_name LIKE '"+tfProduct.getText()+"%'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));                
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
        void tableSearchCatagory(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE catagory = '"+cmbCat.getSelectedItem().toString()+"'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));                
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
                
      void tableSearchBrand(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE brand ='"+cmbBrand.getSelectedItem().toString()+"'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));                
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }  
    private void tfProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductKeyReleased
        if (rbtnPname.isSelected()) {
            if (tfProduct.getText().isEmpty()) {
                dtm.setRowCount(0);
            } else {
                tableSearchProductName();
            }
        } 
    }//GEN-LAST:event_tfProductKeyReleased

    private void cmbCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCatItemStateChanged
        if (rbtnCatagory.isSelected()) {
            if (cmbCat.getSelectedItem().toString().equals("Select One")) {
                dtm.setRowCount(0);
            } else {
                tableSearchCatagory();
            }
        }
    }//GEN-LAST:event_cmbCatItemStateChanged

    private void cmbBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBrandItemStateChanged
        if (rbtnBrand.isSelected()) {
            if (cmbBrand.getSelectedItem().toString().equals("Select One")) {
                dtm.setRowCount(0);
            } else {
                tableSearchBrand();
            }
        }
    }//GEN-LAST:event_cmbBrandItemStateChanged

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbBrand;
    private javax.swing.JComboBox<String> cmbCat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReportName;
    private javax.swing.JRadioButton rbtnBrand;
    private javax.swing.JRadioButton rbtnCatagory;
    private javax.swing.JRadioButton rbtnPname;
    private javax.swing.JTable tableReport;
    private javax.swing.JTextField tfProduct;
    // End of variables declaration//GEN-END:variables
}
