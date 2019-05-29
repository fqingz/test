package creative.singleton;

/**
 * 枚举
 *
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * @author Fang Qing
 * @date 2019/5/28 16:16
 */
public enum Singleton4 {
    INSTANCE;
    public void whateverMethod(){

    }
}
