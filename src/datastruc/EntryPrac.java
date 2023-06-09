package datastruc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryPrac {
	public static void main(String[] args) {
		Map<String, String> phonebook = new HashMap<>();
		phonebook.put("Tasdiq", "1234");
		phonebook.put("Akshay", "1");
		phonebook.put("Upendra", "123");
		phonebook.put("akii", "111");
		phonebook.put("chakki", "222");
		phonebook.put("uppi", "999");

		
		Set<String> keys = phonebook.keySet();
		for(String i: keys) {
			System.out.println(" key : "+i+"		valu : "+phonebook.get(i));
		}
		
		Set<Map.Entry<String, String>> values = phonebook.entrySet();
		for(Map.Entry<String, String> e : values) {
			System.out.println(e);
			
			e.setValue("III");
		}

	}

}
