package structural.adapter;

/**
 * @author Fang Qing
 * @date 2019/5/29 10:42
 */
public abstract class AbstractWrapper implements Targetable{

    public void method1(){
        System.out.println ("the AbstractWrapper's method1!" );
    }
}
