package javaupowtorka;

import java.util.Scanner;


public class Main4 {
	
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean shouldContinue= true;
Party party = new Party();

while(shouldContinue) {
	System.out.println("Wybierz opcje");
	System.out.println("1.Wy�wietl go�ci");
	System.out.println("2.Dodaj go�cia");
	System.out.println("3.Wy�wiel potrawy");
	System.out.println("4.Znajdz numer telefonu");
	System.out.println("5. Wyj�cie");
	
	int userChoice = scanner.nextInt();
	
	switch (userChoice) {
		case 1 -> party.displayGuests();
		case 2 -> party.addGuest();
		case 3 -> System.out.println("wybrano 3");
		case 4 -> System.out.println("wybrano 4");
		case 5 -> shouldContinue=false;
		
	}
	
	


}

		
		}
		
		
	}
	
 