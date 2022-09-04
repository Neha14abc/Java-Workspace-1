package demoConditions;

public class demoANDnestedIF {

        public static void main(String[] args) {
            int marks= 64;
            if (marks > 70) {
                System.out.println("First Division...." + marks);
            }
            else if(marks>50){
                System.out.println("Second Division..." + marks);
            }
            else if(marks>40){
                System.out.println("Third Division..." + marks);
            }
            else if(marks>10) {
                System.out.println("Fail..." + marks);
            }
        }

    }
