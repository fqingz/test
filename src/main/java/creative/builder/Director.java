package creative.builder;

/**
 * @author Fang Qing
 * @date 2019/5/28 18:25
 */
public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildFrame ();
        builder.buildTire ();
    }
}
