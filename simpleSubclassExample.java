// chaining super calls

public class MainApplication {

	public static void main(String[] args) {
		Student s1 = new Student("Joe", "Supervisor Mary");
		s1.SayHello();
	}
}

class Superman{
	String supervisor = "Mr. Jameson";
}

class Person extends Superman {
	public Person() {
	}

	public Person(String someName) {
	}

	String personName;
	String supervisorName  = "Supervisor Barney";

	public void SayHello() {
		System.out.println(personName);
		System.out.println(supervisorName);
	}
}

class Student extends Person {
	String supervisorName = "supervisor Jill";
	public Student() {
	}

	public Student(String someName, String supervisorName) {
		this.personName = someName;
	}

	public void SayHello() {
		System.out.println(super.supervisorName);
	}
}
