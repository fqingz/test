package creative.builder;

/**
 * 建造者模式
 * 是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 创建者模式隐藏了复杂对象的创建过程，它把复杂对象的创建过程加以抽象，通过子类继承或者重载的方式，动态的创建具有复合属性的对象。
 *
 * 方便用户创建复杂的对象（不需要知道实现过程）
 * 代码复用性 & 封装性（将对象构建过程和细节进行封装 & 复用）
 * @author Fang Qing
 * @date 2019/5/28 17:12
 */
public interface Builder {
    void buildFrame();
    void buildTire();
    Bike getBike();
}
