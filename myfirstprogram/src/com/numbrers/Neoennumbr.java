package com.numbrers;
import java.util.*;
// neon Number: A number is called neoen Number if the sum of the digits is equal to the original number
//example:9
//9*9=81;
//8+1=9

public class Neoennumbr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number :");
		int n = sc.nextInt();
		int temp=n;
		int square=n*n;
		int sum=0;
	
while(square>0) {
	int digit=square%10;
	square=square/10;
	sum=sum+digit;
}
if(sum== temp) {
	System.out.println("neoen number");
}
else {
	System.out.println("not neoen number");
}
sc.close();
	}

}
