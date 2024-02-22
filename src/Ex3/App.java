package Ex3;
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int num1 = input.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int num2 = input.nextInt();
        System.out.println(Calculator.adunare(num1,num2));
        System.out.println(Calculator.scadere(num1,num2));
        System.out.println(Calculator.impartire(num1,num2));
        System.out.println(Calculator.inmultire(num1,num2));
    }

}
