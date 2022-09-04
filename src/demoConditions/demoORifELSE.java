package demoConditions;

public class demoORifELSE {
    private static Object String;

    public static void main(String[] args) {
            int marks=75;
            String section = "science";
            // TRUE || TRUE=TRUE CONDITION
            if (marks > 75 || section == "science") {
                System.out.println("GOOD FUTURE");
            } else {
                System.out.println("NOT GOOD FUTURE");
            }
            //TRUE || FALSE=FALSE CONDITION
            String ="art";
             if (marks > 75 || section == "science") {
                System.out.println("GOOD FUTURE");
            }
             else {
                System.out.println("NOT GOOD FUTURE");
            }
            //FALSE || TRUE =FALSE CONDITION

            if (marks < 40 || section == "science") {
                System.out.println("GOOD FUTURE");
            } else {
                System.out.println(" NOT GOOD FUTURE");
            }
            //FALSE || FALSE=FALSE CONDITION
            if (marks< 60 || section == "commerce") {
                System.out.println("GOOD FUTURE");
            } else {
                System.out.println("NOT GOOD FUTURE");
            }
        }
    }

