package CrudDemo;

import java.util.Scanner;

public class CrudOperationType {

    public static int getOperation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please select operation: 1-Add, 2-AddFirst, 3-GetByIndex, 4-UpdateByIndex 5-RemoveByIndex 6-Clear 7-Exit!");
        return input.nextInt();
    }

    public static int getNextValue(String type){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter " + type + ": ");
        return input.nextInt();
    }
}
