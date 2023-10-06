package Unit6;
import java.util.Scanner;
public class problem4 {
    public static void main(String[]args){
        double[] numbers = new double[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("The size of the array: "+ numbers.length);
        for (int index = 0; index < numbers.length; index++){
            System.out.println("Enter a number " + (index + 1)+ ": ");
            numbers[index]= scan.nextDouble();
        }
        System.out.println("The numbers in reverse order:");
        for (int index = numbers.length-1; index>=0 ; index--)
            System.out.println(numbers[index]+ " ");
        System.out.println();
    }
}
