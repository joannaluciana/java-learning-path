package javaupowtorka;

import java.util.*;


public class Main3 {
	
	public static void main(String[] args) {
  Map<String, String> nameToMeal = new HashMap<>();
  
  nameToMeal.put("Ania", "Lody");
  nameToMeal.put("Micha³", "Spaghetti");
  nameToMeal.put("Piotr", "Hamburger");
  nameToMeal.put("Asia", "Sushi");
  
  Set<String> names = nameToMeal.keySet();
  for (String name: names) {
   System.out.println(name);}
   
   Collection<String> meals = nameToMeal.values();
   for (String meal: meals) {
	   System.out.println(meal);
   }

		
		}
		
		
	}
	
 