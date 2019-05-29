package structural.flyweight;

/**
 * 享元模式（Flyweight）
 *
 * 
 * @author Fang Qing
 * @date 2019/5/29 17:59
 */
public class Test {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    private static String getRandomColor(){
        return colors[(int)(Math.random ()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

    public static void main(String[] args) {

//        double d = Math.random ();
//        System.out.println (d );
//        System.out.println (d*colors.length );
//        System.out.println ((int)(d*5) );
//        System.out.println ((int)(d) );

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle (getRandomColor ( ));
            circle.setX (getRandomX ( ));
            circle.setY (getRandomY ( ));
            circle.setRadius (100);
            circle.draw ( );
        }
    }
}
