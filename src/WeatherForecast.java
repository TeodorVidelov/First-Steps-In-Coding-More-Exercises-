import java.util.Scanner;
public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String forecast = scanner.nextLine();

        if ("sunny".equals(forecast)){
            System.out.println("It's warm outside!");
        }
        if (!"sunny".equals(forecast)){
            System.out.println("It's cold outside!");
        }
    }
}