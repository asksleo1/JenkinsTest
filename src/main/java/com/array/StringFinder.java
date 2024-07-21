package com.array;



public class StringFinder {	
	public static void main(String[] args) {
		String text="I am karan kumar and I am in Australia";
		String word="am";
		  String[] words = text.split("\\W+"); // Split the text into words
	        int count = 0;

	        for (String w : words) {
	            if (w.equalsIgnoreCase(word)) { // Case-insensitive comparison
	                count++;
	            }
	        }
		System.out.println(count);
		}
		
		
		
	}

