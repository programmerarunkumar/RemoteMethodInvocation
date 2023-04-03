package Calculator;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) throws Exception {

        Calculator calculator = (Calculator) Naming.lookup("rmi://localhost:1000/Test");
        calculator.add(1,1);

    }

}
