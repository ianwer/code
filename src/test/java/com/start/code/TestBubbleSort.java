package com.start.code;

import com.start.code.BubbleSort;

import junit.framework.TestCase;

public class TestBubbleSort extends TestCase {
	
	public void test0BubbleSort() { 
        int arr[] ={2,1};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    } 
	
	public void test1BubbleSort() { 
        int arr[] ={1,2,3,4,5};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }
	
	public void test2BubbleSort() { 
        int arr[] ={};
        BubbleSort.SortMyArray(arr);//Sorting
        for(int i = 0; i < arr.length-1; i++){
        	assertTrue(arr[i] <= arr[i+1]);
        }
    }
}