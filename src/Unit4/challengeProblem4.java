package Unit4;
import java.util.Scanner;


public class challengeProblem4 {
    public static void main(String[]args) {
        int num = 0;
        num = (int) (Math.random() * 100);
        int guess;
        Scanner scan = new Scanner(System.in);
        boolean correct = false;

        while (!correct) {
            System.out.println("Guess the number: ");
            guess = scan.nextInt();

            if (guess == num) {
                System.out.println("Correct!");
                break;
            }

            if (num > guess){
                    System.out.println("Higher");
            correct = false;
            }

            if (num < guess) {
                System.out.println("Lower");
            correct = false;
            }


        }
    }
}
