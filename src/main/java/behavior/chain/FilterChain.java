package behavior.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fang Qing
 * @date 2019/6/4 11:48
 */
public class FilterChain implements StudyPrepareFilter {

    private int pos = 0;

    private Study study;

    private List<StudyPrepareFilter> studyPrepareFilterList;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void addFilter(StudyPrepareFilter studyPrepareFilter) {
        if (studyPrepareFilterList == null) {
            studyPrepareFilterList = new ArrayList<> ( );
        }
        studyPrepareFilterList.add (studyPrepareFilter);
    }

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (pos == studyPrepareFilterList.size ( )) {
            study.study ( );
        } else {
            studyPrepareFilterList.get (pos++).doFilter (preparationList, filterChain);
        }
    }
}
