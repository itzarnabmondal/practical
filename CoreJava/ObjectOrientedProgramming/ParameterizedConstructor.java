class ParameterizedConstructor {  
    int id;  
    String name;  
    // creating a ParameterizedConstructor  
    ParameterizedConstructor(int i,String n){
        id = i;
        name = n;
    }  
    // method to display the values  
    void display()
    {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    ParameterizedConstructor obj1 = new ParameterizedConstructor(100,"Arnab");  
    ParameterizedConstructor obj2 = new ParameterizedConstructor(150,"Dip");  
    //calling method to display the values of object  
    obj1.display();  
    obj2.display();  
   }  
}
