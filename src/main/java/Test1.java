public class Test1 {
    public static void main (String[] args) {
        BasicCalculator calculator = new BasicCalculator(2);
        long sum4 = calculator.add(4, 2, 3);

        long sum = calculator.add(new int[]{4, 2, 3});
        long sum2 = calculator.add(25L, 45L);
        double sum3 = calculator.add(2.10, 1.37);
        long result = calculator.multiply(2, 3);
        double div = calculator.divide(5,3);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(result);
        System.out.println(sum4);
        System.out.println(div);

        ExpertCalculator calculator1 = new ExpertCalculator(2);
        long pow = calculator1.power(2, 3);
        double sqrt = calculator1.sqrt(9);
        long fact = calculator1.fact(3);

        System.out.println(pow);
        System.out.println(sqrt);
        System.out.println(fact);
    }
}