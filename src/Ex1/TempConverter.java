package Ex1;

public class TempConverter {

    private int value;
    public void convertToFahr(double celsius)
    {
        celsius=(celsius*9/5)+32;
        System.out.println(celsius);
    }

    public void convertToCelsius(double fahr)
    {
        fahr = (fahr-32)*5/9;
        System.out.println(fahr);
    }

}
