public class MainApplication {

	public static void main(String[] args) {
		Student s1 = new Student("Joe");
		Professor p1 = new Professor("Brown Bear");
		System.out.println(s1.SayHello());
	}
}

class Person {

	public Person() {

	}

	public Person(String input) {
		this.personName = input;
	}

	String personName;

	public String SayHello() {
		return this.personName;
	}
}

class Student extends Person {
	public Student(String stuName) {
	}
}

class Professor extends Person {
	public Professor(String profName) {
	}
}

class Enrollment {
}

class Class {
}
