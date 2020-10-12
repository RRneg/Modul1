import java.util.Arrays;

public class CalcArr {
    int[] raw;

    CalcArr(int[] raw) {
        this.raw = raw;
    }

    public int uniq(int[] raw) {
        Arrays.sort(raw);
        int l = raw.length;
        int k = 0;
        if (l == 1) {
            k = 1;
        } else {
            for (int j = 0; j < (l - 1); j++) {

                if (raw[j + 1] != raw[j]) {
                    k++;
                }
            }
            if (raw[l - 1] != raw[l - 2]) {
                k++;
            }
        }




        return k;
    }

}

