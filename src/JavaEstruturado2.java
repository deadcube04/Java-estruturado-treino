import java.util.Scanner;

public class JavaEstruturado2 {
    public static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0;
        while (true){
        double number = SCAN.nextDouble();
            if (number < 0){
                break;
            } else if (number < 5 || number > 5000) {
                ;
            }
            else {
                total+=number;
            }
        }
        System.out.println(total);
    }
}
