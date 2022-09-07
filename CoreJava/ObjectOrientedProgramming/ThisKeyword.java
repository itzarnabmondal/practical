public class ThisKeyword
{
	int a;
	int b;
	
	// Parameterized constructor
	ThisKeyword(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{
		//Displaying value of variables a and b
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args)
	{
		ThisKeyword object = new ThisKeyword(10, 20);
		object.display();
	}
}
