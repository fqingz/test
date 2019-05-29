package structural.decorator;

/**
 * 装饰模式
 *
 * 给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 *
 * 装饰器模式的应用场景：
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 *
 * 缺点：产生过多相似的对象，不易排错！
 *
 * 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 *
 * 装饰模式是一个比较拘谨的模式， 在实际应用中接触比较少， 但是也有不少框架项目使用了装饰模式， 例如在JDK的java.io.*包中就大量使用装饰模式， 类似如下的代码：

 OutputStream out = new DataOutputStream（ new FileOutputStream（ "test.txt"） ）
 　　这是装饰模式的一个典型应用， 使用DataOutputStream封装了一个FileOutputStream， 以方便进行输出流处理。
 *
 * @author Fang Qing
 * @date 2019/5/29 10:56
 */
public class Test {

    public static void main(String[] args) {
        Sourceable source = new Decorator (new Source ());
        source.method ();
    }
}
