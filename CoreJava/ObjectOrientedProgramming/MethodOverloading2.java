class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){ // overloading using different types of aurgument.
        return a+b;
    }
}
public class MethodOverloading2 {
    public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(12.3,12.6));  
    }
}  
