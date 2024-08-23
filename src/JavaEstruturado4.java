import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaEstruturado4 {
    public static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {

        int choice = SCAN.nextInt();
        double num1 = SCAN.nextDouble();
        double num2 = SCAN.nextDouble();

        if (choice == 1){
            System.out.println(num1 + num2);
        }
        else if (choice == 2){
            System.out.println(num1 - num2);
        }
        else if (choice == 3){
            System.out.println(num1 * num2);
        }
        else if (choice == 4){
            if (num2 == 0){
                System.out.println("DIV ZERO");
            }
            else{
                System.out.println(num1 / num2);
            }
        }
        else {
            System.out.println("OPC ERRADA");
        }
    }
}
