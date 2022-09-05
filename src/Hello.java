import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hello {
	
	public static String S = "Hello";
	
	public static HashMap<String, Integer> hash_map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(S);
		
		//Practice9.rainbow();
		//Practice9.StillPositive();
		//Practice9.FruitsBasket();
		
		//maxCountry();
		
		String string = "Our Mathematical Universe: My Quest for the Ultimate Nature of Reality";
		List<String> wordList = List.of(string.split(" "));

		  int length = wordList
		        .parallelStream()
		        .reduce(
		                0,
		                (parLength, word) -> parLength + word.length(),
		                (parLength, otherParLength) -> parLength + otherParLength
		        );

		System.out.println(String.format("The sum length of all the words in the paragraph is %d",length));
	}
	
	public static void maxCountry() {
		List<Account> acc = new LinkedList<Account>();
		
		acc.add(new Account(123, "HouseNumber:123, StreetName:,Country UK",345));
		acc.add(new Account(234, "HouseNumber:234, StreetName:,Country INDIA",500));
		acc.add(new Account(345, "HouseNumber:345, StreetName:,Country UK",420));
		
		Map<Object, List<String>> Max = acc.stream()
				.map(Account::getCountry)
				.collect(Collectors.groupingBy(s -> s));
		
		Max.forEach((k, v) -> System.out.println(k +" "+v.size()));
	}
	
	
		
	public static void day2Caloritiething() {
		hash_map.put("ice-cream", 100);
		hash_map.put("spaghetti", 100);
		hash_map.put("rice", 100);
		hash_map.put("sandwich", 100);
		hash_map.put("beer", 100);
		hash_map.put("wine", 100);
		hash_map.put("ceral", 100);
		hash_map.put("chips", 100);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your max calories");
		Boolean hasMax = false;
		Integer max = -1;
		do {
			try {
				max = Integer.parseInt(scanner.nextLine());
				hasMax = true;
				
			}
			catch (Exception e) {
				System.out.println("Please enter a valid value, a positive integer");
			}
		} while(!hasMax);
		
		
		CalorieTracker tracker = new CalorieTracker(max);
		
		System.out.println("ok, you can only eat "+tracker.maxCal+" calories");
		
		
		
		
		String userIn;
		do {
			System.out.println("What do you want to eat");
			userIn = scanner.nextLine();	 
			 try {
				 tracker.eat("ice-cream", hash_map.get(userIn));
				 System.out.println("ok, you can only eat "+tracker.maxCal+" calories");
				 System.out.println("You have eaten" + tracker.foodEaten);
			 }
			 catch(Exception e)  {
				 System.out.println("You cant eat "+userIn);
			 }
		} while(tracker.maxCal > 0);
		
		System.out.println("You cant eat anymore");
	
		scanner.close();
	}

}
