package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	
	static class Person {
		String firstName;
		String lastName;
		
		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		@Override
		public String toString() {
			return firstName + " " + lastName;
		}
	}
	
	public static void main(String[] args) {
		List<Person> listOfPeople = new ArrayList<>();
		listOfPeople.add(new Person("Rafael", "Figueiredo"));
		listOfPeople.add(new Person("Vanessa", "Soares"));
		listOfPeople.add(new Person("Maria", "Luciene"));
		
		listOfPeople.sort(Comparator.comparing(Person::getFirstName)
				.thenComparing(Person::getLastName));
		
		listOfPeople.forEach(System.out::println);
	}

}
