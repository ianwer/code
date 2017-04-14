package com.start.code;

import com.start.code.BubbleSort;

import junit.framework.TestCase;

public class TestBubbleSort extends TestCase {
	
	public void testBasic() { 
        int arr[] ={2,1};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    } 
	
	public void testAlreadySorted() { 
        int arr[] ={1,2,3,4,5};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }
	
	public void testEmptyArray() { 
        int arr[] ={};
        BubbleSort.SortMyArray(arr);//Sorting
        assertTrue(arr.length==0);
    }
}