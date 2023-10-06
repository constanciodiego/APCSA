package Unit6;
import java.util.Scanner;
import java.util.Arrays;

public class challengeProblem1 {
    public static void main(String[]args) {
        int arrLen = 0;



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount length you want your array: ");
        arrLen = (int) scan.nextDouble();
        double[] arr = new double[arrLen];
        System.out.println("Enter in: " + arr.length +" numbers");

        for (int index = 0; index < arr.length; index++) {
            System.out.println("Enter a number " + (index + 1) + ": ");
            arr[index] = scan.nextDouble();
        }

        for (double j : arr) {
            System.out.println(j);
        }

        System.out.println();
        System.out.println("Array length: " + arr.length);

        double total = 0;
        for (double i : arr) {
            total += i;
        }
        System.out.println();
        System.out.println("The Sum of all these numbers are: " + total);

        double average = (total / arr.length);
        System.out.println("The Average of this array is: " + average);

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("The Largest number of this array is:" + " " + max);

        double least = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < least)
                least = arr[i];
        }
        System.out.println("The Smallest number of this array is:" + " " + least);

        Arrays.sort(arr);
        System.out.println("Sorted: ");
        System.out.print(Arrays.toString(arr));

    }
}
