/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;
import java.util.*;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
       int [] arr= {45, 22, 11, -4, 7, 3};
       
       System.out.println(Arrays.toString(arr));
       
      ordenarburbuja(arr);
       System.out.println(Arrays.toString(arr));
    }

    private static void ordenarburbuja(int[] arr) {
        int n = arr.length;
       for(int i=0; i< n-1; i++){
       for (int j =i+1; j < n; j++){
           if(arr[i] > arr[j]) {
               int aux = arr[j];
               arr[j] = arr [i];
               arr[i]= aux;
           }
       }
       
       
       
    }
  }
}
