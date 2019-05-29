package structural.composite.after;

/**
 * @author Fang Qing
 * @date 2019/5/29 17:00
 */
public class TextFile extends AbstractComponent {

    TextFile(String name) {
        super (name);
    }

    @Override
    public void killVirus() {
        System.out.println("----对文本文件'" + getName () + "'进行杀毒");
    }
}
