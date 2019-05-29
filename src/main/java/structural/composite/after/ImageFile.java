package structural.composite.after;

/**
 * @author Fang Qing
 * @date 2019/5/29 17:02
 */
public class ImageFile extends AbstractComponent {
    ImageFile(String name) {
        super (name);
    }

    @Override
    public void killVirus() {
        System.out.println("----对图像文件'" + getName () + "'进行杀毒");
    }
}
