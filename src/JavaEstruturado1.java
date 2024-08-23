import java.util.Scanner;

public class JavaEstruturado1
{
    public static int fatorial(int n){

        if (n == 0 || n == 1){
            return 1;
        }
        else{

            return n * fatorial(n-1);
        }
    }
    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        int number = SCAN.nextInt();
        if (number > 16){
            System.out.println("OVERFLOW");
        }
        else if (number < 0){
            System.out.println("MENOR QUE ZERO");
        }
        else{
            System.out.println(fatorial(number));
        }
    {

    }
    }
}
