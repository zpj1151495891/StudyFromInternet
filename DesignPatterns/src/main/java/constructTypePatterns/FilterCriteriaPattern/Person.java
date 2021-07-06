package constructTypePatterns.FilterCriteriaPattern;

public class Person {
	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person(String name,String gender,String maritalStatus) {
		this.name=name;
		this.gender=gender;
		this.maritalStatus=maritalStatus;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus=maritalStatus;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}

}
