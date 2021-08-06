
public class Menu {
	private String cuisine;
	private String meal;
	private String drink;
	private String fruit;
	private double price;
	
	public Menu(String cuisine,String meal,String drink,String fruit,double price) {
		this.cuisine = cuisine;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		this.price = price;
	}
	
	public String getCuisine() {
		return cuisine;
	}
//	public void setCuisine() {
//		this.cuisine = cuisine;
//	}
	
	public String getMeal() {
		return meal;
	}
//	public void setMeal() {
//		this.meal = meal;
//	}
	
	public String getDrink() {
		return drink;
	}
//	public void setDrink() {
//		this.drink = drink;
//	}
	
	public String getFruit() {
		return fruit;
	}
//	public void setFruit() {
//		this.fruit = fruit;
//	}
	
	public double getPrice() {
		return price;
	}
//	public void setPrice() {
//		this.price = price;
//	}
	
//	public void displayMenu() {
//		System.out.println(String.format("Cuisine:%-20s\nMeal:%-20s\nDrink:%-20s\nFruit:%-20s\n", getCuisine(),getMeal(),getDrink(),getFruit()));
//	}
//	
	
}
