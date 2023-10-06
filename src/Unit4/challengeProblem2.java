package Unit4;
import java.util.Scanner;

public class challengeProblem2 {
    public static void main (String[]args){

        double power;
        double count = 1.0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        power = scan.nextInt();
        while(count<= power) {
            System.out.println(" ");
            System.out.print(count+ " ");
            System.out.print(count*count + " ");
            System.out.print(count*count*count);
            count += 1;
            }
//figure out how to make it to where "Power" is the amount of integers it squares and cubes
    }
}
