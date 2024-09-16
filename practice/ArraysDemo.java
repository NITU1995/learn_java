/**Arrays & Array Variables.
1. How to declare and initialise array?
2. How many ways we can create an array?
3. Advantages & limitations of array.
4. Write a program:
  1. Find size of array.
  2. Print all the elements of array.
*/
//package practice;
import java.lang.reflect.Array;

class ArraysDemo{

    public static void main(String []args){
        int[] ids; //Declaring
        ids = new int[5]; // Instantiating (Here 5 is the size of the array)

        //Initializing
        ids[0] = 10;
        ids[1] = 20;
        ids[2] = 30;
        ids[3] = 40;
        ids[4] = 50;

        //Listing down the no of ways to create Arrays
        //1. Using new Keyword with Size
        int[] numbers1 = new int[5];

        //2. Using new Keyword with Values
        int[] numbers2 = new int[]{10, 20, 30, 40, 50};

        //3. Array Initialization without new Keyword (Literal Ways)
        int[] numbers3 = {10, 20, 30, 40, 50};

        //4. Creating Multidimensional Arrays
        int[][] matrix = new int[3][3]; // A 3x3 matrix

        //Initializing a 2D array with values:
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //5. Anonymous Array
        //Its the Array without assigning it to a variable
        printArray(new int[]{1,2,3,4});

        //6. Arrays Using Reflection (Advanced)
        //Used in frameworks or when dynamically manipulating arrays.
        int[] numbers4 = (int[]) Array.newInstance(int.class, 5);

        //7. Array of Objects
        //Each element of the array will be an object of a particular class
        Student[] students = new Student[3];
        students[0] = new Student("Abc", 28);
        students[1] = new Student("Qwerty", 25);
        students[2] = new Student("Xyz", 30);

        //Print Students
        for (Student student : students) {
            System.out.println(student.name + " - " + student.age);
        }

        //Print All the arrays
        printArray(ids);
        printArray(numbers1);
        printArray(numbers2);
        printArray(numbers3);
//        printArray(matrix);
//        printArray(matrix1);
        printArray(numbers4);

        // Find the size of the array using the length property
        int size = ids.length;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
/*
Advantages:
    - Efficient Data Access
    - Fixed Size
    - Compact Memory Allocation
    - Supports Multiple Data Types
    - Simple to Use: Accessing, Updating, Iterating
    - Multidimensional Arrays

Dis-Advantages:
    - Fixed Size: Wasted memory or insufficient space
    - No Built-in Bound Checking: Doest know in runtime if array index access out of bounds.
    - Inefficient for Insertion/Deletion: Array requires shifting elements. Time Complexity O(n)
    - Homogeneous Data: Same type of data storage
    - Lack of Flexibility: Cant grow/shrink dynamically.
*/