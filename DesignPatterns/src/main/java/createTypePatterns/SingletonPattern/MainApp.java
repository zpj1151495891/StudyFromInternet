package createTypePatterns.SingletonPattern;

public class MainApp {
	public static void main(String[] args) {
		
		//不合法的构造函数
		//编译时错误，构造函数SingleObject()是不可见的
		//SingleObject object=new SingleObject();
		//获取唯一可用对象
		SingleObject3 object=SingleObject3.getInstance();
		//调用对象的showMessage()方法
		object.showMessage();
	}

}
