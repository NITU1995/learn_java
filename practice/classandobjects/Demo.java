package practice.classandobjects;
import practice.packages.Calculator;
import java.util.Scanner; //Single Import
import java.util.*; //Wildcard Import
import static java.lang.Math.PI; //Static Import
import static java.lang.Math.sqrt; //Static Import

public class Demo{
    public static void main(String arg[]){

        System.out.println(sqrt(4));
        System.out.println(PI);
        Calculator obj = new Calculator();
        System.out.println(obj.addition(3,4));
    }
}

/*
RUN From: learn_java >
 javac -cp . practice/classandobjects/Demo.java
 java -cp . practice/classandobjects/Demo

Oops:
    Object Oriented Programming System is a programming paradigm based on the concept of "Objects",
    which can cantain data(Fields/Attributes) & methods (functions) that operate on that data.

    Concepts of Oops:
        1. Class: Its blueprint or template for creating objects. It defines the attributes (fields) and behaviors (methods)
           that the objects created from the class can have.
        2. Object: Object is the instace of the class
        3. Encapsulation: This is the practice of building the data and methods that are operate data into a single unit.
           Use access modifiers(Like: Public, Private, protected) to retrict direct access or to allow publicly.
           Promotes data security & integrity.
        4. Inheritance: It allows one class to inherit the properties and behavior of another class. Promotes reusability & hirarchical classification.
        5. Polymorphism: It allows a single method to behave differently based on the object is acting upon.
            5.1. Complile-time Polymorphism: Method Overloading
            5.2. Run-time Polymorphism: Method Overring
        6. Abstraction: Its the process of hiding the internal details of the class and showing only the essential features.
           It can be achieved through abstract classes or interfaces. It helps in managing complexity.

*/
