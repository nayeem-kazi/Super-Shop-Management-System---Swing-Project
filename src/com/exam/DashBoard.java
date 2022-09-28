
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class DashBoard extends javax.swing.JFrame {


    public DashBoard() {
        initComponents();
        ataGlance();
        tableC1();
        tableC2();
        tableProduct();
        tableProductSellsHistory();
        LoginPage lp = new LoginPage();
                
        System.out.println(lp.tfUname.getText());
        System.out.println(lp.cmbActype.getSelectedItem().toString());
        lblUserName.setText(lp.tfUname.getText());
        lblLogintype.setText(lp.cmbActype.getSelectedItem().toString());
   
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        btnUmange = new javax.swing.JButton();
        btnPmanage = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfPbrand = new javax.swing.JTextField();
        tfupitem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tftts = new javax.swing.JTextField();
        tfTtp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfPcatagories = new javax.swing.JTextField();
        tfPitem = new javax.swing.JTextField();
        tfapitem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlist = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSellsHistory = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblLogintype = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDashboard.setBackground(new java.awt.Color(163, 69, 238));
        pnlDashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dashboard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlDashboard.setForeground(new java.awt.Color(255, 255, 255));
        pnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 158, 42));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProfile.setBackground(new java.awt.Color(163, 69, 238));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel2.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 207, -1));

        btnUmange.setBackground(new java.awt.Color(163, 69, 238));
        btnUmange.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUmange.setForeground(new java.awt.Color(255, 255, 255));
        btnUmange.setText("User Management");
        btnUmange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmangeActionPerformed(evt);
            }
        });
        jPanel2.add(btnUmange, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 207, -1));

        btnPmanage.setBackground(new java.awt.Color(163, 69, 238));
        btnPmanage.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPmanage.setForeground(new java.awt.Color(255, 255, 255));
        btnPmanage.setText("Product Management");
        btnPmanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPmanageActionPerformed(evt);
            }
        });
        jPanel2.add(btnPmanage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btnSearch.setBackground(new java.awt.Color(163, 69, 238));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 207, -1));

        btnReport.setBackground(new java.awt.Color(163, 69, 238));
        btnReport.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel2.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 207, -1));

        btnLogout.setBackground(new java.awt.Color(163, 69, 238));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 207, -1));

        pnlDashboard.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 230, 460));

        jPanel3.setBackground(new java.awt.Color(255, 158, 42));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("At a Glance");

        jPanel1.setBackground(new java.awt.Color(163, 69, 238));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tfPbrand.setEditable(false);
        tfPbrand.setBackground(new java.awt.Color(163, 69, 238));
        tfPbrand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfPbrand.setForeground(java.awt.Color.white);

        tfupitem.setEditable(false);
        tfupitem.setBackground(new java.awt.Color(163, 69, 238));
        tfupitem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfupitem.setForeground(java.awt.Color.white);

        jLabel9.setBackground(new java.awt.Color(163, 69, 238));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Todays Total Purchases :");

        jLabel8.setBackground(new java.awt.Color(163, 69, 238));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Todays Total Sell :");

        tftts.setEditable(false);
        tftts.setBackground(new java.awt.Color(163, 69, 238));
        tftts.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tftts.setForeground(java.awt.Color.white);

        tfTtp.setEditable(false);
        tfTtp.setBackground(new java.awt.Color(163, 69, 238));
        tfTtp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfTtp.setForeground(java.awt.Color.white);

        jLabel6.setBackground(new java.awt.Color(163, 69, 238));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Total Available ");

        tfPcatagories.setEditable(false);
        tfPcatagories.setBackground(new java.awt.Color(163, 69, 238));
        tfPcatagories.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfPcatagories.setForeground(java.awt.Color.white);

        tfPitem.setEditable(false);
        tfPitem.setBackground(new java.awt.Color(163, 69, 238));
        tfPitem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfPitem.setForeground(java.awt.Color.white);

        tfapitem.setEditable(false);
        tfapitem.setBackground(new java.awt.Color(163, 69, 238));
        tfapitem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfapitem.setForeground(java.awt.Color.white);

        jLabel4.setBackground(new java.awt.Color(163, 69, 238));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Total Brand : ");

        jLabel10.setBackground(new java.awt.Color(163, 69, 238));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Product Item : ");

        jLabel3.setBackground(new java.awt.Color(163, 69, 238));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Total Product Item : ");

        jLabel7.setBackground(new java.awt.Color(163, 69, 238));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Total Unavailable");

        jLabel11.setBackground(new java.awt.Color(163, 69, 238));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Product Item : ");

        jLabel5.setBackground(new java.awt.Color(163, 69, 238));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Total Catagories : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTtp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tftts, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfupitem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfapitem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPcatagories, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfPbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfPitem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(tfPitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(tfPbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(tfPcatagories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tfapitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11)
                        .addGap(18, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfupitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(tftts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(tfTtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablePlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablePlist);

        tableSellsHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableSellsHistory);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Today's Sells History");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Product List");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlDashboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 850, 460));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME ");
        pnlDashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("UserName");
        pnlDashboard.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOGIN AS - ");
        pnlDashboard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        lblLogintype.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogintype.setForeground(new java.awt.Color(255, 255, 255));
        lblLogintype.setText("login type");
        pnlDashboard.add(lblLogintype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        getContentPane().add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    PreparedStatement pst;
    
    String SqlUrl = "jdbc:mysql://localhost:3306/super_shop_management_dtbs";
    String SqlUser = "root";
    String SqlPass = "nclc123";
    DefaultTableModel dtm;
    DefaultTableModel dtm1;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String tdate = sdf.format(d).toString();
    void ataGlance(){
        String tpi ="", tb ="",tc="",tapi="",tupi="",tts="",ttp="";
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String tdate = sdf.format(d).toString();
  
//        lblDate.setText(sdf.format(d));
        try {
            
            //jdbc Connection
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            
            //product item count
            pst = con.prepareStatement("SELECT count(distinct(p_id)) FROM product_info;");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tpi = rs.getString(1);
                
            }
            tfPitem.setText(tpi);
            
            //brand count
            pst = con.prepareStatement("SELECT count(distinct(brand)) FROM product_info;");
            ResultSet rs1 = pst.executeQuery();
            while (rs1.next()) {
                tb = rs1.getString(1);
                
            }
            tfPbrand.setText(tb);
            
            //catagory count
            pst = con.prepareStatement("SELECT count(distinct(catagory)) FROM product_info;");
            ResultSet rs2 = pst.executeQuery();
            while (rs2.next()) {
                tc = rs2.getString(1);
                
            }
            tfPcatagories.setText(tc);
            
            //available product item count
            pst = con.prepareStatement("SELECT count(distinct(p_id)) FROM product_info WHERE stock>0;");
            ResultSet rs3 = pst.executeQuery();
            while (rs3.next()) {
                tapi = rs3.getString(1);
                
            }
            tfapitem.setText(tapi);
            
            //unavailable product item count
            pst = con.prepareStatement("SELECT count(distinct(p_id)) FROM product_info WHERE stock<1;");
            ResultSet rs4 = pst.executeQuery();
            while (rs4.next()) {
                tupi = rs4.getString(1);
                
            }
            tfupitem.setText(tupi);
            
            
            //todays total sell count
            pst = con.prepareStatement("SELECT sum(total_price) FROM product_history WHERE date=? and status = 'Sells'");
            pst.setString(1, tdate);
            ResultSet rs5 = pst.executeQuery();
            while (rs5.next()) {
                tts = rs5.getString(1);
                
            }
            tftts.setText(tts);
            
            
            //todays total sell count
            pst = con.prepareStatement("SELECT sum(total_price) FROM product_history WHERE date=? and status = 'Purchases'");
            pst.setString(1, tdate);
            ResultSet rs6 = pst.executeQuery();
            while (rs6.next()) {
                ttp = rs6.getString(1);
                
            }
            tfTtp.setText(ttp);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
    void tableC1(){
       dtm = (DefaultTableModel) tablePlist.getModel();
       dtm.setColumnCount(0);

       dtm.addColumn("Catagory");
       dtm.addColumn("Product Name");
       dtm.addColumn("Brand");

    }
    void tableC2(){
       dtm1 = (DefaultTableModel) tableSellsHistory.getModel();
       dtm1.setColumnCount(0);
       dtm1.addColumn("Transaction ID");
       dtm1.addColumn("Product name");
       dtm1.addColumn("Unit Price");
       dtm1.addColumn("Quantity");
       dtm1.addColumn("Sell Price");
    }
    
    
    void tableProduct(){
        try {
            dtm.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();


                v.add(rs.getString(4));                
                v.add(rs.getString(2));
                v.add(rs.getString(3));           
                dtm.addRow(v);
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    void tableProductSellsHistory(){
        try {
            dtm1.setRowCount(0);
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_history WHERE date=? and status = 'Sells' ");
            pst.setString(1, tdate);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();


                v.add(rs.getString(1));                
                v.add(rs.getString(4));                
                v.add(rs.getString(8));
                v.add(rs.getString(9));           
                v.add(rs.getString(10));           
                dtm1.addRow(v);
              
            }
            
            pst = con.prepareStatement("SELECT sum(total_price) FROM product_history WHERE date=? and status = 'Sells' ");
            pst.setString(1, tdate);
            ResultSet rs1 = pst.executeQuery();
            String ts = "";
            while (rs1.next()) {
                ts = rs1.getString(1);             
            }
               Vector v = new Vector();
                v.add("");                
                v.add("");                
                v.add("");
                v.add("Total Sell");           
                v.add(ts);           
                dtm1.addRow(v);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        new Profile().setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnUmangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUmangeActionPerformed

    private void btnPmanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPmanageActionPerformed
       new ProductManagement().setVisible(true);
    }//GEN-LAST:event_btnPmanageActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    new Search().setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        new Report().setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginPage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPmanage;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUmange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblLogintype;
    public static javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JTable tablePlist;
    private javax.swing.JTable tableSellsHistory;
    private javax.swing.JTextField tfPbrand;
    private javax.swing.JTextField tfPcatagories;
    private javax.swing.JTextField tfPitem;
    private javax.swing.JTextField tfTtp;
    private javax.swing.JTextField tfapitem;
    private javax.swing.JTextField tftts;
    private javax.swing.JTextField tfupitem;
    // End of variables declaration//GEN-END:variables
}
