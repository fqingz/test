package structural.adapter;

/**
 * @author Fang Qing
 * @date 2019/5/29 10:27
 */
public class Adapter extends Source implements Targetable{
    public void method2() {
        System.out.println ("this is thie targetable method!" );
    }
}
