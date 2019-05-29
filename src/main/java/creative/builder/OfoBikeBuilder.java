package creative.builder;

/**
 * @author Fang Qing
 * @date 2019/5/28 18:20
 */
public class OfoBikeBuilder implements Builder {
    private Bike bike = new Bike();
    public void buildFrame() {
        bike.setFrame("黄色车架");
    }

    public void buildTire() {
        bike.setTyre("黑色轮胎");
    }

    public Bike getBike() {
        return bike;
    }
}
