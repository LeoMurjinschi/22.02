package Ex1;
import java.util.Scanner;

public class App extends TempConverter {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        double numm = input.nextDouble();
        App a = new App();
        a.convertToCelsius(numm);
        a.convertToFahr(numm);
    }
}
