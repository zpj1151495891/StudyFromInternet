package createTypePatterns.BuilderPattern.Item;

import createTypePatterns.BuilderPattern.Packing.Packing;
import createTypePatterns.BuilderPattern.Packing.Wrapper;

public abstract class Burger implements Item{
	@Override
	public Packing packing() {
		return new Wrapper();
	}
}
