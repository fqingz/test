package structural.decorator;

/**
 * @author Fang Qing
 * @date 2019/5/29 10:54
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    public void method() {
        System.out.println ("before12 decorator!" );
        source.method ();
        System.out.println ("after decorator!" );
    }
}
