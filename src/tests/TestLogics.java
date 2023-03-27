package tests;

import edu.iteso.logic.*;

public class TestLogics {

    public static void main(String[] args) {
        //for(int i = 0; i < 1000; i ++) {
            //Variable va = new Variable("a", true);
            //Variable va = Variable.of("a");
            //va.setValue(true);
        //}

        Variable va = new Variable("a", true);
        Variable vb = new Variable("b", false);
        And and1 = new And(va, vb);
        System.out.println(and1);
        System.out.println(and1.getValue());

        Or or1 = new Or(and1, new Variable("c", true));
        System.out.println(or1);
        System.out.println(or1.getValue());

        Not not1 = new Not(and1);
        System.out.println(not1);
        System.out.println(not1.getValue());

        Expression exp = not1.simplify();
        System.out.println(exp);
        System.out.println(exp.getValue());

        /*
        Constant c1 = new Constant(true);
        Constant c2 = new Constant(true);
        Constant c3 = new Constant(true);*/
        Constant c1 = Constant.False;
        Constant c2 = Constant.True;


    }

}
