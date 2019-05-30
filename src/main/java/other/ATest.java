package other;

/**
 * @author Fang Qing
 * @date 2019/5/24 17:50
 */
public class ATest {

    public static int i = print(1);
    public int j;

    static int print(int i){
        System.out.println (i );
        return i;
    }

    ATest() {
        System.out.println ("j=2" );
        this.j = 2;
    }


    public static void main(String[] args) {
        ATest a = new ATest ();
    }
}
