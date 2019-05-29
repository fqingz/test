package structural.composite.before;

/**
 * @author Fang Qing
 * @date 2019/5/29 16:45
 */
public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus(){
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
