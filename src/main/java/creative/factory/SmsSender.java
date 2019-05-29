package creative.factory;

/**
 * @author Fang Qing
 * @date 2019/5/28 11:28
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println ("Send sms!" );
    }
}
