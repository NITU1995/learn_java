package CrudDemo;
import java.util.Set;
import java.util.TreeSet;

import static CrudDemo.CrudOperationType.getNextValue;
import static CrudDemo.CrudOperationType.getOperation;

public class CrudTreeSet {

    public static void performOperationInTreeSet(){

        Set mySet = new TreeSet();
        boolean loopFlag = true;

        while (loopFlag){

            int opType = getOperation();
            int value = 0;

            try{

                switch(opType){
                    case 1:
                        value = getNextValue("value");
                        mySet.add(value);
                        System.out.println("TreeSet value added " + mySet);
                        break;
                    case 2:
                        value = getNextValue("value");
                        mySet.add(value);
                        System.out.println("TreeSet value added " + mySet);
                        break;
                    case 3:
                        System.out.println("Set doesn't provide index based storing/fetching");
                        break;
                    case 4:
                        value = getNextValue("value");
                        if(mySet.contains(value)){
                            mySet.remove(value);
                            mySet.add(value);
                        }
                        System.out.println("Value is updated " + mySet);
                        break;
                    case 5:
                        value = getNextValue("value");
                        mySet.remove(value);
                        System.out.println("Removed value " + mySet);
                        break;
                    case 6:
                        mySet.clear();
                        System.out.println("Set is cleared " + mySet);
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
