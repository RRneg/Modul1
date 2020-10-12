import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the points of the triangle");

        int[] coordinate = new int[6];
        for (int i = 0; i < 6; i = i + 2) {
            System.out.println("Enter the coordinates of the point (x , y)");
            System.out.println("Point " + ((i + 2) / 2));
            coordinate[i] = input.nextInt();
            coordinate[i + 1] = input.nextInt();
        }
        Area area = new Area(coordinate);
        System.out.println("the area of the triangle is     " + area.arOfTrian(coordinate));
    }
}
