public class Palindrome_Number {
    public static void main(String[] args) {
        int number = 121;
        int temp = number;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (number == rev) ;
        {
            System.out.println(no + "is palindrome number");
        }
        else{
            System.out.println(no + "is not palindrome number");
        }
    }
}