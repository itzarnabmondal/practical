public class VariableDemo {
	static int num1 = 1;
	int num2 = 10;

	// Main Method
	public static void main(String[] args) {
		int num3 = 100;
		VariableDemo obj = new VariableDemo();
		System.out.println("Static: "+VariableDemo.num1);
		System.out.println("Instance: "+obj.num2);
		System.out.println("Local: "+num3);
	}
}