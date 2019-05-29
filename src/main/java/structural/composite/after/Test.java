package structural.composite.after;

/**
 * 组合模式（Composite Pattern）
 *
 * 又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 *
 * 系统具有更好的灵活性和可扩展性，客户端可以一致地对待文件和文件夹
 *
 * 在具体实现时，我们可以创建图形化界面让用户选择所需操作的根节点，无须修改源代码，符合“开闭原则”，客户端无须关心节点的层次结构，可以对所选节点进行统一处理，提高系统的灵活性。
 *
 * @author Fang Qing
 * @date 2019/5/29 17:03
 */
public class Test {

    public static void main(String[] args) {
        AbstractComponent folder1,folder2,folder3,image1,image2,text1,text2;

        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");

        image1 = new ImageFile("小龙女.jpg");
        image2 = new ImageFile("张无忌.gif");

        text1 = new TextFile("九阴真经.txt");
        text2 = new TextFile("葵花宝典.doc");

        folder2.addChild (image1);
        folder2.addChild(image2);
        folder3.addChild(text1);
        folder3.addChild(text2);
        folder1.addChild(folder2);
        folder1.addChild(folder3);

        folder1.killVirus();
    }
}
