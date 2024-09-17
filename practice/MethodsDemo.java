class MethodsDemo{

    public static void main(String arg[]){
        MethodsDemo obj = new MethodsDemo();
        System.out.println("Max value is :" + obj.findMax(3, 9));

        //Method Overloading
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println(calc.add(10, 20));          // Output: 30 (2 int parameters)
        System.out.println(calc.add(10, 20, 30));      // Output: 60 (3 int parameters)
        System.out.println(calc.add(5.5, 4.5));


        //Method Overridding
        Animal animal = new Animal();   // Calls Animal's sound method
        animal.sound();                 // Output: Animal is making a sound

        Dog dog = new Dog();            // Calls Dog's overridden sound method
        dog.sound();                    // Output: Dog is barking

        Animal animalDog = new Dog();   // Polymorphism: Calls Dog's sound method
        animalDog.sound();              // Output: Dog is barking

    }

    // Method with multiple return statements
    public int findMax(int a, int b) {
        if (a > b) {
            return a; // Returns a if it's greater
        } else {
            return b; // Returns b otherwise
        }
    }

}

class Calculator {

    // Overloaded method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    // Overriding method in the child class
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}
/*
    Return statement: is crucial for ending method execution and passing control back to the calling code with (or without) a value.
    Key Points:
        - Matching Return Types
        - void Methods: With void return type, "return;" is used to exit the method early without returning any value.
        - Multiple Returns: Can have multiple return statements, but only one will be executed based on logic flow.
        - Returning Expressions: Example can return "return a + b;"

    Method Overloading: multiple methods in the same class have the same name but different parameter lists.
    Key Points:
        - Signature Change: Methods must differ by number, type, or order of parameters.
        - Return Type: The return type can be different but doesn't influence overloading.
        - Static Methods: You can overload static methods.
        - Overloading Constructors: Constructors can also be overloaded.
        - Example: Same method name, different argument list.

    Method Overriding: Occurs when a subclass provides a specific implementation of a method that is already defined in its parent class.
    Key Points:
        - Inheritance Required: Method overriding only happens in a child class that extends a parent class.
        - Same Signature: Method name, return type, and parameters must be the same.
        - Run-time Polymorphism: The overridden method that gets called depends on the object's type at runtime.
        - Access Modifier: The child method's access level must be the same or more permissive than the parent method.
*/