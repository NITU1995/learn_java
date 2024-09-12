package practice;

public class ConditionalStatements {
    
    public static void main(String []args){
        
        System.out.println("\nIf Statement:");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        System.out.println("\nIf-else Statement:");
        age = 16;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        System.out.println("\nIf-else-if Statement:");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        System.out.println("\nNested-If Statement:");
        score = 99;
        char ptClassGrade = 'A';
        if (score >= 90) {
            if (ptClassGrade == 'A'){
                System.out.println("Grade: A");
            }
        }

        System.out.println("\nSwitch Statement:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("\nTernary Operator:");
        age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);

        System.out.println("\nSwitch Statement(With String):");
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop!");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color");
        }

        System.out.println("Branching Statements:");
        for(int i=0; i < 5; i++){
            if(i == 2){
                System.out.println("No need to run 4. Continue further.");
                continue;
            }

            if(i == 4){
                System.out.println("We found 2. No need to continue further.");
                break;
            }
        }
    }
}
