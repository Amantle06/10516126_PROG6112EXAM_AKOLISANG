/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productappgui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProductAppGUI {
    
    JTextField txtCustomerName;
    JComboBox cmbProduct;
    JTextField txtPrice;
    JButton btnProcess;
    
    public ProductAppGUI(){
        setTitle("Product App");
        setSize(400, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        JLabel lblName = new JLabel("Customer Name:");
        lblName.setBounds(30,30,120,25);
        add(lblName);
        
        txtCustomerName = new JTextField();
        
        txtCustomerName.setBounds(150,30,180,25);
        add(txtCustomerName);
        
        JLabel lblProduct = new JLabel("Select Product:");
        lblProduct.setBounds(30,80,120,25);
        add(lblProduct);
        
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        cmbProduct = new JComboBox(products);
        cmbProduct.setBounds(150,80,180,25);
        add(cmbProduct);
        
        JLabel lblPrice = new JLabel("Enter Price:");
        lblPrice.setBounds(30,130,120,25);
        add(lblPrice);
        
        txtPrice = new JTextField();
        txtPrice.setBounds(150,130,180,25);
        add(txtPrice);
        
        btnProcess = new JButton("PROCESS");
        btnProcess.setBounds(100,180,200,30);
        add(btnProcess);
        
        initEvents();
        }
    
    private void initEvents(){
        btnProcess.addActionListener(new);
       
    }

    public static void main(String[] args) {
        
    }

    private void setTitle(String product_App) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JLabel lblName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JTextField txtCustomerName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
