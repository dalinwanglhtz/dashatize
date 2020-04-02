package com.codewardev;

public class Solution {

	public static String dashatize(int num) {
		String strValue = String.valueOf(num).replaceAll("-", "");
		String[] strArray = strValue.split("");
		String result = "";
		for(int i=0; i<strArray.length; i++) {
			int number = Integer.valueOf(strArray[i]);
			if(number % 2 != 0) {
				if(i != 0 && !result.endsWith("-")) {
					result += "-";
				}
				result += number;
				if(i != strArray.length-1) {
					result += "-";
				}
			} else {
				result += number;
			}
		}
		System.out.println("Result: "+result);
		return result;
	}

}
