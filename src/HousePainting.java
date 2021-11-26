import java.util.Scanner;
public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heightOfHouse = Double.parseDouble(scanner.nextLine());
        double lengthOfSideWall = Double.parseDouble(scanner.nextLine());
        double heightOfRoof = Double.parseDouble(scanner.nextLine());

        double sideWallArea = heightOfHouse * lengthOfSideWall;
        double sizeOfWindow = 1.5 * 1.5;
        double areaOfTwoSideWalls =  sideWallArea * 2 - sizeOfWindow * 2;
        double sizeOfFrontAndBackYardWall = heightOfHouse * heightOfHouse;

        double sizeOfTheDoor = 1.2 * 2;
        double totalSizeOfFrontAndBackYardWallWithoutDoor = 2 * sizeOfFrontAndBackYardWall - sizeOfTheDoor;

        double totalAreaOfHouse = areaOfTwoSideWalls + totalSizeOfFrontAndBackYardWallWithoutDoor;
        double litersGreenPaintToPaintFirstLevelOfHouse = totalAreaOfHouse / 3.4;

        double sizeOfRoofTwoRectangleWalls = 2 * (heightOfHouse * lengthOfSideWall);
        double sizeOfFrontAndBackYardSidesOfRoof = 2 * ((heightOfRoof * heightOfHouse) / 2);

        double totalAreaOfRoof =  sizeOfRoofTwoRectangleWalls + sizeOfFrontAndBackYardSidesOfRoof;
        double litersRedPaintToPaintRoof =  totalAreaOfRoof / 4.3;
        System.out.printf("%.2f\n%.2f",litersGreenPaintToPaintFirstLevelOfHouse,litersRedPaintToPaintRoof);
    }
}