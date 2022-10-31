public class StringDemo {
    public static void main(String[] args) {
		/* Creating String by String Literal */
		String s1 = "Arnab Mondal"; /*
		Each time you create a string literal, the JVM checks 
		the "string constant pool" first. If the string already 
		exists in the pool, a reference to the pooled instance is returned. 
		If the string doesn't exist in the pool, a new string instance 
		is created and placed in the pool. */
		
		String s2 = "Arnab Mondal"; // It doesn't create a new instance.

		/* Creating using New keyword */
		String s3 = new String("Arnab");
        
    }
}
