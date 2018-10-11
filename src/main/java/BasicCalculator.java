import java.text.DecimalFormat;

public class BasicCalculator {
    private int flotingPoints;

    public BasicCalculator(int flotingPoints) {
        this.flotingPoints = flotingPoints;

    }


    public long add(int... numbersToAdd) {
        long sum = 0;
        for (int i = 0; i < numbersToAdd.length; i++) {
            sum = sum + numbersToAdd[i];

        }
        return sum;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public double add(double a, double b) {
        return format(a + b);
    }

    public long multiply(int a, int b) {
        return a * b;

    }

    public double divide(int a, int b) {
        return format((double) a / b);
    }

    protected double format(double number) {

        String format = ".";
        for (int i = 1; i <= flotingPoints; i++) {
            format = format + "#";
        }
        DecimalFormat df = new DecimalFormat(format);
        //df.setRoundingMode(RoundingMode.DOWN);
        return Double.parseDouble(df.format(number));

    }


}
