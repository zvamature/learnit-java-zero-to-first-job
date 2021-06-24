package com.itbulls.fide;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		int arr2[];
		arr = new int[10];
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		double[] arr3 = new double[10];
		System.out.println(arr3[0]);
		
		boolean[] arr4 = new boolean [10];
		
		int[] arr5 = {3, 2,1};
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6}
				
		};
		
		arraysSort(arr5);
		

	}

	private static void arraysSort(int[] arr5) {
		int[][] matrix2 = new int[10][10];
		System.out.println(matrix2[0]);
		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
	}

}
