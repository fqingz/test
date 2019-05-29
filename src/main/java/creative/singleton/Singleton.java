package creative.singleton;

/**
 * 单例的一些旧写法
 *
 * 现在,常用的也就"静态内部类","DCL","枚举"(需要延迟加载,前两者;需要防止序列化问题,反射攻击,使用第三者)
 * @author Fang Qing
 * @date 2019/5/28 15:31
 */
public class Singleton {

    private static Singleton instance = null;
    private Singleton(){}


    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @return Object
     */
    private Object readResolve(){
        return instance;
    }

    /**
     * 线程不安全
     * @return Singleton
     */
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton ();
        }
        return instance;
    }

    /**
     * 性能差
     * @return Singleton
     */
    public static synchronized Singleton getInstance1(){
        if(instance==null){
            instance = new Singleton ();
        }
        return instance;
    }

    /**
     * 懒汉式,双重检查
     * 其实dcl也是存在问题的（编译器允许的指令乱序执行，假如代码之间没有相互依赖的话，jvm会重排执行，就会导致产生指向了引用，但是没有实例化的情况）
     * @return Singleton
     */
    public static Singleton getInstance2(){
        if(instance==null){
            synchronized (Singleton.class) {
                if(instance==null){
                    instance = new Singleton ( );
                }
            }
        }
        return instance;
    }

}
