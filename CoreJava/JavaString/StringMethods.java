public class StringMethods {
	public static void main(String[] args) {
		
		String str1 = "Arnab";
		String str2 = "Mobdal";
		String str3 = "Arnab Mondal";

		// Length method
        System.out.println(str1.length());

        // Concatenation
        System.out.println(str1 + str2); // Using + operator
        System.out.println(str1.concat(str2)); // Using concat()

        //  String charAt() method
        System.out.println(str1.charAt(0)); // It will print 'A'

        // String compareTo() method
        System.out.println(str1.compareTo(str2)); /* A comes 12 
        position before M, so it will give -12 */

        // Java String split() method
        String[] split = str3.split("n");
        for (String obj: split) {
            System.out.println(obj);
        }

        // Java String indexOf() method
        System.out.println(str1.indexOf('b'));

        // Java String toString() method
        Integer myRollNo = 1;
        String MyString = myRollNo.toString();

        // String reverse() method
        StringBuffer sb = new StringBuffer(str1);
        sb.reverse(); // The StringBuffer reverse() method is used to reverse the input characters of the String.
        System.out.println(sb);

        // Java String replace() method
        String str4 = "arnob";
        System.out.println(str4.replace('o', 'a'));

	}
}
