public class Hello {
	
	public static String S = "Hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(S);
		
		Dog doge = new Dog("german sheperd", "rover");
		doge.bark();
		
		int count = 0;
		for(int i = 0; i <= 10 ; ++i) {
			System.out.println(i+" "+count);
			count += 1;
		}
	}

}
