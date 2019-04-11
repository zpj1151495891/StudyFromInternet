package createTypePatterns.AbstractFactorPattern
;

import createTypePatterns.AbstractFactorPattern.Color.Blue;
import createTypePatterns.AbstractFactorPattern.Color.Color;
import createTypePatterns.AbstractFactorPattern.Color.Green;
import createTypePatterns.AbstractFactorPattern.Color.Red;
import createTypePatterns.AbstractFactorPattern.Shape.Shape;

public class ColorFactory extends AbstractFactory{
	
	@Override
	public Color getColor(String color) {
		if(color==null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}
