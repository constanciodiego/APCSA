package DataTypes;

public class Charge {
    private static String uVal;
    public Charge(int val) {
        uVal = Integer.toString(val);
    }

    public String toString() {
        int i = Integer.parseInt(uVal);
        i *= 4;

        return Integer.toString(i);
    }
}
