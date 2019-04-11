package createTypePatterns.AbstractFactorPattern;

import createTypePatterns.AbstractFactorPattern.Color.Color;
import createTypePatterns.AbstractFactorPattern.Shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);

}
