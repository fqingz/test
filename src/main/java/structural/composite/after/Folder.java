package structural.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fang Qing
 * @date 2019/5/29 16:58
 */
public class Folder extends AbstractComponent {

    private List<AbstractComponent> children = new ArrayList<AbstractComponent> ();

    Folder(String name) {
        super (name);
    }

    @Override
    public void addChild(AbstractComponent component){
        children.add (component);
    }

    @Override
    public List<AbstractComponent> getChildren(){
        return children;
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + getName () + "'进行杀毒");
        for(AbstractComponent component : getChildren ()){
            component.killVirus ();
        }
    }
}
