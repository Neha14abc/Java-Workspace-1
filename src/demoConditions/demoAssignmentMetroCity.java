package demoConditions;

public class demoAssignmentMetroCity {
    public static void main(String[] args) {
        int age=19;
        String city="Delhi";
        // TRUE & TRUE=TRUE CONDITION
        if(age>18&city=="Delhi") {
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting ");
        }
        //TRUE & FALSE=FALSE CONDITION
        if(age>18&city=="Tundla") {
            System.out.println("you are eligible for voting ");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
        //FALSE AND TRUE =FALSE CONDITION
        if(age>21&city=="Delhi") {
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
        //FALSE & FALSE=FALSE CONDITION
        if(age>13&city=="GUJRAT") {
            System.out.println("you are eligible for voting ");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
    }
}
