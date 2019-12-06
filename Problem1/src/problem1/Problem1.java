package problem1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for x");
        double x = input.nextDouble();
        System.out.println("Enter a value for y");
        double y = input.nextDouble();
        double f = squareroot(x);
        double g = cubef(x);
        double h = sinsquare(x);
        double i = toradians(x);
        double j = function(x, y);
        System.out.println("f(x) = " + f);
        System.out.println("g(x) = " + g);
        System.out.println("h(x) = " + h);
        System.out.println("i(x) = " + i);
        System.out.println("j(x, y) = " + j);
    }

    public static double squareroot(double x) {
        double value = Math.sqrt(x + 1);
        return value;
    }

    public static double cubef(double x) {
        double value = (x * x * x) - (2 * x * x) + x - 4;
        return value;
    }

    public static double sinsquare(double x) {
        double value = Math.sin(x) * Math.sin(x);
        return value;
    }

    public static double toradians(double x) {
        double radians = Math.toRadians(x);
        double value = sinsquare(radians);
        return value;
    }

    public static double function(double x, double y) {
        double value = x * x + y * y;
        return value;
    }
}
