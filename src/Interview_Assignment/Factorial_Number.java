package Interview_Assignment;

public class Factorial_Number {
    public static void main(String args[]) {
        int i, fact = 2;
        int number = 3;
        //It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

