/*
Methods can return:
    - Primitive Data Types:
        int, double, boolean, char, long, short, float, byte.
    - Reference Types:
        Classes (e.g., String, custom classes), Arrays, Collections (e.g., List, Map, Set), etc.
    - Void:
        Indicates no return value.
    - Generics:
        Flexible return type for multiple data types.
*/
import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

class MethodReturnTypes{
    public static void main(String arg[]){
        MethodReturnTypes obj = new MethodReturnTypes();
        System.out.println(obj.getPi());
        System.out.println(obj.getName());

        Student stu1 = obj.createStudent();
        System.out.println(stu1.name + "'s age is " + stu1.age);

        int[] numbers = obj.getNumbers();
        for(int val: numbers){
            System.out.println(val);
        }

        List<String> fruits = obj.getFruits();
        System.out.println(fruits);

        Map<String, Integer> grades = obj.getStudentsGrades();
        System.out.println(grades);

        String strVal = obj.genericReturnType("genericReturnType");
        int intVal = obj.genericReturnType(5);
        System.out.println(strVal + " " + intVal);

        obj.checkNumber(9);
    }

    //Primitive Type: double
    public double getPi(){
        return 3.14159;
    }

    //Reference Type: String
    public String getName(){
        return "Neetu";
    }

    //Reference Type: Class
    public Student createStudent(){
        return new Student("Al", 18);
    }

    //Reference Type: Array
    public int[] getNumbers(){
        return new int[]{1,2,3,4,5};
    }

    //Reference Type: Collection ArrayList
    public List<String> getFruits() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        return fruits;
    }

    //Reference Type: Collection HashMap
    public Map<String, Integer> getStudentsGrades() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Al", 85);
        grades.put("CC", 90);

        return grades;
    }

    //Generic Type
    public <T> T genericReturnType(T value){
        return value;
    }

    //void with return (Optional)
    public void checkNumber(int num) {
        if (num < 0) {
            System.out.println(num + ": Negative number.");
            return; // Exits the method early
        }
        System.out.println(num + ": Positive number.");
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