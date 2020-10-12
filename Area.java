public class Area {
    double[] area;


    public Area(double[] area) {
        this.area = area;
    }

    public double arOfTrian(double[] area) {
        double s;
        System.out.println("k =  " + k);
        s = ((area[2] - area[0]) * (area[5] - area[1]) - (area[4] - area[0]) * (area[3] - area[1])) / 2;
        return Math.abs(s);
    }

}
