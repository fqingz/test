package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 *
 * 顺序访问聚集中的对象
 *
 * @author Fang Qing
 * @date 2019/5/30 15:38
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection ();
        Iterator it = collection.iterator ();
        while (it.hasNext ()){
            System.out.println (it.next ());
        }

        List<String> list = new ArrayList<> ();
        list.add ("AA");
        list.add ("BB");
        java.util.Iterator iterator = list.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next () );
        }
    }
}
