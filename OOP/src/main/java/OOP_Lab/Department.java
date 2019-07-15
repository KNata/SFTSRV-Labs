package OOP_Lab;

import java.util.ArrayList;

public class Department {

    private ArrayList<Manager> managersList;

    private static final double COEFF = 1.3;


    public Department(ArrayList<Manager> aManagerList) {
        managersList = aManagerList;
    }

    public void assignSalaryForEmployee(String firstName, String secondName, long addSalary, int bonusToSalary) {
        Designer theDesigner = checkIfEmployeeIsDesigner(firstName, secondName);
        Developer theDeveloper = checkIfEmployeeIsDeveloper(firstName, secondName);
        if (theDesigner != null) {
            theDesigner.setSalary((long) (COEFF * addSalary));
            System.out.println("The salary was paid to " + theDesigner.getFirstName() + " " + theDesigner.getSecondName() +
                    ". The employee received $" + theDesigner.getSalary());
        } else if (theDeveloper != null && theDeveloper.getExperiance() > 2) {
            theDeveloper.setSalary(bonusToSalary + 200);
            System.out.println("The salary was paid to " + theDeveloper.getFirstName() + " " + theDeveloper.getSecondName() +
                    ". The employee received $" + theDeveloper.getSalary());
        } else if (theDeveloper != null && theDeveloper.getExperiance() > 5) {
            theDeveloper.setSalary((long) (addSalary * 1.2 + 500));
            System.out.println("The salary was paid to " + theDesigner.getFirstName() + theDesigner.getSecondName() +
                    ". The employee received $" + theDesigner.getSalary());
        } else {
            System.out.println("Developer or Designer with such name wasn't found");
        }
    }

    public void assignSalaryToManager(String firstName, String lastName, long salaryValue) {
        for (Manager manager : managersList) {
            if (manager.getFirstName().equals(firstName) && manager.getSecondName().equals(lastName)) {
                if (calculateSizeOfManagerTeam(manager) > 5) {
                    manager.setSalary(200 + salaryValue);
                    System.out.println("The salary was paid to " + manager.getFirstName() + manager.getSecondName() +
                            ". The employee received $" + manager.getSalary());
                } else if (calculateSizeOfManagerTeam(manager) > 10) {
                    manager.setSalary(300 + salaryValue);
                    System.out.println("The salary was paid to " + manager.getFirstName() + manager.getSecondName() + " " +
                            ". The employee received $" + manager.getSalary());
                } else if (isHalfOfATeamDevelopers(manager)) {
                    manager.setSalary((long) (1.1 * salaryValue));
                    System.out.println("The salary was paid to " + manager.getFirstName() + " " + manager.getSecondName() +
                            ". The employee received $" + manager.getSalary());
                } else {
                    manager.setSalary(salaryValue);
                    System.out.println("The salary was paid to " + manager.getFirstName() + " " + manager.getSecondName() +
                            ". The employee received $" + manager.getSalary());
                }
            }
        }
    }

    public void showInfoAboutAllEmployees() {
        showInfoAboutDevelopers();
        showInfoAboutDesigners();
    }

    public void showInfoAboutEmployeeByFirstAndLastName(String firstName, String lastName) {
        for(Manager manager : managersList) {
            for(int i = 0; i < manager.getDeveloperTeamList().size(); i++) {
                Developer currentDeveloper = manager.getDeveloperTeamList().get(i);
                if (currentDeveloper.getFirstName().equals(firstName) && currentDeveloper.getSecondName().equals(lastName)) {
                    System.out.println("Name: " + manager.getDeveloperTeamList().get(i).getFirstName() +
                            "Last name: " + manager.getDeveloperTeamList().get(i).getSecondName() +
                            "Experience: " + manager.getDeveloperTeamList().get(i).getExperiance() +
                            "Manager: " + manager.getFirstName() + " " + manager.getSecondName());
                }
            }
            for(int i = 0; i < manager.getDeveloperTeamList().size(); i++) {
                Designer currentDesigner = manager.getDesignerTeamList().get(i);
                if (currentDesigner.getFirstName().equals(firstName) && currentDesigner.getSecondName().equals(lastName)) {
                    System.out.println("Name: " + manager.getDesignerTeamList().get(i).getFirstName() +
                            "Last name: " + manager.getDesignerTeamList().get(i).getSecondName() +
                            "Experience: " + manager.getDesignerTeamList().get(i).getExperiance() +
                            "Manager: " + manager.getFirstName() + " " + manager.getSecondName());
                }
            }
        }
    }

    private Designer checkIfEmployeeIsDesigner(String firstName, String secondName) {
        Designer currentDesigner = null;
        for (int i = 0; i < managersList.size(); i++) {
            currentDesigner = managersList.get(i).getDesignerTeamList().get(i);
            if (!currentDesigner.getFirstName().equals(firstName) && !currentDesigner.getSecondName().equals(secondName)) {
                currentDesigner = null;
            }
        }
        return currentDesigner;
    }

    private Developer checkIfEmployeeIsDeveloper(String firstName, String secondName) {
        Developer currentDeveloper = null;
        for (int i = 0; i < managersList.size(); i++) {
            currentDeveloper = managersList.get(i).getDeveloperTeamList().get(i);
            if (!currentDeveloper.getFirstName().equals(firstName) && !currentDeveloper.getSecondName().equals(secondName)) {
                currentDeveloper = null;
            }
        }
        return currentDeveloper;
    }

    private int calculateSizeOfManagerTeam(Manager manager) {
        return (manager.getDesignerTeamList().size() + manager.getDeveloperTeamList().size());
    }

    private boolean isHalfOfATeamDevelopers(Manager manager) {
        int halfOfTeam = calculateHalfOfTheGeneralSize(manager);
        if (halfOfTeam > manager.getDeveloperTeamList().size()) {
            return true;
        } else {
            return false;
        }
    }

    private int calculateHalfOfTheGeneralSize(Manager manager) {
        return (manager.getDeveloperTeamList().size() + manager.getDesignerTeamList().size()) / 2;
    }

    private void showInfoAboutDesigners() {
        for(Manager manager : managersList) {
            for(int i = 0; i < manager.getDesignerTeamList().size(); i++) {
                System.out.println("Name: " + manager.getDesignerTeamList().get(i).getFirstName() +
                        "; Last name: " + manager.getDesignerTeamList().get(i).getSecondName() +
                        "; Experience: " + manager.getDesignerTeamList().get(i).getExperiance() +
                        "; Manager: " + manager.getFirstName() + " " + manager.getSecondName());
            }
        }
    }

    private void showInfoAboutDevelopers() {
        for(Manager manager : managersList) {
            for(int i = 0; i < manager.getDeveloperTeamList().size(); i++) {
                System.out.println("Name: " + manager.getDeveloperTeamList().get(i).getFirstName() +
                        "; Last name: " + manager.getDeveloperTeamList().get(i).getSecondName() +
                        "; Experience: " + manager.getDeveloperTeamList().get(i).getExperiance() +
                        "; Manager: " + manager.getFirstName() + " " + manager.getSecondName());
            }
        }
    }
}


