package P9_MuhamadAkbarFebiansyah.SourcePackage;

interface Relation{
    public boolean isGreater(Object a, Object b);
    public boolean isLess(Object a, Object b);
    public boolean isEqual(Object a, Object b);
}

class Line implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }

    public boolean isGreater(Object a, Object b) {
        double aLen = ((Line) a).getLength();
        double bLen = ((Line) b).getLength();
        return aLen > bLen;
    }

    public boolean isLess(Object a, Object b) {
        double aLen = ((Line) a).getLength();
        double bLen = ((Line) b).getLength();
        return aLen < bLen;
    }

    public boolean isEqual(Object a, Object b) {
        double aLen = ((Line) a).getLength();
        double bLen = ((Line) b).getLength();
        return aLen == bLen;
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Line line2 = new Line(0, 0, 6, 8);
        Line line3 = new Line(0, 0, 3, 4);

        System.out.println("Panjang garis 1: " + line1.getLength());
        System.out.println("Panjang garis 2: " + line2.getLength());
        System.out.println("Panjang garis 3: " + line3.getLength());

        System.out.println("Garis 1 lebih panjang dari Garis 2: " + line1.isGreater(line1, line2));
        System.out.println("Garis 1 lebih pendek dari Garis 2: " + line1.isLess(line1, line2));
        System.out.println("Garis 1 sama dengan Garis 3: " + line1.isEqual(line1, line3));
    }
}
