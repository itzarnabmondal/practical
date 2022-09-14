class Bike{
    final void run(){
        System.out.println("running");
    }  
}  
     
class Honda extends Bike {
    void run(){
        System.out.println("running safely with 100kmph");
    }  
}
public class FinalMethod {
    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
// it will give an error, because after making a final we can't override it.
