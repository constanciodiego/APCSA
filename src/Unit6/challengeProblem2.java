package Unit6;
import java.util.Scanner;
import java.util.Arrays;

public class challengeProblem2 {
    public static void main(String[]args){
        double arrLen= 0;
// make a rnd thing where it chooses the array length from 0 to 10, then have the
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount length you want your array: ");
        arrLen = (int) scan.nextDouble();
        double[] arr = new double[(int) arrLen];
        System.out.println("Enter in: " + arr.length +" numbers");

    }
}
