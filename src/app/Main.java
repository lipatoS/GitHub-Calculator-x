package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for Users!");

        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = subtraction(a, b);
        System.out.println(e);
        double f = divide(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

}