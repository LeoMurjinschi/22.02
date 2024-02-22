package Ex4;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int num1 = input.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int num2 = input.nextInt();

        System.out.println(NumbersComparator.max(num1,num2));
        System.out.println(NumbersComparator.min(num1,num2));
    }
}
