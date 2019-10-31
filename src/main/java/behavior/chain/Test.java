package behavior.chain;

/**
 * 责任链模式
 *
 * 链上的每个对象都持有下一个对象的引用
 *
 * 实现了请求发送者与请求处理者之间的松耦合
 * 可动态添加责任对象、删除责任对象、改变责任对象顺序，非常灵活
 * 每个责任对象专注于做自己的事情，职责明确
 *
 * @author Fang Qing
 * @date 2019/6/4 10:53
 */
public class Test {

    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList ();
        preparationList.setWashFace (true);
        preparationList.setWashHail (true);

        FilterChain filterChain = new FilterChain (new Study ());
        filterChain.addFilter (new WashFaceFilter ());
        filterChain.addFilter (new WashHailFilter ());
        filterChain.doFilter (preparationList, filterChain);
    }
}
