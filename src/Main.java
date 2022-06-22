import java.util.Scanner;
public class Main {
    static int birthMonth;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your birth month? Say number between 1-12.");
        birthMonth = sc.nextInt();
        if (birthMonth < 1 || birthMonth > 12) {
            System.out.println("You entered an incorrect month (" + birthMonth + ")");
        }
        else {
            System.out.println("Valid input (" + birthMonth + ")");
        }

    }
}