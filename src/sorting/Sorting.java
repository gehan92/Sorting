/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Gehan Ishanka
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a = new Scanner(System.in);
        
        
        System.out.println("Enter Numbers 5 times = ");
        
        int numbers[]= new int[5];
        
        for (int i = 0; i < 4; i++) {
            
            numbers[i]=a.nextInt();
        }
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i]+" ");
        }
        
        int tem=0;
        for (int i = 0; i < 4; i++) {
            
            for (int j =i+1; j < 4; j++) {
                
                if (numbers[i]<numbers[j]) {
                    
                    tem=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=tem;
                    
                    
                }
            }
            
            
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i <4 ; i++) {
            System.out.print(+numbers[i]+" ");
        }
        
    }
    
}
