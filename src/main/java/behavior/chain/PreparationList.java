package behavior.chain;

/**
 * @author Fang Qing
 * @date 2019/6/4 11:35
 */
public class PreparationList {

    private boolean washFace;

    private boolean washHail;

    private boolean haveBreakfast;

    public boolean isWashFace() {
        return washFace;
    }

    public void setWashFace(boolean washFace) {
        this.washFace = washFace;
    }

    public boolean isWashHail() {
        return washHail;
    }

    public void setWashHail(boolean washHail) {
        this.washHail = washHail;
    }

    public boolean isHaveBreakfast() {
        return haveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        this.haveBreakfast = haveBreakfast;
    }

    @Override
    public String toString() {
        return "PreparationList{" +
                "washFace=" + washFace +
                ", washHail=" + washHail +
                ", haveBreakfast=" + haveBreakfast +
                '}';
    }
}
