package OOP_Lab;

import java.util.ArrayList;

public class Manager extends Employee {

    private boolean hasHigherManager;

    private ArrayList<Developer> developerTeamList;
    private ArrayList<Designer> designerTeamList;

    public Manager(String aFirstName, String aSecondName, int anExperiance, boolean higherManager,
            ArrayList<Developer> aDeveloperTeamList, ArrayList<Designer> aDesignerTeamList) {
        super(aFirstName, aSecondName, anExperiance);
        hasHigherManager = higherManager;
        developerTeamList = aDeveloperTeamList;
        designerTeamList = aDesignerTeamList;
    }

    public boolean isHasHigherManager() {
        return hasHigherManager;
    }

    public void setHasHigherManager(boolean hasHigherManager) {
        this.hasHigherManager = hasHigherManager;
    }

    public ArrayList<Developer> getDeveloperTeamList() {
        return developerTeamList;
    }

    public void setDeveloperTeamList(ArrayList<Developer> developerTeamList) {
        this.developerTeamList = developerTeamList;
    }

    public ArrayList<Designer> getDesignerTeamList() {
        return designerTeamList;
    }

    public void setDesignerTeamList(ArrayList<Designer> designerTeamList) {
        this.designerTeamList = designerTeamList;
    }
}
