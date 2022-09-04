package demoConditions;

public class demoIF {
    public static void main(String[] args) {
        int age = 25;
        if (age <= 21) {
            System.out.println("THEY ARE MINOR...." + age);
        }
        if (age > 21) {
            System.out.println("THEY ARE NOT MINOR..." + age);
        }
    }
}
