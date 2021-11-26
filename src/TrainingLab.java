import java.util.Scanner;
public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthOfHallInMeters = Double.parseDouble(scanner.nextLine());
        double widthOfHallInMeters = Double.parseDouble(scanner.nextLine());

        double lengthOfHallInCentimeters = lengthOfHallInMeters * 100;
        double widthOfHallInCentimeters = widthOfHallInMeters * 100;
        double widthOfHallWithCorridor = widthOfHallInCentimeters - 100;

        double countOfDeskOnRow = Math.floor(widthOfHallWithCorridor / 70);
        double countOfRows = Math.floor(lengthOfHallInCentimeters / 120);

        double sumOfDesks = countOfDeskOnRow * countOfRows;
        double sumWithoutDepartmentDeskThreeDesks = sumOfDesks - 3;
        System.out.printf("%.0f",sumWithoutDepartmentDeskThreeDesks);
    }
}