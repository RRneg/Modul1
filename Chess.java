import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        int[] move = new int[4];
        System.out.println("Enter the current and next knight position (2 x two coordinates) ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            move[i] = input.nextInt();
        }
        ChessCalc chess = new ChessCalc(move);
        chess.chessCalc(move);
    }
}
