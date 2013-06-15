/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EDUTEC
 */
public class Exerc2Array1 {
      public static void main(String[] args){
          BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
          String mostratudo="";
          int[] numeros = new int[3];
            for (int i=0; i < numeros.length; i++){   
                /*numeros[i] = i;*/
                System.out.print("Entre com o número: ");       
                try{            
                   numeros[i]=Integer.valueOf(dataIn.readLine());          
                   if (i!=0){
                       mostratudo=mostratudo+"-";
                   }
                   mostratudo=mostratudo+numeros[i];                
                   } catch (IOException e) {
                System.out.println("Error!");
                System.out.println(numeros[i]); 
                }                             
          }
          System.out.println(mostratudo);                      
            
      }
    
}
