package structural.proxy;

/**
 * @author Fang Qing
 * @date 2019/5/29 11:00
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy(){
        super();
        this.source = new Source ();
    }
    public void method() {
        before();
        source.method ();
        after();
    }

    private void before() {
        System.out.println ("before12 proxy!" );
    }

    private void after() {
        System.out.println ("after proxy!" );
    }
}
