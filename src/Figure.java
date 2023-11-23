public abstract class Figure { // запрещает использование обьектов

    public int sidesNum; // кол-во сторон
    public double[] sidesLen;// длина сторон
    public double getS() { // площадь
        return 0;
    }
    public double getPer(){ // периметр
        double sum = 0;
        for (double len : sidesLen) { //
            sum += len;
        }
        return sum;
    }
}
