package javaupowtorka;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
try {
			
	
//			System.out.println("Podaj sw�j wiek" );
//		
//		
//		int wiek = scanner.nextInt(); 
//		String name1 = "Asiulka";
//		String name2 ="W�oskowicz";
		
//		int a =10;
//		int b = 3;
		boolean isSkyfree=false;
		
		
		
		
		if (isSkyfree) {
			System.out.println("Niebo do wynaj�cia");
		} else {
			System.out.println("Niebo jest zaj�te");
		}
		
//		System.out.println(name1 +" " + name2);
//		System.out.println("Tw�j wiek: " + wiek);
//		System.out.println(a % b);
//		System.out.println(a>b);
//		System.out.println(a+b);
//		
//		if(wiek>=18){
//			System.out.println("Jeste� doros�y!!!");
//			}	
//		else {
//			System.out.println("jeste� niedoros�y!!!");
//			}
		
		
		for (int i=0;  i<10; i++) {
			if(i==4) {continue;}
		System.out.println("butelka numer: " + i);}
		
		
		for (int k=1; k<50;k++ ) {
			if (k%5==0 && k%3==0) {
				System.out.println("fizz buzzz!!!");
				continue;
			}
			if (k%5==0) {
				System.out.println("buzzz!!!");
				continue;
			}
			if (k%3==0) {
				System.out.println("fizz !!!");
				continue;
			}
		
				System.out.println(k);
				
			
		}
		
		
		}
		finally {
			scanner.close();
		}
		
	}
}
	
