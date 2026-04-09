/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;
import java.util.*;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
       int [] arr= {45, 22, 11, -4, 7, 3};
       
       System.out.println(Arrays.toString(arr));
       
      arr= ordenarburbuja(arr);
       System.out.println(Arrays.toString(arr));
    }

    private static int[] ordenarburbuja(int[] arr) {
        int auxArr[]= new int[arr.length];
        System.arraycopy(arr,0, auxArr, 0, 0);
        int n=auxArr.length;
       for(int i=0; i< n-1; i++){
       for (int j =i+1; j < n; j++){
           if(auxArr[i] > auxArr[j]) {
               int aux = auxArr[j];
               auxArr[j] = auxArr[i];
               auxArr[i]= aux;
           }
       }  
    }
        return auxArr;
  }
}

