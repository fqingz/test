package creative.singleton;

/**
 * 因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
 * 考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
 * @author Fang Qing
 * @date 2019/5/28 16:37
 */
public class Singleton5 {

    private static Singleton5 instance = null;

    private Singleton5(){}

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new Singleton5 ();
        }
    }

    public static Singleton5 getInstance(){
        if(instance==null){
            syncInit ();
        }
        return instance;
    }
}
