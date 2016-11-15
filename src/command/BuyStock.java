package command;

/**
 * Created by bu on 11/15/2016.
 * Command pattern is a data driven design pattern and falls under behavioral pattern category.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
