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
	
	public void testDuplicateValues() { 
        int arr[] ={1,2,3,3,4,5};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }
	
	public void testRandomValues() { 
        int arr[] ={0,55,3,0,516,-2,66,1,};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }
	
	public void testOutOFOrderValues() { 
        int arr[] ={92,56,9,0,7,10,1};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }
}