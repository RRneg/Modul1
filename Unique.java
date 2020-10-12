import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {


        System.out.println("Enter the long of raw");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n < 1) {
            System.out.println("Length cannot be less than 1, Enter the long of raw ");
            n = input.nextInt();
        }
        int[] raw = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  row member number");
            raw[i] = input.nextInt();
        }
        CalcArr calc = new CalcArr(raw);
        System.out.println("the number of unique values of the members of the series   " + calc.uniq(raw));

    }
}
