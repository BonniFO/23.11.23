public class Triangle extends Figure {
    public Triangle(double[] sidesLen) {
        sidesNum = 3;
        this.sidesLen = sidesLen;
    }

    @Override
    public double getS() {
        double p = getPer() / 2; // getPer возвращает double и мы его делим пополам
        return Math.sqrt( p * (p-sidesLen[0]) * (p-sidesLen[1]) * (p-sidesLen[2]) );
    }
}
