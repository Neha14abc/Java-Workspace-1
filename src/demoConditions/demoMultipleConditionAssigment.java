package demoConditions;

public class demoMultipleConditionAssigment {
    public static void main(String[] args) {
        int marks = 90;
        if (marks >70) {
            System.out.println("First Division...." + marks);
        }
        if (marks >50) {
            System.out.println("Second Division..." + marks);
        }
        if (marks >40) {
            System.out.println("Third Division...." + marks);
        }
        if (marks >20) {
            System.out.println("Fail..." +marks);
    }
}
}
