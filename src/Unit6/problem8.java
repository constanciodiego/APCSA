package Unit6;
import java.util.Arrays;
public class problem8 {
    public static void main(String[]args){
        int[] org = new int[] {1,2,3};

        System.out.println("Original Array");
        for (int i = 0; i< org.length;i++)
            System.out.println(org[i] + " ");

        int[]copy = Arrays.copyOf(org,5);

        copy[3] = 11;
        copy[4] = 55;
        System.out.println("\nNew array copy after modifications:");
        for (int i = 0; i < copy.length; i++)
            System.out.println(copy[i] + " ");
    }
}
