import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the points of the triangle");

        double[] coordinate = new double[6];
        for (int i = 0; i < 6; i = i + 2) {
            System.out.println("Enter the coordinates of the point (x , y)");
            System.out.println("Point " + ((i + 2) / 2));
            coordinate[i] = input.nextDouble();
            coordinate[i + 1] = input.nextDouble();
        }
        Area area = new Area(coordinate);
        System.out.print("The area of the triangle is  " + area.arOfTrian(coordinate));
    }
}
