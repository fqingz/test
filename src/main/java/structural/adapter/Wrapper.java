package structural.adapter;

/**
 * @author Fang Qing
 * @date 2019/5/29 10:35
 */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    public void method1() {
        source.method1 ();
    }

    public void method2() {
        System.out.println ("this is the targetable method!" );
    }
}
