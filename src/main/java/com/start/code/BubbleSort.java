package com.start.code;

public class BubbleSort {
	static void SortMyArray(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
	
	static void print(int[] arr){
		for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");
        }
	}
    
}