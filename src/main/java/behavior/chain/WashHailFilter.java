package behavior.chain;

/**
 * @author Fang Qing
 * @date 2019/6/4 11:37
 */
public class WashHailFilter implements StudyPrepareFilter {
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isWashHail ()){
            System.out.println ("wash hail" );
        }
        filterChain.doFilter (preparationList,filterChain);
    }
}
