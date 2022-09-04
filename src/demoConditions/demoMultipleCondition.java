package demoConditions;

public class demoMultipleCondition {
    public static void main(String[] args) {
        int age=19;
        String city="agra";
        // TRUE & TRUE=TRUE CONDITION
        if(age>18&city=="agra") {
        System.out.println("you are eligible");
    }
    else{
            System.out.println("you are not eligible");
    }
     //TRUE & FALSE=FALSE CONDITION


        if(age>18&city=="PUNE") {
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
        //FALSE AND TRUE =FALSE CONDITION
        if(age>21&city=="agra") {
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
        //FALSE & FALSE=FALSE CONDITION
        if(age>13&city=="GUJRAT") {
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}
