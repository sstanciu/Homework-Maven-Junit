public class ExpertCalculator extends BasicCalculator {
    public ExpertCalculator(int floatingpoints) {
        super(floatingpoints);
    }

    public long power(int a, int n) {
        long pow = 1;
        for (int i = 1; i <= n; i++) {
            pow = pow * a;
        }
        return pow;

    }


    public double sqrt(int a) {
        return format(Math.sqrt(a));

    }

    public long fact(int n) {
        long facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }


}

