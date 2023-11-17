import java.util.Random;
import java.util.Scanner;

public class randomnumber {
    public static void main(String args[]) {

        Random random = new Random();

        int x = random.nextInt(51);
        int count = 1;

        System.out.println("you can only make 5 attempts");
        System.out.println("enter your guess for the number within the range 0-50");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while ((a != x) && (count <= 4)) {

            count++;
            if (a < x) {

                if (a < x - 5) {
                    System.out.println("your guess is too low");
                } else
                    System.out.println("your guess is low");

                System.out.println("enter your guess for the number within the range 0-50");
                a = sc.nextInt();

            } else if (a > x) {
                if (a > x + 5) {
                    System.out.println("your guess is too high");
                } else
                    System.out.println("your guess is high");

                System.out.println("enter your guess for the number within the range 0-50");
                a = sc.nextInt();

            }
        }
        if (a == x) {
            System.out.println("congratulations!!! you have guessed the correct number.");

            if (count == 1) {
                System.out.println("you have taken " + count + " attempt to guess the correct number.");

            } else {
                System.out.println("you have taken " + count + " attempts to guess the correct number.");

            }
        }
        if ((count > 4) && (a != x)) {
            System.out.println("you have exceeded the number of attempts.");

        }

    }
}
