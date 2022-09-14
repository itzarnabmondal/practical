class Adder{  
    static int add(int a,int b){
        return a+b;
    }  
    static int add(int a,int b,int c){ // same name method with different number of aurgument.
        return a+b+c;
    }  
}  
public class MethodOverloading1 {
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
