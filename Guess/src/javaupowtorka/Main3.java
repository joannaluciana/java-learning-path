package javaupowtorka;
import java.util.ArrayList;
import java.util.List;


public class Main3 {
	
	public static void main(String[] args) {
  List<String> names= new ArrayList<>();
  
   names.add("Asia");
   names.add("Basia");
   names.add("Monika");
   
   boolean is_Contain = names.contains("Asia");
   
   System.out.println(is_Contain);
   
   for (String name : names) {
	   System.out.println(name);
	  
   }
		
		}
		
		
	}

	
