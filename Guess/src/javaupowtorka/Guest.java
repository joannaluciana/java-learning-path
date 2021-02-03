package javaupowtorka;

public class Guest {
	private String name;
	
	private String meal;
	private int phoneNumber;
	private boolean isVegan;
	
	
	
	
	public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
		super();
		this.name = name;
		this.meal = meal;
		this.phoneNumber = phoneNumber;
		this.isVegan = isVegan;
	}
	
	
	public String getName() {
		return name;
	}
	public String getMeal() {
		return meal;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public boolean isVegan() {
		return isVegan;
	}
	
	
	public void displayGuestInformation() {
		System.out.println("Imi�" + name);
		System.out.println("Imi�" + meal);
		System.out.println("Imi�" + phoneNumber);
		System.out.println("Imi�" + name);
		String isVeganString = isVegan ? "tak": "nie";
		System.out.println("Vege" + isVeganString);
	}
	

}
