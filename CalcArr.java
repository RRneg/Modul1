import java.util.Arrays;

public class CalcArr {

    CalcArr(int[] raw) {
    }

    public int uniq(int[] raw) {
        Arrays.sort(raw);
        int l = raw.length;
        int k = 0;
        if (l==1){
            k=1;
            }
        else {
                for (int j = 0; j < (l - 2); j++) {

                if (raw[j + 1] != raw[j] && raw[j + 1] != raw[j+2]) {
                    k++;
                }
            }
                if(raw[0] != raw[1]){
                    k++;
                }
            if (raw[l-1] != raw[l-2]){
                k++;
            }
        }

        return k;
    }

}

