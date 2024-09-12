package practice;

class Loops {
    public static void main(String args[]){
        
        System.out.println("For Loop");
        for (int i = 0; i < 3; i++) {
            System.out.println(i); //body of the loop
        }

        System.out.println("While Loop");
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }        
        
        System.out.println("Do While Loop");
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 3);

        System.out.println("Enhanced for loop");
        String[] students = {"Nik", "Nit", "Zeel"};
        for(String name: students){
            System.out.println(name);
        }
    }
}

//Output:
/*
For Loop
0
1
2

While Loop
0
1
2

Do While Loop
0
1
2

Enhanced for loop
Nik
Nit
Zeel

*/