import java.util.Arrays;

public class Square extends Figure {

    Square(double sideLen){
        sidesNum = 4; // кол-во сторон
        sidesLen = new double[sidesNum];

        Arrays.fill(sidesLen, sideLen);
    }

    @Override
    public double getS() {
        return sidesLen[0]*sidesLen[0];
    }

    @Override // анотация
    public double getPer() {
        return super.getPer();
    }
}
