package com.start.code;

import com.start.code.BubbleSort;

import junit.framework.TestCase;

public class TestBubbleSort extends TestCase {
	
	public void testBubbleSort() { 
        int arr[] ={2,1};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }  
}
