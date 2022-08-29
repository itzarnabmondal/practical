public class ClassAndObject {
	public static void main(String[] args) {
		
		// Creating Object of Student Class.
		Student obj = new Student();

		System.out.println(obj.name);
		System.out.println(obj.age);
	}
}

// Creating Another Class
class Student {
	String name = "Arnab Mondal";
	int age = 19;
}
