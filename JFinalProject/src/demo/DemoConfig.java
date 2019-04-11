package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig{
	
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}
	public void configRoute(Routes me) {
		me.add("/hello",HelloController.class);
	}
	public void configPlugin(Plugins me) {}
	public void configInterceptor(Interceptors me) {}
	public void configHandler(Handlers me) {}
	@Override
	public void configEngine(Engine arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
