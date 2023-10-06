package Unit6;

public class problem2 {
    public static void main(String[]args){
    final int LIMIT = 15, MULT = 10;
    int[] list = new int[LIMIT];

    for (int index = 0; index < LIMIT; index++){
        list[index] = index *MULT;
        }
    list[5] = 999;
    list[7] = 444;
    for (int value : list) {
        System.out.println(value +" ");
    }

    }
}
