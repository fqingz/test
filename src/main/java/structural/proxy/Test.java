package structural.proxy;

/**
 * 代理模式
 *
 * 多一个代理类出来，替原对象进行一些操作，不用直接操作原对象
 *
 * 可以将功能划分的更加清晰，有助于后期维护！
 *
 * 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 *
 * 代理模式使用到极致开发就是AOP
 *
 * @author Fang Qing
 * @date 2019/5/29 11:03
 */
public class Test {

    public static void main(String[] args) {
        Sourceable source = new Proxy ();
        source.method ();
    }
}
