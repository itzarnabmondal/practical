class Employee {
	int empId;
	String empName;
	static String companyName = "TCS";
	static void valueChange() { 
		companyName = "DataFlair";
	}  
	Employee(int id, String name){ 
		empId = id; 
		empName = name; 
	}
	void display() {
		System.out.println(empId+" "+empName+" "+companyName);
	} 
} 
 
public class StaticKeyword 
{ 
 public static void main(String args[])
    { 
       Employee.valueChange(); 

       Employee EmployeeObj = new Employee(218,"Kushal"); 
       Employee EmployeeObj1 = new Employee(635,"Bhumika"); 
       Employee EmployeeObj2 = new Employee(147,"Renuka"); 
       //calling display method 
       EmployeeObj.display(); 
       EmployeeObj1.display(); 
       EmployeeObj2.display(); 
    } 
}
