package demoConditions;

public class demoSwitchWeek {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("First day of a week is Monday:" + day);
                break;
            case 2:
                System.out.println("Second day of a week is Tuesday:" + day);
                break;
            case 3:
                System.out.println("Third day of a week is Wednesday:" + day);
                break;
            case 4:
                System.out.println("Fourth day of a week is Thursday:" + day);
                break;
            case 5:
                System.out.println("Fifth day of a week is Friday:" + day);
                break;
            case 6:
                System.out.println("Sixth day of a week is Saturday:" + day);
                break;
            case 7:
                System.out.println("Seventh day of a week is Sunday:" + day);
                break;
            default:
                System.out.println("Not Valid Day");
        }
    }
}

