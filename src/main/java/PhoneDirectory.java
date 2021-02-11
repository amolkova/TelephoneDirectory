import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
	
	
	private Map<String, List<String>> customer;
		
	
	public PhoneDirectory(){
		customer = new HashMap<>();		
		}
	
	
	
	public void add(String surname, String number){
		if(customer.containsKey(surname)){
			if(!customer.get(surname).contains(number)){
				customer.get(surname).add(number);
			}			
			
		}else{
			List<String> list = new ArrayList<>();
			list.add(number);
			customer.put(surname, list);
		}
		
		
	}
	
	public List<String> get(String surname){
		
		return customer.get(surname);
	}
	
	
}
