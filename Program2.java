import java.io.*;

import java.util.*;



interface Area {

    public void calculate();

}


class Rectangle implements Area {

    int l, b, c1;

    public void calculate() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length");

        l = s.nextInt();

        System.out.println("Enter the breadth");

        b = s.nextInt();

        c1 = l * b;

        System.out.println("Area of the rectangle is " + c1);

    }

}



class Square implements Area {

    int a, c2;

    public void calculate() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the a value for square");

        a = s.nextInt();

        c2 = a * a;

        System.out.println("Area of the square is " + c2);

    }

}


class Program2 {

    public static void main(String args[]) {

        Rectangle r = new Rectangle();

        Square s1 = new Square();

        r.calculate();

        s1.calculate();

    }

}