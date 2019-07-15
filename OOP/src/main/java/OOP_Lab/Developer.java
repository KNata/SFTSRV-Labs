package OOP_Lab;

public class Developer extends Employee {

    private boolean hasHigherManager;

    public Developer(String aFirstName, String aSecondName, int anExperiance, boolean higherManager) {
        super(aFirstName, aSecondName, anExperiance);
        hasHigherManager = higherManager;
    }

    public boolean isHasHigherManager() {
        return hasHigherManager;
    }

    public void setHasHigherManager(boolean hasHigherManager) {
        this.hasHigherManager = hasHigherManager;
    }
}
