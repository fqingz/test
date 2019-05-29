package creative.factory;

/**
 * @author Fang Qing
 * @date 2019/5/28 14:16
 */
public class SmsSenderFactory implements Provider {
    public Sender produce() {
        return new SmsSender ();
    }
}
