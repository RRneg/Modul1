public class ChessCalc {

    public ChessCalc(int[] move) {
    }

    public void chessCalc(int[] move) {
        int gor = (int)Math.abs(move[0] - move[2]);
        int vert = (int)Math.abs(move[1] - move[3]);
        if ((gor == 1 && vert == 2) || (gor == 2 && vert == 1)) {
            System.out.println("So you can move a knight");
        } else {
            System.out.println("So you can't move a knight");
        }
    }
}
