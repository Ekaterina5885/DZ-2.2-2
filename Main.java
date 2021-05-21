public class Main {
    public static void main(String[] args) {
        BmiService count = new BmiService();
        double weight = 65;
        double height = 1.65;
        double bmi = count.calculate(weight, height);
        System.out.println(bmi);
    }
}