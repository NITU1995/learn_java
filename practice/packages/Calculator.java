package practice.packages;

public class Calculator {

    public int addition(int a, int b) {
        return (a + b);
    }

    double addition(int a, double b) {
        return (a + b);
    }

    void addition(int a, int b, double c) {
        System.out.println("int, int & double: " + (a + b + c));
    }

    float addition(float a, double b, int c) {
        //Typecasted to Float otherwise its giving error: incompatible types: possible lossy conversion from double to float
        float result = a + (float) b + (float) c;
        return result;
    }

    static int substraction(int a, int b) {
        return (a - b);
    }

    static double substraction(int a, double b) {
        return (a - b);
    }

    static void substraction(int a, int b, double c) {
        System.out.println("int, int & double: " + (a - b - c));
    }

    static float substraction(float a, double b, int c) {
        //Typecasted to Float otherwise its giving error: incompatible types: possible lossy conversion from double to float
        float result = a - (float) b - (float) c;
        return result;
    }

    int division(int a, short b) {
        return a / b;
    }

    float division(float a, int b) {
        return a / b;
    }

    double division(double a, int b) {
        return a / b;
    }

    static double percentage(double a, int b) {
        return (a / b) * 100;
    }

    static float percentage(float a, int b) {
        return (a / b) * 100;
    }

    int average(int a, int b) {
        return (a + b) / 2;
    }

    double average(int a, double b) {
        return (a + b) / 2;
    }

    double average(int a, int b, double c) {
        double result = (a + b + c) / 3;
        return result;
    }

    double average(float a, double b, int c) {
        double result = (a + b + c) / 3;
        return result;
    }

    public static void main(String arg[]) {
        Calculator obj = new Calculator();

        System.out.println("\nAddition:");
        System.out.println("int & int: " + obj.addition(7, 10));
        System.out.println("int & double: " + obj.addition(3, 12.5));
        obj.addition(5, 7, 33.33);
        System.out.println("float, double & int: " + obj.addition(4.90f, 5.13, 10));

        System.out.println("\nSubstraction:");
        System.out.println("int & int: " + Calculator.substraction(7, 10));
        System.out.println("int & double: " + Calculator.substraction(12, 3.5));
        Calculator.substraction(50, 7, 33.33);
        System.out.println("float, double & int: " + Calculator.substraction(40.90f, 5.13, 10));

        System.out.println("\nDivision:");
        System.out.println("int & short: " + obj.division(7, 2));
        System.out.println("double & int: " + obj.division(12.5, 3));
        System.out.println("float & int: " + obj.division(30.56, 5));

        System.out.println("\nPercentage:");
        System.out.println("double & int: " + Calculator.percentage(550.5, 600));
        System.out.println("float & int: " + Calculator.percentage(480, 600));

        System.out.println("\nAverage:");
        System.out.println("int & int: " + obj.average(7, 2));
        System.out.println("int & double: " + obj.average(24, 20.22d));
        System.out.println("int, int & double: " + obj.average(12, 16, 20.00d));
        System.out.println("float, double & int: " + obj.average(30.30f, 40.40d, 50));
    }
}

/*
1. Use of new keywords:
    - Create object or allocates memory for an instance of the class.
    - Calls Constructor: new calls the class constructor when initializing the object.
    - Returns Reference of the newly created object.

2. list all the keywords that we used so far.
    - class
    - static
    - new
    - return
    - Branching Statements: break, continue
    - Loops names: for, if, while, do, switch
    - data types: void, boolean, char, String, byte, short, int, long, float, double

*/
