
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ReturnProduct extends javax.swing.JFrame {


    public ReturnProduct() {
        initComponents();
        tidDate();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfDid = new javax.swing.JTextField();
        tfDName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfDadd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfDmobile = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPname = new javax.swing.JTextField();
        tfBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfUnitPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfQty = new javax.swing.JTextField();
        cmbPid = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        tfTprice = new javax.swing.JTextField();
        tfStock = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCatagory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfUnit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTnsID = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 158, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Return Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 158, 42));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Dist/Cust ID :");

        tfDid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfDid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDidKeyReleased(evt);
            }
        });

        tfDName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Name :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Address :");

        tfDadd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Mobile :");

        tfDmobile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(tfDName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(tfDadd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(tfDmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(tfDid, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfDid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfDName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfDadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfDmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(255, 158, 42));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Product Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Product ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Product Name :");

        tfPname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        tfBrand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Brand :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Unit Price :");

        tfUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Qty :");

        tfQty.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQtyKeyReleased(evt);
            }
        });

        cmbPid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmbPid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPidItemStateChanged(evt);
            }
        });
        cmbPid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbPidKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Total Price :");

        tfTprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        tfStock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Stock :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Catagory :");

        tfCatagory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Unit :");

        tfUnit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQty, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbPid, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfTprice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfTprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Transaction ID :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Date :");

        lblTnsID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTnsID.setText("000000");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDate.setText("00/00/0000");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("yyyy / mm / dd");

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn.setText("RETURN");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(510, 510, 510))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTnsID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(lblTnsID)
                            .addComponent(lblDate))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReturn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnCancel)))
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    void tidDate(){
        int trn = 0;
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT  max(transaction_id)  FROM product_history" );
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                trn = rs.getInt(1)+1;                
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        lblTnsID.setText(String.valueOf(trn));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        sdf.format(d);
        lblDate.setText(sdf.format(d));

    }
    
    void loadPid(){
        
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT DISTINCT p_id FROM product_history WHERE c_d_id ='"+tfDid.getText()+"'");
            ResultSet rs = pst.executeQuery();
            
            String id;
            while (rs.next()) {
                id = rs.getString(1);
                cmbPid.addItem(id);                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
     
     }
   
    void loadData(){

        try {
            
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE p_id ="+cmbPid.getSelectedItem().toString());
    
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tfPname.setText(rs.getString(2));
                tfBrand.setText(rs.getString(3));
                tfCatagory.setText(rs.getString(4));
                tfUnit.setText(rs.getString(5));
                tfUnitPrice.setText(rs.getString(6));
                tfStock.setText(rs.getString(7));            
                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
     
     }
    void totalPrice(){
        try {
        Double up = Double.parseDouble(tfUnitPrice.getText());
        int qty = Integer.parseInt(tfQty.getText());
        Double total = up*qty; 
        tfTprice.setText(total.toString());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    void returnProductC(){
       
            String trnid, date, did, dname, dadd, dmobile, pid, pname, brand, catagory, unit, uprice,qty, totalprice,stock, ustock, status = "Returned", type = "";
            
        type = lblType.getText();
        trnid = lblTnsID.getText();
        date = lblDate.getText();
        did = tfDid.getText();
        dname = tfDName.getText();
        dadd = tfDadd.getText();
        dmobile = tfDmobile.getText();
        String pm = "^\\+?[0-9]{11,13}$";
        pid = cmbPid.getSelectedItem().toString();
        pname = tfPname.getText();
        brand = tfBrand.getText();
        catagory = tfCatagory.getText();
        unit = tfUnit.getText();
        uprice = tfUnitPrice.getText();
        qty = tfQty.getText();        
        totalprice = tfTprice.getText();
        stock = tfStock.getText();
            if (stock.isEmpty()) {
                stock = "0";
            }        
        int q = Integer.parseInt(qty);
        int s = Integer.parseInt(stock);
        int us = s+q;
        ustock = String.valueOf(us);
        tfStock.setText(ustock);
        
        
            if (dmobile.matches(pm)) {
            
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("UPDATE product_info SET stock = " + ustock + " WHERE p_id = " +pid );
            pst.executeUpdate();
            } 
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println(e);
        }
        catch (SQLException e) {
            System.out.println(e);
        }
            
        try {
            pst = con.prepareStatement("INSERT INTO product_history(transaction_id, c_d_id, p_id, p_name, brand, p_catagory, p_unit, p_unit_price,qty,total_price, status, date ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ");
            pst.setString(1, trnid);
            pst.setString(2, did);
            pst.setString(3, pid);
            pst.setString(4, pname);
            pst.setString(5, brand);
            pst.setString(6, catagory);
            pst.setString(7, unit);
            pst.setString(8, uprice);
            pst.setString(9, qty);
            pst.setString(10, totalprice);
            pst.setString(11, status);
            pst.setString(12, date);
            pst.executeUpdate();
            } 
        catch (SQLIntegrityConstraintViolationException e) {
            
        }
        catch (SQLException e) {
            System.out.println(e);
        }    
                try {            
            pst = con.prepareStatement("INSERT INTO customer_distributor_info VALUES (?,?,?,?,?) ");
            pst.setString(1, did);
            pst.setString(2, dname);
            pst.setString(3, dmobile);
            pst.setString(4, dadd);
            pst.setString(5, type);            
            pst.executeUpdate();        
                      
        } 
        catch (SQLIntegrityConstraintViolationException e) {
            
        }
        catch (SQLException e) {
            System.out.println(e);
        }
                JOptionPane.showMessageDialog(this,"Product Returned Successfully!" );
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter a valid Mobile No");
            }
        
        

        
        
    }
    
    void returnProductD(){
       
            String trnid, date, did, dname, dadd, dmobile, pid, pname, brand, catagory, unit, uprice,qty, totalprice,stock, ustock, status = "Returned", type = "";
            
        type = lblType.getText();
        trnid = lblTnsID.getText();
        date = lblDate.getText();
        did = tfDid.getText();
        dname = tfDName.getText();
        dadd = tfDadd.getText();
        dmobile = tfDmobile.getText();
        String pm = "^\\+?[0-9]{11,13}$";
        pid = cmbPid.getSelectedItem().toString();
        pname = tfPname.getText();
        brand = tfBrand.getText();
        catagory = tfCatagory.getText();
        unit = tfUnit.getText();
        uprice = tfUnitPrice.getText();
        qty = tfQty.getText();        
        totalprice = tfTprice.getText();
        stock = tfStock.getText();
            if (stock.isEmpty()) {
                stock = "0";
            }        
        int q = Integer.parseInt(qty);
        int s = Integer.parseInt(stock);
        int us = s-q;
        ustock = String.valueOf(us);
        
        if (q>s) {
            JOptionPane.showMessageDialog(rootPane, "You have not enough  Product To Return!");
        } else {
                       if (dmobile.matches(pm)) {
            
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("UPDATE product_info SET stock = " + ustock + " WHERE p_id = " +pid );
            pst.executeUpdate();
            } 
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println(e);
        }
        catch (SQLException e) {
            System.out.println(e);
        }
            
        try {
            pst = con.prepareStatement("INSERT INTO product_history(transaction_id, c_d_id, p_id, p_name, brand, p_catagory, p_unit, p_unit_price,qty,total_price, status, date ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ");
            pst.setString(1, trnid);
            pst.setString(2, did);
            pst.setString(3, pid);
            pst.setString(4, pname);
            pst.setString(5, brand);
            pst.setString(6, catagory);
            pst.setString(7, unit);
            pst.setString(8, uprice);
            pst.setString(9, qty);
            pst.setString(10, totalprice);
            pst.setString(11, status);
            pst.setString(12, date);
            pst.executeUpdate();
            } 
        catch (SQLIntegrityConstraintViolationException e) {
            
        }
        catch (SQLException e) {
            System.out.println(e);
        }    
                try {            
            pst = con.prepareStatement("INSERT INTO customer_distributor_info VALUES (?,?,?,?,?) ");
            pst.setString(1, did);
            pst.setString(2, dname);
            pst.setString(3, dmobile);
            pst.setString(4, dadd);
            pst.setString(5, type);            
            pst.executeUpdate();        
                      
        } 
        catch (SQLIntegrityConstraintViolationException e) {
            
        }
        catch (SQLException e) {
            System.out.println(e);
        }
                JOptionPane.showMessageDialog(this,"Product Returned Successfully!" );
                tfStock.setText(ustock);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter a valid Mobile No");
            }
        
        }
        
        
        
        
 
        

        
        
    }
    
    void existCustomer(){
        String id="",name="", add="",mobile="", type ="";
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM customer_distributor_info WHERE id ="+tfDid.getText());
            ResultSet rs = pst.executeQuery();
            
            
            while (rs.next()) {                
                id = rs.getString(1);
                name = rs.getString(2);
                mobile = rs.getString(3);
                add = rs.getString(4);                               
                type = rs.getString(5);                               
            }
            if (id.isEmpty()|| ! id.equals(tfDid.getText())) {
            tfDName.setText("");
            tfDadd.setText("");
            tfDmobile.setText("");
            lblType.setText("");
            cmbPid.removeAllItems();
            
//            tfDName.setEnabled(true);
//            tfDadd.setEnabled(true);
//            tfDmobile.setEnabled(true);           
            } else {
            tfDName.setText(name);
            tfDadd.setText(add);
            tfDmobile.setText(mobile);
            lblType.setText(type);
            loadPid();
//            tfDName.setEnabled(false);
//            tfDadd.setEnabled(false);
//            tfDmobile.setEnabled(false);
            
            }
        }       


        catch (NumberFormatException | SQLException ex) {
            System.out.println(ex);

        }

    }
     public void clear(){
        cmbPid.setSelectedIndex(0);
        tfQty.setText("");
        tfTprice.setText("");
        tfDid.setText("");
        tfDName.setText("");
        tfDadd.setText("");
        tfDmobile.setText("");
    }
  
    private void tfDidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDidKeyReleased
        existCustomer();
    }//GEN-LAST:event_tfDidKeyReleased

    private void tfQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQtyKeyReleased
        totalPrice();
    }//GEN-LAST:event_tfQtyKeyReleased

    private void cmbPidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPidItemStateChanged
        
        try {
            loadData();
        } 
        catch (NullPointerException e) {
            tfPname.setText("");
            tfCatagory.setText("");
            tfBrand.setText("");
            tfStock.setText("");
            tfUnit.setText("");
            tfUnitPrice.setText("");                    
            tfQty.setText("");
            tfTprice.setText("");
        }
        catch (Exception e) {
        }

    }//GEN-LAST:event_cmbPidItemStateChanged

    private void cmbPidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPidKeyReleased

    }//GEN-LAST:event_cmbPidKeyReleased

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        int q = JOptionPane.showConfirmDialog(rootPane, "Do you confirm to Return the Product!");
        String type = lblType.getText();
        
        if (q==0) {
            if (type.equals("Customer")) {
            returnProductC();
            tidDate();
            }
            if (type.equals("Distributor")) {
            returnProductD();
            tidDate();
            }
        } else {

        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new ProductManagement().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbPid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTnsID;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField tfBrand;
    private javax.swing.JTextField tfCatagory;
    private javax.swing.JTextField tfDName;
    private javax.swing.JTextField tfDadd;
    private javax.swing.JTextField tfDid;
    private javax.swing.JTextField tfDmobile;
    private javax.swing.JTextField tfPname;
    private javax.swing.JTextField tfQty;
    private javax.swing.JTextField tfStock;
    private javax.swing.JTextField tfTprice;
    private javax.swing.JTextField tfUnit;
    private javax.swing.JTextField tfUnitPrice;
    // End of variables declaration//GEN-END:variables
}
