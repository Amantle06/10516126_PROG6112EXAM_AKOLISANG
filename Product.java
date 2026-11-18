/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    
    String[] products;
    int[][] salesData;
    
    public Product(String[] products, int[][] salesData){
        this.products = products;
        this.salesData = salesData;
    }
    
    @Override
    public int GetTotalProductSold(){
        int total = 0;
        for(int i = 0; i < products.length; i++) {
            for (int j = 0; j <= 3; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }
    
    @Override
    public double GetAverageProductSold(){
        int total = GetTotalProductSold();
        return total / 9;
    }
    
    @Override
    public String GetMostPopularProduct(){
        int max = 0;
        String popular = "";
        
        for (int i = 0; i < products.length; i++) {
            int currentSum = 0;
            for(int j = 0; j < 3; j++){
                currentSum += salesData[i][j];
            }
            if(currentSum > max){
                max = currentSum;
                popular  = products[i];
            }
        }
    }
}
