package practice;

class Operators {
    
    public static void main(String []args){
        
        System.out.println("\nArithmetic practice.Operators:");
        int a = 10, b = 5;
        System.out.println(a + b);  // 15
        System.out.println(a - b);  // 5
        System.out.println(a * b);  // 50
        System.out.println(a / b);  // 2
        System.out.println(a % b);  // 0

        System.out.println("\nRelational (Comparison) practice.Operators:");
        int c = 10, d = 20;
        System.out.println(c == d);  // false
        System.out.println(c != d);  // true
        System.out.println(a > d);   // false
        System.out.println(a < d);   // true

        System.out.println("\nLogical practice.Operators:");
        boolean e = true, f = false;
        System.out.println(e && f);  // false
        System.out.println(e || f);  // true
        System.out.println(!e);      // false

        System.out.println("\nAssignment practice.Operators:");
        a = 10;
        a += 5;
        System.out.println(a);  // a = 15
        a -= 3;  
        System.out.println(a);  // a = 12
        a *= 2;  
        System.out.println(a);  // a = 24

        System.out.println("\nBitwise practice.Operators:");
        a = 5;
        b = 3; // In binary: a = 0101, b = 0011
        System.out.println(a & b);   // 1 (0001) //Bitwise AND
        System.out.println(a | b);   // 7 (0111) //Bitwise OR
        System.out.println(a ^ b);   // 6 (0110) //Bitwise XOR (exclusive OR)
        System.out.println(~a);      // -6 (Inverts the bits of 5) //Bitwise NOT (one’s complement)
        System.out.println(a << 1);  // 10 (Shift left by 1: 1010) //Left shift
        System.out.println(a >> 1);  // 2 (Shift right by 1: 0010) //Right shift

        System.out.println("\nUnary practice.Operators:");
        a = 5;
        System.out.println(++a);  // 6 (pre-increment: First increment then use)
        System.out.println(a--);  // 6 (post-decrement, First use then decrement)
        System.out.println(a);    // 5

        System.out.println("\nTernary (Conditional) practice.Operators:");
        a = 5;
        b = 10;
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);  // Output: b is greater

        System.out.println("\nInstanceof practice.Operators:");
        String str = "Checking the string instance.";
        System.out.println(str instanceof String); //true

        System.out.println("\nType Cast practice.Operators:");
        a = 10;
        double typecastedVal = (double) a; // Type casting int to double
        System.out.println(typecastedVal);  // Output: 10.0
    }
}
