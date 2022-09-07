class Calc {    // Super Class
    int add(int num1, int num2) {
        return num1 + num2;
    }
}

class AdvCalc extends Calc {    // Subclass
    int sub(int num1, int num2) {
        return num1 - num2;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        AdvCalc aCalc = new AdvCalc();
        System.out.println(aCalc.sub(20, 10));
        System.out.println(aCalc.add(10, 20));  // Calling super class method.
    }
}
