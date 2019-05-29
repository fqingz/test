package structural.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fang Qing
 * @date 2019/5/29 16:50
 */
public abstract class AbstractComponent {

    private String name;
    private List<AbstractComponent> children = new ArrayList<AbstractComponent> ();

    AbstractComponent(String name) {
        this.name = name;
    }

    /**
     * kill virus
     */
    public abstract void killVirus();

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 透明组合模式
     *
     * 缺点是不够安全,必须有相应错误处理方法
     * 其实安全组合模式的使用频率高一点，也就是不在抽象构建类中定义这些非标准的方法，而这又使得客户端不能完全针对抽象编程
     * （Java SE中的AWT和Swing包的设计就基于组合模式）
     *
     * @param component AbstractComponent
     */
    public void addChild(AbstractComponent component) {
        System.out.println ("对不起，不支持该方法！");
    }

    List<AbstractComponent> getChildren() {
        System.out.println ("对不起，不支持该方法！");
        return null;
    }
}
