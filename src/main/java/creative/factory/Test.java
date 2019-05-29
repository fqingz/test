package creative.factory;

/**
 * @author Fang Qing
 * @date 2019/5/28 11:32
 */
public class Test {

    public static void main(String[] args) {
        // 工厂方法模式（Factory Method）
        // 普通工厂模式
        SendFactory factory = new SendFactory ();
        Sender sender = factory.produce ("sms");
        sender.send ();
        // 多个工厂方法模式
        Sender sender1 = factory.produceMail ();
        sender1.send ();
        // 静态工厂方法模式
        Sender sender2 = SendFactory.produceSms ();
        sender2.send ();

        // 抽象工厂模式（Abstract Factory）
        Provider provider = new SmsSenderFactory ();
        Sender sender3 = provider.produce ();
        sender3.send ();
    }
}
