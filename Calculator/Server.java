package Calculator;

import java.rmi.Naming;

public class Server {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new CalculatorImpl();
        Naming.bind("rmi://localhost:1000/Test", calculator);

    }

}
