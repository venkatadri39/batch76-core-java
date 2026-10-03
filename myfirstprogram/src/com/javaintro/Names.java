package com.javaintro;

public class Names {

	public static void main(String[] args) {
		String [] names = new String[5];
		names [0]="simhadri";
		names[1]="ram";
		names[2]="srinu";
		names[3]="ravi";
		names[4]="srikanth";
		//for(int i=0;i<names.length;i++) {
		//	if(names[i].toLowerCase().startsWith("s")) {
		//	System.out.println(names[i]);
		//}

	//}
		for (String name :names) {
			if(name.toLowerCase().startsWith("s")) {
			System.out.println(name.toLowerCase());
		}
	}
}
}


