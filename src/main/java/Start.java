import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Start {

	public static void main(String[] args) {

		List<String> wordsList = Arrays.asList(new String[]{"������","��������","���������","������","�����","������","�����","���������",
				"����","�������","��������","�����","�������","������","�����","����"}); 
		
		Map<String, Integer> unicWordsMap = new HashMap<>();
		for (String one : wordsList) {
			if(unicWordsMap.containsKey(one)){
				unicWordsMap.replace(one, unicWordsMap.get(one) + 1);
			}else{
				unicWordsMap.put(one, 1);
			}
		}
		
		for (String key : unicWordsMap.keySet()) {
			System.out.println(key + " : " + unicWordsMap.get(key));
		}
		
		
		System.out.println("������ 2");
		PhoneDirectory phoneDirectory = new PhoneDirectory();
		phoneDirectory.add("������", "565656");
		phoneDirectory.add("�������", "232323");
		phoneDirectory.add("������", "121212");
		phoneDirectory.add("������", "565656");
		
		System.out.println("������ " + phoneDirectory.get("������"));
		
	}
}
