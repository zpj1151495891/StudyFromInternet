package createTypePatterns.BuilderPattern.Item;

import createTypePatterns.BuilderPattern.Packing.Bottle;
import createTypePatterns.BuilderPattern.Packing.Packing;

public abstract class ColdDrink implements Item{
	@Override
	public Packing packing() {
		return new Bottle();
	}
}
