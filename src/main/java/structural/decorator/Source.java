package structural.decorator;

/**
 * @author Fang Qing
 * @date 2019/5/29 10:54
 */
public class Source implements Sourceable {
    public void method() {
        System.out.println("the original method!");
    }
}
