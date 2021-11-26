import java.util.Scanner;
public class FishMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfMackerelInKg = Double.parseDouble(scanner.nextLine());
        double priceOfEuropeanSpratInKg = Double.parseDouble(scanner.nextLine());
        double kgBonitosFish = Double.parseDouble(scanner.nextLine());
        double kgJackMackerels = Double.parseDouble(scanner.nextLine());
        int kgShellfish = Integer.parseInt(scanner.nextLine());

        double priceBonitosFishForKg = priceOfMackerelInKg * 1.60;
        double totalSumBonitosFish = priceBonitosFishForKg * kgBonitosFish;

        double priceOfJackMackerelsForKg = priceOfEuropeanSpratInKg * 1.80;
        double totalSumJackMackerels = priceOfJackMackerelsForKg * kgJackMackerels;

        double totalSumShellfish = 7.50 * kgShellfish;
        double totalSum = totalSumBonitosFish + totalSumJackMackerels + totalSumShellfish;

        System.out.printf("%.2f",totalSum);
    }
}