package structural.adapter;

/**
 * 适配器
 * <p>
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 *
 * @author Fang Qing
 * @date 2019/5/29 10:29
 */
public class Test {
    public static void main(String[] args) {
        // 不用修改Source，而Targetable接口的实现类具有Source类的功能
        System.out.println ("类适配器");
        Targetable target = new Adapter ( );
        target.method1 ( );
        target.method2 ( );

        System.out.println ("对象适配器");
        Targetable target1 = new Wrapper (new Source ( ));
        target1.method1 ( );
        target1.method2 ( );

        System.out.println ("接口适配器");
        Targetable target2 = new SourceSub ( );
        target2.method1 ( );
        target2.method2 ( );
    }
}
