package creative.singleton;

/**
 * 饿汉式（静态常量）
 * 不搞懒加载
 * @author Fang Qing
 * @date 2019/5/28 16:08
 */
public class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1 ();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
