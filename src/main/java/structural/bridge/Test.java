package structural.bridge;

/**
 * 桥接模式
 *
 * 把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样
 *
 * @author Fang Qing
 * @date 2019/5/29 11:26
 */
public class Test {
    public static void main(String[] args) {
        MyBridge myBridge = new MyBridge ();
        myBridge.method ();

        myBridge.setSource (new Source1 ());
        myBridge.method ();

        myBridge.setSource (new Source2 ());
        myBridge.method ();
    }
}
