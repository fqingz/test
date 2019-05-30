package structural.bridge;

/**
 * 桥接模式
 *
 * 把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样
 *
 *
 * 策略和桥接的区别，举个栗子：
 *
 * 策略模式：我要画圆。要实心圆，我能够用solidPen来配置。画虚线圆能够用dashedPen来配置。这是strategy模式。
 *
 * 桥接模式：相同是画圆，我是在windows下来画实心圆。就用windowPen+solidPen来配置。在unix下画实心圆就用unixPen+solidPen来配置。
 * 假设要再windows下画虚线圆。就用windowsPen+dashedPen来配置，要在unix下画虚线圆，就用unixPen+dashedPen来配置。
 *
 * 画圆方法中，策略仅仅是考虑算法的替换，而桥接考虑的则是不同平台下须要调用不同的工具，接口仅仅是定义一个方法。而详细实现则由详细实现类完毕。
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
