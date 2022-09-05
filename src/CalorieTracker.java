import java.util.ArrayList;
import java.util.List;

public class CalorieTracker {
	Integer maxCal;
	List<String> foodEaten = new ArrayList<String>();
	
	public CalorieTracker(Integer maxCal) {
		// TODO Auto-generated constructor stub
		this.maxCal = maxCal;
	}
	
	public void eat(String Food, Integer Cal) {
		

		if (maxCal >= Cal) {
			foodEaten.add(Food);
			maxCal -= Cal;
		}else System.out.println("You cant eat that, thats tool many calories");

	}

}
