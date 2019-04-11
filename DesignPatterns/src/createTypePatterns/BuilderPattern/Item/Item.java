package createTypePatterns.BuilderPattern.Item;

import createTypePatterns.BuilderPattern.Packing.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
