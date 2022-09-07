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
class SupAdvCalc extends AdvCalc {
    int multip(int num1, int num2) {
        return num1*num2;
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        SupAdvCalc sAdvCalc = new SupAdvCalc();
        System.out.println(sAdvCalc.add(10, 20));   // calling Calc class method.
        System.out.println(sAdvCalc.sub(20, 30));   // calling AdvCalc class method.
        System.out.println(sAdvCalc.multip(10, 20));
    }
}