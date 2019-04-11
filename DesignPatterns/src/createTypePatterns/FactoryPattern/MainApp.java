package createTypePatterns.FactoryPattern;

public class MainApp {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		//获取Circle对象
		Shape shape1=shapeFactory.getShape("CIRCLE");
		//调用Circle对象的draw()方法
		shape1.draw();
		//获取Rectangle对象
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		//调用Rectangle对象的draw()方法
		shape2.draw();
		//获取Square对象
		Shape shape3=shapeFactory.getShape("SQUARE");
		//调用Square对象的draw()方法
		shape3.draw();
	}
}
