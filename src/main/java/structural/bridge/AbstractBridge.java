package structural.bridge;

/**
 * @author Fang Qing
 * @date 2019/5/29 11:31
 */
public abstract class AbstractBridge {
    private Sourceable source;

    public void method(){
        if(source==null){
            System.out.println ("there is no source!" );
        } else {
            source.method ( );
        }
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
