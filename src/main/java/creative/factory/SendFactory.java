package creative.factory;

/**
 * @author Fang Qing
 * @date 2019/5/28 11:30
 */
public class SendFactory {

    /**
     * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
     * @param type type
     * @return Sender
     */
    public Sender produce(String type){
        if("mail".equals (type)){
            return new MailSender ();
        }else if("sms".equals (type)){
            return new SmsSender ();
        }else {
            System.out.println ("类型错误！" );
            return null;
        }
    }

    /**
     * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法
     * @return Sender
     */
    public Sender produceMail() {
        return new MailSender ();
    }

    /**
     *静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
     * @return Sender
     */
    public static Sender produceSms(){
        return new SmsSender ();
    }
}
