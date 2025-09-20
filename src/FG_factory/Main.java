package FG_factory;

import FG_factory.FIXFactory.FGs;
import FG_factory.FIXFactory.FGsFactory;

public class Main {
    public static void main(String[] args) {
        FGs fg1 = new FGsFactory().selectionFG(179);
        System.out.println(fg1.getName() + " is correct for your height");
    }
}
