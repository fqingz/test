package creative.builder;

/**
 * 建造者模式的使用场合是当创建复杂对象时，把创建对象成员和装配方法分离出来，放在建造者类中去实现，用户使用该复杂对象时，不用理会它的创建和装配过程，只关心它的表示形式
 *
 * 其实完全理解这个模式还是要一番思考的，难以搞懂的是指挥者似乎没什么存在的必要，在代码里也没体现它的作用，
 * 我们也可以把指挥者的方法放在建造者里面，但为什么没有这样做呢？
 * 我想这可能是考虑到单一责任原则，建造者只负责创建对象的各个部分，至于各个部分创建的顺序、装配方法它就不管了。
 * 还有就是当顺序要改变时，建造者可以不用改动，改动指挥者就好了，指挥者只有一个，建造者有很多，要改建造者就麻烦了。
 * @author Fang Qing
 * @date 2019/5/28 18:27
 */
public class Test {

    public static void main(String[] args) {
        Builder moBikeBuilder = new MoBikeBuilder ( );
        Director d0 = new Director (moBikeBuilder);
        d0.construct ( );
        Bike moBike = moBikeBuilder.getBike ( );

        Builder ofoBikeBuilder = new OfoBikeBuilder ();
        Director d1 = new Director (ofoBikeBuilder);
        d1.construct ();// 组装
        Bike ofoBike = ofoBikeBuilder.getBike ();


    }
}
