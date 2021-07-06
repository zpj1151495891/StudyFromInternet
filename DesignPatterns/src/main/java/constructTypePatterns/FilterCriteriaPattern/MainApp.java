package constructTypePatterns.FilterCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[]args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John","Male", "Married"));
		persons.add(new Person("Laura","Female", "Married"));
		persons.add(new Person("Diana","Female", "Single"));
		persons.add(new Person("Mike","Male", "Single"));
		persons.add(new Person("Bobby","Male", "Single"));
		
		Criteria male=new CriteriaMale();
		Criteria female=new CriteriaFemale();
		Criteria single =new SingleCriteria();
		Criteria singleAndMale=new AndCriteria(single,male);
		Criteria singleOrMale =new OrCriteria(single,male);
		System.out.println("males:");
		printPersons(male.meetCriteria(persons));
		System.out.println("females:");
		printPersons(female.meetCriteria(persons));
		System.out.println("singles:");
		printPersons(single.meetCriteria(persons));
		System.out.println("singleAndMales:");
		printPersons(singleAndMale.meetCriteria(persons));
		System.out.println("singleOrMales:");
		printPersons(singleOrMale.meetCriteria(persons));
		
	}
	
	public static void printPersons(List<Person> persons) {
		for(Person person:persons) {
			System.out.println("Person : [ Name : " + person.getName() 
            +", Gender : " + person.getGender() 
            +", Marital Status : " + person.getMaritalStatus()
            +" ]");
		}
	}

}
