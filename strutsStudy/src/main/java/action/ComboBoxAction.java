package action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
@Namespace("/")
@ResultPath(value="/")
public class ComboBoxAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> fruits;
	private String yourFruits;
	private String yourMonth;
	/**
	 * @return the fruits
	 */
	public List<String> getFruits() {
		return fruits;
	}
	/**
	 * @param fruits the fruits to set
	 */
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	/**
	 * @return the yourFruits
	 */
	public String getYourFruits() {
		return yourFruits;
	}
	/**
	 * @param yourFruits the yourFruits to set
	 */
	public void setYourFruits(String yourFruits) {
		this.yourFruits = yourFruits;
	}
	/**
	 * @return the yourMonth
	 */
	public String getYourMonth() {
		return yourMonth;
	}
	/**
	 * @param yourMonth the yourMonth to set
	 */
	public void setYourMonth(String yourMonth) {
		this.yourMonth = yourMonth;
	}
	
	public ComboBoxAction() {
		fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Watermelon");
	}
	@Action(value="comboBoxAction",results= {@Result(name="success",location="/combobox.jsp")})
	public String execute() {
		return SUCCESS;
	}
	@Action(value="resultAction",results= {@Result(name="none",location="/result.jsp")})
	public String display() {
		return NONE;
	}
	
	
}
