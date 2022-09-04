package demoConditions;

public class demoMultipleConditionRAM {
    public static void main(String[] args) {
        int RAM = 8;
        String BRAND = "HP";

        // TRUE & TRUE=TRUE CONDITION
        if (RAM > 7 & BRAND == "HP") {
            System.out.println("GOOD CONFIGURATION");
        } else {
            System.out.println("NOT GOOD CONFIGURATION");
        }

        //TRUE & FALSE=FALSE CONDITION
        if (RAM > 8 & BRAND == "DELL") {
            System.out.println("GOOD CONFIGURATION");
        } else {
            System.out.println("NOT GOOD CONFIGURATION");
        }
        //FALSE AND TRUE =FALSE CONDITION

        if (RAM > 9 & BRAND == "HP") {
            System.out.println("GOOD CONFIGURATION");
        } else {
            System.out.println("NOT GOOD CONFIGURATION");
        }
        //FALSE & FALSE=FALSE CONDITION

        if (RAM > 20 & BRAND == "LENOVA") {
            System.out.println("GOOD CONFIGURATION");
        } else {
            System.out.println("NOT GOOD CONFIGURATION");
        }
    }
}


