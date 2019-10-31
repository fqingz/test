package behavior.chain;

/**
 * @author Fang Qing
 * @date 2019/6/4 11:37
 */
public class WashFaceFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isWashFace ()){
            System.out.println ("wash face" );
        }
        filterChain.doFilter (preparationList,filterChain);
    }
}
