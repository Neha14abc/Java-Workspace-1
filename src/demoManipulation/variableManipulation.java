package demoManipulation;

public class variableManipulation {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        //Addition
        int sum = (a + b);
        System.out.println("Addition of the two numbers:  " +sum);

        //Subtraction
        int sub =(a-b);
        System.out.println("Subtraction of the two numbers:  " +sub);

        //Multiplication
        int mul =(a*b);
        System.out.println("Multiplication of the two numbers:  " +mul);

        //Division
        int div =(a/b);
        System.out.println("Division of the two numbers:  " +div);

        //Module
        int mod=(a%b);
        System.out.println("Remainder of the two numbers:  "  +mod );

        //Variable name are different for module
        int c=13;
        int d=6;
        int mod1=(c%d);
        System.out.println("Remainder of the two numbers:  "  +mod1 );

        //Increment
        int i=0;
        i++;
        System.out.println("Increment of that value is:" +i);

        //Decrement
        int j=10;
        j--;
        System.out.println("Decrement of that value is:" +j);

        double x=3.45;
        double y=43.2;
        double sum1=(x+y);
        double sub1=(x-y);
        double mul1=(x*y);
        double div1=(x/y);
        System.out.println("manipulation of the values:"+sum1);
        System.out.println("manipulation of the values:"+sub1);
        System.out.println("manipulation of the values:"+mul1);
        System.out.println("manipulation of the values:"+div1);
    }
}

