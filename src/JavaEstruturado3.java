import java.util.Scanner;

public class JavaEstruturado3 {
    public static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {

        double num1 = SCAN.nextDouble();
        double num2 = SCAN.nextDouble();
        double num3 = SCAN.nextDouble();
        double num4 = SCAN.nextDouble();
        double num5 = SCAN.nextDouble();
        System.out.println((num1 + num2 + num3 + num4 + num5)/5);
        System.out.println(Math.pow((num1 * num2 * num3 * num4 * num5), (1.0/5.0)));
        System.out.println(5/(1/num1 + 1/num2 + 1/num3 + 1/num4 + 1/num5));
    }
}
