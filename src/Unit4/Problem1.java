package Unit4;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("What is the limit on the counter?");
        int Limit = scan.nextInt();
        int count = 1;
        while(count<= Limit){
            System.out.println(count);
            count+=1;
        }
        System.out.println("Done");
    }
}
