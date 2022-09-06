
public class CopyConst {
	int age;
	String name;
	CopyConst(int a, String n) {
		age = a;
		name = n;
	}
	public CopyConst(CopyConst c) {
		age = c.age;
		name = c.name;
		
	}
	void show() {
		System.out.println(age+" : "+name);
	}
	public static void main(String[] args) {
		CopyConst c1 = new CopyConst(22, "Arnab");
		CopyConst c2 = new CopyConst(c1);
		c1.show();
		c2.show();
	}
}
