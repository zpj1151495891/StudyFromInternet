package createTypePatterns.BuilderPattern;

import createTypePatterns.BuilderPattern.Item.Burger;

public class ChickenBurger extends Burger{
	@Override
	public float price() {
		return 50.0f;
	}
	@Override
	public String name() {
		return "Chicken Burger";
	}

}
