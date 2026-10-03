
package com.javaintro;
import java. util.*;

public class OnlineVotingsystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("eneter the age : ");
		int age = sc.nextInt();
		if(age < 18) {
			System.out.println("not eligible");
		}
		else {
			System.out.println("enter the gender(m/f) : ");
			char gender = sc.next().charAt(0);
			if(gender != 'M' && gender != 'm' && gender  !='F' && gender != 'f'){
				System.out.println("not eligible");
				
			}
			else {
				System.out.println("enter voter id no : ");
				String voter =sc.next();
				if(! voter.isEmpty()) {
					System.out.println(" 1 .simha");
					System.out.println("2.obaiah");
					System.out.println("3.venkatadri");
					System.out.println("4.manoj");
					int option = sc.nextInt();
					switch(option ) {
					case 1:
						System.out.println("vote is caputured for simha");
						break;
					case 2 :
						System.out.println("vote is caputured for obaiah");
						break ;
					case 3 :
						System.out.println("vote is caputured for venkatadri");
						break ;
					case 4 :
						System.out.println("vote is caputruerd  for manoj");
						break ;
						default :
							System.out.println("thanking for voting  to nota");
				
					}
					
				}
			}
		}
		
		
	sc.close();
		
		


	}

}
