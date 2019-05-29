package creative.builder;

/**
 * @author Fang Qing
 * @date 2019/5/28 18:17
 */
public class MoBikeBuilder implements Builder {
    private Bike bike = new Bike();
    public void buildFrame() {
        bike.setFrame("橙色车架");
    }

    public void buildTire() {
        bike.setTyre("橙色轮胎");
    }

    public Bike getBike() {
        return bike;
    }
}
