package week6.day2.ice_sale;

public abstract class Ingredient {
	
	private String name;
	private int count;
	private double price;
	private Ingredient ingredient;
	
	public Ingredient(String name, int count, double price,
			Ingredient ingredient) {
		super();
		this.name = name;
		this.count = count;
		this.price = price;
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public void setPrice(double price) {
		this.price = price;
	} 
	
	public double getPrice(){
		if(ingredient == null){
			return price * getCount();
		} else {
			return price * getCount() + ingredient.getPrice();
		}
	}
	
}
