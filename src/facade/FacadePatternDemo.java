package facade;

/**
 * Created by bu on 11/15/2016.
 * Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
