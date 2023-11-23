import java.util.Random;

public enum Colors {
    RED, GREEN, BLUE;

    static Colors getRandColor () {
        Random random = new Random();
        int randCol = random.nextInt(0, 3);
        return Colors.values()[randCol];
    }
}
