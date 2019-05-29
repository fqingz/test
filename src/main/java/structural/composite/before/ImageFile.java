package structural.composite.before;

/**
 * @author Fang Qing
 * @date 2019/5/29 16:43
 */
public class ImageFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus(){
        //简化代码，模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
