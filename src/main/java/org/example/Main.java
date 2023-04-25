package org.example;

import Controllers.Controller1;
import Frames.Deriverd1;
import Frames.Human;
import Frames.Inheritance1;
import Frames.Man;

public class Main {

    protected double val = 10;

    public static void main(String[] args) {

/*        Controller1 c = new Controller1();
        c.testR();
        String cad = (3 > 2) ? "aaaa" : "eeeeee";
        System.out.println(cad);*/

        Inheritance1 in1 = new Inheritance1();
        Inheritance1 in2 = new Deriverd1();
        in1.sound();
        in2.sound();

        //Abstarct

        Man h = new Man();
        h.smartBrain();


    }
}