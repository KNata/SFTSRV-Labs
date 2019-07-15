package OOP_Lab;

public class Designer extends Employee {

    private boolean isEffective;
    private boolean hasHigherManager;

    public Designer(String aFirstName, String aSecondName, int anExperiance, boolean anEffiective,
             boolean higherManager) {
        super(aFirstName, aSecondName, anExperiance);
        isEffective = anEffiective;
        hasHigherManager = higherManager;
    }

    public boolean isEffective() {
        return isEffective;
    }

    public void setEffective(boolean effective) {
        isEffective = effective;
    }

    public boolean isHasHigherManager() {
        return hasHigherManager;
    }

    public void setHasHigherManager(boolean hasHigherManager) {
        this.hasHigherManager = hasHigherManager;
    }
}
