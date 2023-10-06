package Unit6;

public class problem7 {
    public static void main(String[]args){
        String[] grades = {"A","A-", "B+","B","B-","C+", "C", "C-","D+","D", "D-","F"};
        int[]cutoff = {95, 90,87,83,80,77,73,70,67,63,60,0};
        for(int level =0; level< cutoff.length; level++)
            System.out.println(grades[level]+ "\t" + cutoff[level]);

        System.out.println("GRADES");

        for (String j: grades) {
            System.out.println(j);
        }
        System.out.println("CUTOFF");

        for (int i: cutoff){
            System.out.println(i);
        }

    }
}
