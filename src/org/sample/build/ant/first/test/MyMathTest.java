package org.sample.build.ant.first.test;

import org.sample.build.ant.first.MyMath;

public class MyMathTest {
	public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println("Result is: " + math.multi(5, 10));
    }
}
