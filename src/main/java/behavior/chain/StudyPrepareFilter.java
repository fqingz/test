package behavior.chain;

/**
 * @author Fang Qing
 * @date 2019/6/4 11:34
 */
public interface StudyPrepareFilter {

    void doFilter(PreparationList preparationList, FilterChain filterChain);
}
