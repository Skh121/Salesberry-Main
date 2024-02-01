/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.groupc.saleberry.View;

import com.groupc.saleberry.Database.MySqlConnection;
import com.groupc.saleberry.Model.Sell;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Panel1 extends javax.swing.JFrame {
    public Panel1() {
        initComponents();
    }
    public void setVarName(String text){
    varName.setText(text);
    }
    public void setPrice(String text){
    price.setText(text);
    }
    public void setC1(String text){
    c1.setText(text);
    }
    public void setC2(String text){
    c2.setText(text);
    }
    public void setP1(String text){
    p1.setText(text);
    }
//    
    public int getC1(){
        int num3= Integer.parseInt(c1.getText());
        return num3;
    }
    
    public String getC2(){
        return c2.getText();
    }
    public int getP1(){
       int num4= Integer.parseInt(p1.getText());
        return num4;
    }
    public String getVarName(){
        return varName.getText();
    }
    public int getPrice(){
        int num = Integer.parseInt(price.getText());
        return num;
    }
    public int getPr2(){
        int num1 = Integer.parseInt(pr2.getText());
        return num1;
    }
    public int getPr3(){
        int num2 = Integer.parseInt(pr3.getText());
        return num2;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new com.groupc.saleberry.custombutton.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        c1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        varName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        pr2 = new javax.swing.JTextField();
        pr3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Category ID");

        c1.setEditable(false);
        c1.setBackground(new java.awt.Color(255, 255, 255));
        c1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Product ID");

        p1.setEditable(false);
        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Category Name");

        c2.setEditable(false);
        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Product Name");

        varName.setEditable(false);
        varName.setBackground(new java.awt.Color(255, 255, 255));
        varName.setFocusable(false);
        varName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                varNameMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Total Price");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Quantity");

        price.setEditable(false);
        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFocusable(false);

        pr3.setEditable(false);
        pr3.setBackground(new java.awt.Color(255, 255, 255));
        pr3.setFocusable(false);
        pr3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pr3MouseEntered(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(varName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound1Layout.createSequentialGroup()
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelRound1Layout.createSequentialGroup()
                                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pr2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pr3)))
                                .addGroup(panelRound1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pr2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pr3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varNameMouseEntered
                              
    }//GEN-LAST:event_varNameMouseEntered
private int tryParseInt(String input) {
    try {
        return Integer.parseInt(input);
    } catch (NumberFormatException e) {
        return -1;
    }
}
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
 MySqlConnection mysqlconnection = new MySqlConnection();
    Connection conn = mysqlconnection.openConnection();
    if (conn != null) {
        try {
            PreparedStatement ps = null;
            String sql = "INSERT INTO sellProducts(category_id,category_name,product_id,product_name,price,quantity,total_price) VALUES(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            int a = Integer.parseInt(c1.getText());
            int b = tryParseInt(p1.getText());
            int c = tryParseInt(price.getText());
            int d = tryParseInt(pr2.getText());
            int e = tryParseInt(pr3.getText());

            if (a == -1 || b == -1 || c == -1 || d == -1 || e == -1) {
                JOptionPane.showMessageDialog(rootPane, "Invalid input");
                return; // Exit the method if any parsing fails
            }

            ps.setInt(1, a);
            ps.setString(2, c2.getText());
            ps.setInt(3, b);
            ps.setString(4, varName.getText());
            ps.setInt(5, c);
            ps.setInt(6, d);
            ps.setInt(7, e);

            int result = ps.executeUpdate();
            if (result == -1) {
                JOptionPane.showMessageDialog(rootPane, "Error Occurred");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Buy Order Placed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // Clearing fields after successful or unsuccessful insertion
    c1.setText("");
    c2.setText("");
    p1.setText("");
    varName.setText("");
    price.setText("");
    pr2.setText("");
    pr3.setText("");        
//MySqlConnection mysqlconnection = new MySqlConnection();
//            Connection conn = mysqlconnection.openConnection();
//        if(conn!=null){
//        try{
//            PreparedStatement ps =null;
//            String sql = "INSERT INTO sellProducts(category_id,category_name,product_id,product_name,price,quantity,total_price) VALUES(?,?,?,?,?,?,?)";
//            ps = conn.prepareStatement(sql);
//            int a = Integer.parseInt(c1.getText());
//            int b = Integer.parseInt(p1.getText());
//            int c = Integer.parseInt(price.getText());
//            int d = Integer.parseInt(pr2.getText());
//            int e = Integer.parseInt(pr3.getText());
//            ps.setInt(1, a);
//            ps.setString(2, c2.getText());
//            ps.setInt(3, b);
//            ps.setString(4, varName.getText());
//            ps.setInt(5, c);
//            ps.setInt(6, d);
//            ps.setInt(7, e);
//            int result = ps.executeUpdate();
//            if(result == -1){
//                JOptionPane.showMessageDialog(rootPane, "Error Occured");
//            }else{
//                JOptionPane.showMessageDialog(rootPane, "Buy Order Placed");
//            }   
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        }
////        c1.setText("");
////        c2.setText("");
////        p1.setText("");
////        varName.setText("");
////        price.setText("");
////        pr2.setText("");
////        pr3.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void pr3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pr3MouseEntered
        try {
        if (!price.getText().isEmpty() && !pr2.getText().isEmpty()) {
            int c = Integer.parseInt(price.getText());
            int d = Integer.parseInt(pr2.getText());
            int e = c * d;
            pr3.setText(String.valueOf(e));
        } else {
            pr3.setText("");
        }
    } catch (NumberFormatException ex) {
        // Handle the case when parsing fails
        pr3.setText("");
    }
    }//GEN-LAST:event_pr3MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField p1;
    private com.groupc.saleberry.custombutton.PanelRound panelRound1;
    private javax.swing.JTextField pr2;
    private javax.swing.JTextField pr3;
    private javax.swing.JTextField price;
    private javax.swing.JTextField varName;
    // End of variables declaration//GEN-END:variables

}

