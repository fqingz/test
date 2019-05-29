package creative.factory;

/**
 * @author Fang Qing
 * @date 2019/5/28 11:28
 */
public class MailSender implements Sender {

    public void send() {
        System.out.println ("Send mail!" );
    }
}
