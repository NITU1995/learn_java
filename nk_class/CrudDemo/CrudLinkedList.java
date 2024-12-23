package CrudDemo;

import java.util.LinkedList;
import java.util.List;

import static CrudDemo.CrudOperationType.getNextValue;
import static CrudDemo.CrudOperationType.getOperation;

public class CrudLinkedList {


    public static void performOperationInLinkedList(){

        List myArrayList = new LinkedList();
        boolean loopFlag = true;

        while (loopFlag){

            int opType = getOperation();
            int value = 0, index = 0;

            try{

                switch(opType){
                    case 1:
                        value = getNextValue("value");
                        myArrayList.addLast(value);
                        System.out.println("Added last of the List " + myArrayList);
                        break;
                    case 2:
                        value = getNextValue("value");
                        myArrayList.add(value);
                        System.out.println("Added first of the List " + myArrayList);
                        break;
                    case 3:
                        index = getNextValue("index");
                        System.out.println("Value for given index is " + myArrayList.get(index));
                        break;
                    case 4:
                        index = getNextValue("index");
                        value = getNextValue("value");
                        myArrayList.set(index, value);
                        System.out.println("Value is updated " + myArrayList);
                        break;
                    case 5:
                        index = getNextValue("index");
                        myArrayList.remove(index);
                        System.out.println("Index value is removed " + myArrayList);
                        break;
                    case 6:
                        myArrayList.clear();
                        System.out.println("List is cleared " + myArrayList);
                        break;
                    case 7:
                        loopFlag = false;
                        System.out.println("Thank you!");
                        break;
                    default:
                        System.out.println("Invalid input. Try again!");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

}
