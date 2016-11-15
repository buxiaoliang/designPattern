package template;

/**
 * Created by bu on 11/15/2016.
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
