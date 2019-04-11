package createTypePatterns.AbstractFactorPattern;

import createTypePatterns.AbstractFactorPattern.Color.Color;
import createTypePatterns.AbstractFactorPattern.Shape.Shape;

public class MainApp {
	public static void main(String[] args) {
		//获取shape抽象工厂
		AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
		//获取color抽象工厂
		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		//从shape抽象工厂获取Circle对象
		Shape shape1=shapeFactory.getShape("CIRCLE");
		//从shape抽象工厂获取Rectangle对象
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		//从shape抽象工厂获取Square对象
		Shape shape3=shapeFactory.getShape("SQUARE");
		//调用Circle对象的draw()方法
		shape1.draw();
		//调用Rectangle对象的draw()方法
		shape2.draw();
		//调用Square对象的draw()方法
		shape3.draw();
		//从color抽象工厂获取Red对象
		Color color1=colorFactory.getColor("RED");
		//从color抽象工厂获取Green对象
		Color color2=colorFactory.getColor("GREEN");
		//从color抽象工厂获取Blue对象
		Color color3=colorFactory.getColor("Blue");
		//调用Red对象的的fill()方法
		color1.fill();
		//调用Green对象的fill()方法
		color2.fill();
		//调用Blue对象的fill()方法
		color3.fill();
	}

}
