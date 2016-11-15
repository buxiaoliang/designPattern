package bridge;

/**
 * Created by bu on 11/15/2016.
 * Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
