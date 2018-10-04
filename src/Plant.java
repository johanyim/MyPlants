import java.util.Scanner;

public class Plant {
	private int leaves;
	private String name;
	private String color;
	private boolean planted = false;
	private byte age;
	private final long uniqueID;
	
	protected static int numberOfPlants = 0;
	
	static Scanner input = new Scanner(System.in);
	
	public int getLeaves() {
		return leaves;
	}

	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	public void setName() {
		this.name = "unnamed";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPlanted() {
		return planted;
	}

	public void setPlanted(boolean planted) {
		this.planted = planted;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Plant() {
		
		uniqueID = ++numberOfPlants;
		System.out.println("Total number of Plants: " + Plant.numberOfPlants);
		System.out.print("What will you name your plant?: ");
		
		if(input.hasNextLine()) {
			this.setName(input.nextLine());
		}
		
		
		System.out.println("My name is " + this.getName() + "!");
	
		
	}
	
	public static void main(String[] args) {
		
		Broccoli broco = new Broccoli();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
