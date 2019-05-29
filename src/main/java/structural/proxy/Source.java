package structural.proxy;

/**
 * @author Fang Qing
 * @date 2019/5/29 11:00
 */
public class Source implements Sourceable {
    public void method() {
        System.out.println ("the original method" );
    }
}
