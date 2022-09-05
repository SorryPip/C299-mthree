
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice9 {

	public Practice9() {
		// TODO Auto-generated constructor stub
	}
	
	public static void rainbow() {
		List<String> colours = new ArrayList<String>();
		Collections.addAll(colours, "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet");
		
		System.out.println(colours);
		colours.add("Cyan");
		System.out.println(colours);
		
		
		for (String color: colours) {
			System.out.println(color);
		}
		
		/*
		colours.forEach(x -> System.out.println(x));
		colours.forEach(System.out::println);

		colours.get(0);
		*/
		
	}
	
	public static void StillPositive() {
		int[] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};
		List<Integer> newNumbers = Arrays
				.stream(numbers)
				.boxed()
				.filter(x -> x > 0)
				.collect(Collectors.toList());
		System.out.println(newNumbers);
	}
	
	public static void FruitsBasket() {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        // Fruit counting code goes here!
        Arrays.stream(fruitBasket)
        .collect(Collectors.groupingBy(s -> s))
        .forEach((x, y) -> System.out.println(x +" " +y.size()));
        
        numOranges = Arrays.asList(fruitBasket).stream()
        		.filter(x -> x.equals("Orange"))
        		.collect(Collectors.toList())
        		.size();
        
        numApples = Arrays.asList(fruitBasket).stream()
        		.filter(x -> x.equals("Apple"))
        		.collect(Collectors.toList())
        		.size();
        
        System.out.println("Oranges "+numOranges);
        
        
        // Print The Results!

    }
	
	

}
