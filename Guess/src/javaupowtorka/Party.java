package javaupowtorka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Party {
	
	private List<Guest> guests = new ArrayList<>();
	private Set<String> meals = new HashSet<>();
	private Map<Integer, Guest> phoneToGuest = new HashMap<>();
	private Map<String, Guest> nameToGuest = new HashMap<>();
	
	Scanner scanner = new Scanner(System.in);
	
	public void addGuest () {
		
		System.out.println("Podaj imiê goœcia");
		String name = scanner.nextLine();
		
		System.out.println("Podaj posi³ek dla Ciebie");
		String meal= scanner.nextLine();
		
		System.out.println("Podaj numer do Ciebie");
		int phoneNumber= Integer.valueOf(scanner.nextLine());
		
		System.out.println("Vege or not?");
		String isVeganString= scanner.nextLine();
		
		boolean isVegan;
		if (isVeganString.equals("Y")) {isVegan=true;}
		else {
			isVegan=false;
			}
		
		Guest guest = new Guest(name,meal, phoneNumber, isVegan);
		
		meals.add(meal);
		phoneToGuest.put(phoneNumber, guest);
		guests.add(guest);
		
		}
	
	public void displayMeals() {
		for (String meal: meals) {
		System.out.println(meal);
		}
	}
	
	public void displayGuestByPhoneNumber() {
		Integer phoneNumber = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Podaj numer telefonu goœcia ");
		Guest guest = phoneToGuest.get(phoneNumber);  // znajduje goœcia z tym numerem
		guest.displayGuestInformation();
		
		
	}
	
	public void displayGuestByName() {
		String name = scanner.nextLine();
		
		Guest guest = nameToGuest.get(name);  // znajduje goœcia z tym imieniem -œredniooo :/... 
		guest.displayGuestInformation();
	}
	

	public void displayGuests() {
		for(Guest guest: guests) {
			guest.displayGuestInformation();
			System.out.println("         " );
		}
	}
	
	



	
	
}
