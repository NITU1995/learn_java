
class  MethodTypes{

    public static void main(String arg[]) {
        //Instance Method Example
        Car car = new Car();
        car.brand = "Toyota";
        car.start();

        //Static Method Example
        int sum = Calculator.add(10, 2);
        System.out.println("Sum: " + sum);

        //Parameterized & Non-Parameterized Methods Example
        MathOperations math = new MathOperations();
        math.welcome();
        int product = math.multiply(5, 3); // Passing parameters
        System.out.println("Product: " + product);

        //Accessor Methods Example
        Student student = new Student();
        student.setName("Alice");
        System.out.println(student.getName());

        //Abstract Method Example
        Animal dog = new Dog();
        dog.sound(); // Implementing abstract method
    }
}

//1. Instance Methods:
class Car {
    String brand;

    // - Belongs to instance of class, access instance variables and methods
    // - Must create an object of the class to call Instance Methods.
    void start() {
        System.out.println(brand + " is starting.");
    }
}

//2. Static Methods:
class Calculator{

    // - Belong to the class, only access static variables and static methods
    // - Can call a static method directly using the class name, without creating an instance
    static int add(int a, int b){
        return a + b;
    }

}

//3. Parameterized & Non-Parameterized Methods
class MathOperations {
    //methods accept input parameters.
    int multiply(int a, int b) {
        return a * b;
    }

    //methods do not accept any input parameters.
    void welcome() {
        System.out.println("Welcome to calculator!");
    }
}

//4. Accessor (Getter) Methods
// - Methods that is used to retrieve the value of an instance variable
class Student {
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter/Mutator method
    public void setName(String name) {
        this.name = name;
    }
}

//5. Abstract Methods
// - Methods without a body, declared in an abstract class or an interface.
// - They must be implemented by any subclass.
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

//6. Final Methods
// - Final methods ensures its behavior cannot be altered/override by subclasses
class Parent {
    public final void display() {
        System.out.println("Final method in Parent class");
    }
}

class Child extends Parent {
    // display() Cannot override display method here
}


//7. Synchronized Methods
// - Used in multi-threaded environments to ensure that only one thread can access the method at a time
//   and to avoid concurrency issues.
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

//8. Constructor Methods
// - Constructors are special methods used to initialize objects.
// - Same name as the class and have no return type.
class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }
}
