public class InitializationUsingReferenceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "Arnab Mondal";
		obj.age = 19;
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
}

class Student {
	String name;
	int age;
}