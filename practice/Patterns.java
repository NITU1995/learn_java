package practice;

public class Patterns {
    public static void main(String []args){

        int length = 5;

        /*
         #1
            *
            *	*
            *	*	*
            *	*	*	*
            *	*	*	*	* 
        */
        System.out.println("\n ---Pattern 1---");
        for(int i=0; i < length; i++){
            for(int j=0; j < length; j++){
                if(j <= i){
                    System.out.print("* \t");
                }
            }
            System.out.println("");
        }

        /*
         #2
                    *02
                    *12
            *20	*21	*22	*23	*24
                    *32
                    *42
        */
        System.out.println("\n ---Pattern 2---");
        int mid = length/2;
        for(int i=0; i < length; i++){
            for(int j=0; j < length; j++){
                if(j == mid || i == mid){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        /*
         #3
            *00  			*04
                *11		*13
                    *22
                *31		*33
            *40				*44
        */
        System.out.println("\n ---Pattern 3---");
        for(int i=0; i < length; i++){
            for(int j=0; j < length; j++){
                if(j == i || (i+j) == length-1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        /*
         #4
            *00	*01	*02	*03	*04
            *10				*14
            *20				*24
            *30				*34
            *40	*41	*42	*43	*44
        */
        System.out.println("\n ---Pattern 4---");
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(i == 0 || i == length-1 || j == 0 || j == length-1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
