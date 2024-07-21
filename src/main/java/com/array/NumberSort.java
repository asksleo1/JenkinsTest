package com.array;

import edu.emory.mathcs.backport.java.util.Arrays;

public class NumberSort {
	public static void main(String[] args) {
		System.out.println("{-2,1,-9,2,-5,7,9,4,1,-6,7}");
		System.out.println("\n");
	methodSort();
	System.out.println("This is an example of General Sorting");
	
	generalSort();
	System.out.println("This is an example of Quick Sorting");
	System.out.println("\n");
	quickSort();
	System.out.println("\n");
	quickSorting();
	}
	public static void methodSort() {
		Integer ar[]= {-2,1,-9,2,-5,7,9,4,1,-6,7};
		Arrays.sort(ar);
		System.out.println(ar);
		for(Integer ar1:ar)
		{
			System.out.print(ar1);
		}System.out.println("\n");
	}
	public static void generalSort() {
		Integer ar[]= {-2,1,-9,2,-5,7,9,4,1,-6,7};
	int temp=0;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]){
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	for(Integer am:ar) {
	System.out.print(am);
	}System.out.println("\n");}
	public static void quickSort() {
		int ar[]= {-2,1,-9,2,-5,7,9,4,1,-6,7};
		int i =-1;
		int temp=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]<0){
					i++;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				
	}
				}
			//	for(int ar1:ar) {
//System.out.print(ar1);{
//}System.out.println("\n");
//}
		int neg=0,pos=i+1;
		while(neg<pos && pos<ar.length && ar[neg]<0)
		{
			temp=ar[neg];
			ar[neg]=ar[pos];
			ar[pos]=temp;
			pos++;
			neg=neg+2;
		}	for(int ar1:ar) {
			
			System.out.print(ar1);}
			
	}
		public static void quickSorting() {
			int ar[]= {-2,1,-9,2,-5,7,9,4,1,-6,7};
			int i=-1,temp=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]<0) {
					i++;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			int neg=0,pos=i+1;
			while(neg<pos && pos<ar.length && ar[neg]<0){
				temp=ar[neg];
				ar[neg]=ar[pos];
				ar[pos]=temp;
				pos++;
				neg=neg+2;
			}
			for(int ar1:ar) {
		System.out.println(ar1);}
	}}
	



