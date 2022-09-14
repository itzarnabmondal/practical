public class FinalVariable {
    final int speedlimit=90;//final variable
    void run(){
        speedlimit=400;
    }
    public static void main(String args[]){
        Bike9 obj=new  Bike9();
        obj.run();
    }
}

// it will give an compile time error, because after assingn value to 
// final variable we can't cnage it.
