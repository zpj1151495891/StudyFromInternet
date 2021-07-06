package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/")
@ResultPath(value="/")
@Result(name="success",location="/HelloWorld.jsp")
@Action(value="/hello")
public class HelloWorldAction {
	
	private String name;
	
	public String execute() throws Exception{
		
		return "success";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
