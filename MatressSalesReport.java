/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matresssalesreport;

import java.util.Scanner;

public class MatressSalesReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] products = {{"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"}};
        
        int[][] sales = new int[3][3];
        
        int totalSales = 0;
        
        for(int i = 0; i < products.length; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Enter number of sales for month " + j + "for " + products[i] + "matress: ");
                sales[i][j] = scanner.nextInt();
                
                System.out.println();
                
                int highestSales = 0;
                String mostPopular = "";
                
                for (int[] sale : sales) {
                    int productTotal = 0;
                        totalSales = totalSales + sales[i][j];
                        productTotal += sales[i][j];
                        
                        if(sales > highestSales){
                            
                            highest sales = sales[i][j];
                            
                            mostPopular = products[i];
                        }
                         
                    }
            int averageSales = totalSales / 9;
            
            System.out.println("PRODUCT SALES REPORT - 2026");
            
            System.out.println("**************************************");
            
            System.out.println("TOTAL PRODUCT SALES: " + totalSales);
            
            System.out.println("AVERAGE PRODUCT SALES: " + averageSales);
            
            System.out.println("");System.out.println("MOST POPULAR PRODUCT: " + mostPopular + "" + highestSales + "");
            
        }
            
        }
      
        
    }
}
