public class MainApplication {

	public static void main(String[] args) {
		Student s1 = new Student("Joe");
		System.out.println(s1.SayHello());
	}
}

class Person {
	public Person() {}
	public Person(String someName) {}
	String personName;

	public String SayHello() {
		return this.personName;
	}
}

class Student extends Person {
	public Student() {}
	public Student(String someName) {this.personName = someName;}	
}
