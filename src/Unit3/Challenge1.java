package Unit3;
import java.util.Scanner;

public class Challenge1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whose face is on your bill? Jackson, Washington, Jefferson, Hamilton, Franklin, Grant: ");
        String note = scan.nextLine();
        if (note.equals("Washington")) {
            System.out.println(note + ": $1" );
        } else if (note.equals("Jefferson")) {
            System.out.println(note + ": $2" );
        } else if (note.equals("Lincoln")) {
            System.out.println(note + ": $5" );
        } else if (note.equals("Hamilton")) {
            System.out.println(note + ": $10" );
        } else if (note.equals("Jackson")) {
            System.out.println(note + ": $20" );
        } else if (note.equals("Grant")) {
            System.out.println(note + ": $50" );
        } else if (note.equals("Franklin")) {
            System.out.println(note + ": $100" );
        } else {
            System.out.println("This is not a banknote!");
        }
    }
}