package structural.composite.before;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fang Qing
 * @date 2019/5/29 16:45
 */
public class Folder {
    private String name;
    private List<Folder> folderList = new ArrayList<Folder> ();
    private List<ImageFile> imageList = new ArrayList<ImageFile> ();
    private List<TextFile> textList = new ArrayList<TextFile> ();

    public Folder(String name) {
        this.name = name;
    }

    /**
     * 增加新的Folder类型的成员
     */
    public void addFolder(Folder f) {
        folderList.add(f);
    }

    /**
     * 增加新的ImageFile类型的成员
     */
    public void addImageFile(ImageFile image) {
        imageList.add(image);
    }

    /**
     * 增加新的TextFile类型的成员
     */
    public void addTextFile(TextFile text) {
        textList.add(text);
    }

    public void killVirus(){
        System.out.println("****对文件夹'" + name + "'进行杀毒");

        //如果是Folder类型的成员，递归调用Folder的killVirus()方法
        for(Object obj : folderList) {
            ((Folder)obj).killVirus();
        }

        //如果是ImageFile类型的成员，调用ImageFile的killVirus()方法
        for(Object obj : imageList) {
            ((ImageFile)obj).killVirus();
        }

        //如果是TextFile类型的成员，调用TextFile的killVirus()方法
        for(Object obj : textList) {
            ((TextFile)obj).killVirus();
        }
    }

}
