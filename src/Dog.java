
public class Dog {

	private String name;
	private String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public void bark () {
		System.out.println("ruff, i am "+name+" "+breed);
	}
}
