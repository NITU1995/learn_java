import java.util.Scanner;
import java.util.TreeSet;

import static CrudDemo.CrudArrayList.performOperationInArray;
import static CrudDemo.CrudHashSet.performOperationInHashSet;
import static CrudDemo.CrudLinkedHashSet.performOperationInLinkedHashSet;
import static CrudDemo.CrudLinkedList.performOperationInLinkedList;

public class Main {
    public static void main(String[] args) {
        crudOperation();
    }

    private static void crudOperation(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please choose Data Structure: 1-ArrayList, 2-LinkedList, 3-HashSet, 4-LinkedHashSet, 5-TreeSet ");
        int dsType = input.nextInt();

        switch(dsType){
            case 1:
                performOperationInArray();
                break;

            case 2:
                performOperationInLinkedList();
                break;

            case 3:
                performOperationInHashSet();
                break;

            case 4:
                performOperationInLinkedHashSet();
                break;

            case 5:
                break;
            default:
                System.out.println("Invalid input. Exit!");
        }
    }

}