public class InitializationUsingMethod {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.input("Arnab Mondal", 19);

		// Creating another object of student class.
		Student s2 = new Student();
		s2.input("Sourdeep Mondal", 12);

		// Calling output method to print the values
		s1.output();
		s2.output();
	}
}
class Student {
	String name;
	int age;
	public void input(String input1, int input2) {
		name = input1;
		age = input2;
	}
	public void output() {
		System.out.println(name);
		System.out.println(age);
	}
}