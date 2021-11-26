import java.util.Scanner;
public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPriceForKg = Double.parseDouble(scanner.nextLine());
        double fruitsPriceForKg = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruit = Integer.parseInt(scanner.nextLine());

        double totalSumInBGN = vegetablesPriceForKg * totalKgVegetables + fruitsPriceForKg * totalKgFruit;
        double convertToEuro = totalSumInBGN / 1.94;
        System.out.printf("%.2f",convertToEuro);
    }
}