public class Area {
    int[] area;


    public Area(int[] area) {
        this.area = area;
    }

    public float arOfTrian(int[] area) {
        float s;
        s = (float) (((area[2] - area[0]) * (area[5] - area[1]) - (area[4] - area[0])) / 2);
        return (float) Math.abs(s);
    }

}
