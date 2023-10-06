package Unit4;
import java.util.Scanner;
public class challengeProblem5 {
    public static void main(String[] args) {
        int game = 1;
        int comp = 0;
        int input;
        comp = (int) (Math.random() * 3 + 1);

        System.out.println(comp);

        //showing what the computer chose
        if (comp == 1) {
            System.out.println("rock");
        }
        if (comp == 2) {
            System.out.println("paper");
        }
        if (comp == 3) {
            System.out.println("scissor");
        }

        int compPoint = 0;
        int usePoint = 0;
        int rock = 1;
        int paper = 2;
        int scissor = 3;

        String quit = ("quit");

        Scanner scan = new Scanner(System.in);
        System.out.println("Rock Crushes scissors. Scissors cuts paper. Paper covers rock. Do you want to be rock - 1 paper - 2 or scissors - 3 (or quit)? ");
        int x = 1;
        input = scan.nextInt();
        quit = scan.nextLine();


            while (input >= 1 && input <= 3) {
                if (input == comp) {
                    System.out.println("You both chose the same move, Try again");

                    break;

                }
                if (comp == 2 && input == 1) {

                    compPoint++;
                    System.out.println("You lost!!");
                    System.out.println("User" + usePoint + "-" + "Computer" + compPoint);
                }
                if (comp == 3 && input == 2) {

                    compPoint++;
                    System.out.println("You lost!!");
                    System.out.println("User" + usePoint + "-" + "Computer" + compPoint);

                }
                if (comp == 1 && input == 3) {

                    compPoint++;
                    System.out.println("You lost!!");
                    System.out.println("User" + usePoint + "-" + "Computer" + compPoint);
                }
                if (comp == 1 && input == 2) {

                    usePoint++;
                    System.out.println("You win");
                    System.out.println("User" + usePoint + "-" + "Computer" + compPoint);
                }
                if (comp == 2 && input == 3) {

                    usePoint++;
                    System.out.println("You win");
                    System.out.println("User" + usePoint + "-" + "Computer" + compPoint);
                }
                if (comp == 3 && input == 1) {

                    usePoint++;
                    System.out.println("You win");
                    System.out.println("User" + usePoint + "-" + "Computer" + compPoint);
                }
            }

    }

}
