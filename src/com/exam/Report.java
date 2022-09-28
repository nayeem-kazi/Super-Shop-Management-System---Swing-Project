
package com.exam;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Report extends javax.swing.JFrame {


    public Report() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProductList = new javax.swing.JButton();
        btnPurchases = new javax.swing.JButton();
        btnUnavailable = new javax.swing.JButton();
        btnStockOut = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnDashBoard = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnDistributor = new javax.swing.JButton();
        btnSels = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblReportName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(163, 69, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 158, 42));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnProductList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnProductList.setText("All Product List");
        btnProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductListActionPerformed(evt);
            }
        });

        btnPurchases.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPurchases.setText("Purches Report");
        btnPurchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchasesActionPerformed(evt);
            }
        });

        btnUnavailable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUnavailable.setText("All Most Unavailable");
        btnUnavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnavailableActionPerformed(evt);
            }
        });

        btnStockOut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnStockOut.setText("Out Of Stock Prioducts");
        btnStockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockOutActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnReturn.setText("Return Report");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnHistory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnHistory.setText("Product History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnDashBoard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDashBoard.setText("Go To Dashboard");
        btnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashBoardActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCustomer.setText("All Customer List");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnDistributor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDistributor.setText("All Distributor List");
        btnDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistributorActionPerformed(evt);
            }
        });

        btnSels.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSels.setText("Sells Report");
        btnSels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStockOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUnavailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDistributor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnProductList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCustomer)
                .addGap(18, 18, 18)
                .addComponent(btnDistributor)
                .addGap(18, 18, 18)
                .addComponent(btnHistory)
                .addGap(21, 21, 21)
                .addComponent(btnSels)
                .addGap(18, 18, 18)
                .addComponent(btnPurchases)
                .addGap(18, 18, 18)
                .addComponent(btnReturn)
                .addGap(18, 18, 18)
                .addComponent(btnUnavailable)
                .addGap(18, 18, 18)
                .addComponent(btnStockOut)
                .addGap(18, 18, 18)
                .addComponent(btnDashBoard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 158, 42));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblReportName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReportName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportName.setLabelFor(jPanel3);
        lblReportName.setText("Report");

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(lblReportName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(417, 417, 417)))
                .addGap(23, 23, 23))
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

    void tableC1(){
       dtm = (DefaultTableModel) tableReport.getModel();
       dtm.setColumnCount(0);
       dtm.addColumn("ID");
       dtm.addColumn("Name");
       dtm.addColumn("Contact No");
       dtm.addColumn("Address");

    }
    void tableC2(){
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
    
    void tableC3(){
       dtm = (DefaultTableModel) tableReport.getModel();
       dtm.setColumnCount(0);
       dtm.addColumn("Transaction ID");
       dtm.addColumn("Dis/Cus ID");
       dtm.addColumn("Product ID");
       dtm.addColumn("Product name");
       dtm.addColumn("Brand");
       dtm.addColumn("Catagory");
       dtm.addColumn("Unit");
       dtm.addColumn("Unit Price");
       dtm.addColumn("Quantity");
       dtm.addColumn("Total Price");
       dtm.addColumn("Status");
       dtm.addColumn("Date");

    }
    
    
    void tableDistributor(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM customer_distributor_info WHERE type = '"+"Distributor"+"'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    void tableCustomer(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM customer_distributor_info WHERE type = '"+"Customer"+"'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    void tableProduct(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info");
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
    
    void tableProductHistory(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_history");
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
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(13));
                v.add(rs.getString(14));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
        
    void tableProductReturn(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_history WHERE status = 'Returned'");
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
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(13));
                v.add(rs.getString(14));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
        
    void tableProductSells(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_history WHERE status = 'Sells'");
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
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(13));
                v.add(rs.getString(14));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
        
    void tableProductPurchases(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_history WHERE status = 'Purchases'");
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
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(13));
                v.add(rs.getString(14));                
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
        
    void tableStockOut(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE stock < 1");
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
    void tableAlmostStockOut(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE stock < 20 AND stock > 0");
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
    
    void print(){
//                String path = "E:";
//        exam.itextpdf.text.Document doc = new exam.itextpdf.text.Document();
//        try {
//            PdfWriter.getInstance(doc, new FileOutputStream(path +"bill.pdf"));
//            doc.open();
//            Paragraph cafaname = new Paragraph("                                                  Cafa Management System \n");
//            doc.add(cafaname);
//            Paragraph starline = new Paragraph("                 *******************************************************************************************");
//            doc.add(starline);
//            Paragraph paragraph = new Paragraph("\tBill id :" + id1+ "\nCustomar Name: " + name + " \nTotal paid: "+ total2);
//            doc.add(paragraph);
//            doc.add(starline);
//            PdfPTable tb1 = new PdfPTable(4);
//            tb1.addCell("Name");
//            tb1.addCell("Price");
//            tb1.addCell("Quantity");
//            tb1.addCell("Total");
//            for(int i =0 ;i < jTable2.getRowCount(); i++){
//            String n = jTable2.getValueAt(i, 0).toString();
//            String d = jTable2.getValueAt(i, 1).toString();
//            String r = jTable2.getValueAt(i, 2).toString();
//            String q = jTable2.getValueAt(i, 3).toString();
//            tb1.addCell(n);
//            tb1.addCell(d);
//            tb1.addCell(r);
//            tb1.addCell(q);
//            }
//            doc.add(tb1);
//            doc.add(starline);
//            Paragraph tahnk = new Paragraph("Thank you, Please visit Again");
//            doc.add(tahnk);
//            Open.openbyid(String.valueOf(tb1));
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        doc.close();
    }
    
    
    private void btnProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductListActionPerformed
        lblReportName.setText("All Product List");
        tableC2();
        tableProduct();
    }//GEN-LAST:event_btnProductListActionPerformed

    private void btnPurchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchasesActionPerformed
        lblReportName.setText("Purchase History");
        tableC3();
        tableProductPurchases();
    }//GEN-LAST:event_btnPurchasesActionPerformed

    private void btnUnavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnavailableActionPerformed
        lblReportName.setText("Allmost Out of Stock Product List");
        tableC2();
        tableAlmostStockOut();
    }//GEN-LAST:event_btnUnavailableActionPerformed

    private void btnStockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockOutActionPerformed
        lblReportName.setText("Out of Stock Product List");
        tableC2();
        tableStockOut();
    }//GEN-LAST:event_btnStockOutActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        lblReportName.setText("Return History");
        tableC3();
        tableProductReturn();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        lblReportName.setText("Product History");
        tableC3();
        tableProductHistory();
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashBoardActionPerformed

        new DashBoard().setVisible(true);
        //System.exit(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnDashBoardActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        lblReportName.setText("All Customer List");
        tableC1();
        tableCustomer();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistributorActionPerformed
        lblReportName.setText("All Distributor List");
        tableC1();
        tableDistributor();
    }//GEN-LAST:event_btnDistributorActionPerformed

    private void btnSelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelsActionPerformed
        lblReportName.setText("Sells History");
        tableC3();
        tableProductSells();
    }//GEN-LAST:event_btnSelsActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDashBoard;
    private javax.swing.JButton btnDistributor;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnProductList;
    private javax.swing.JButton btnPurchases;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSels;
    private javax.swing.JButton btnStockOut;
    private javax.swing.JButton btnUnavailable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReportName;
    private javax.swing.JTable tableReport;
    // End of variables declaration//GEN-END:variables
}
