package org.sample.build.ant.first.test;

import org.sample.build.ant.first.MyMath;
import org.sample.build.ant.first.MyMathSecond;

public class MyMathTest {
	public static void main(String[] args) {
        MyMath math = new MyMath();
        MyMathSecond second=new MyMathSecond();
        System.out.println("Result is: " + math.multi(5, 10));
        System.out.println("Add is "+second.add(5,10));
    }
}
