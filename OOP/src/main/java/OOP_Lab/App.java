package OOP_Lab;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        Designer firstDesigner = new Designer("Natalia", "Kiselyk", 2,
                true, false);
        Designer secondDesigner = new Designer("Olexii", "Ivanov", 1,
                true, true);
        Developer firstDev = new Developer("Andrii", "Tanchun",  3,
                true);
        Developer secondDev = new Developer("Svitlana", "Trump",  3,
                true);

        ArrayList<Designer> designerList = new ArrayList<Designer>();
        designerList.add(firstDesigner);
        designerList.add(secondDesigner);

        ArrayList<Developer> developerList = new ArrayList<Developer>();
        developerList.add(firstDev);
        developerList.add(secondDev);

        Manager mainManager = new Manager("Olena", "Petrenko", 7,
                true, developerList, designerList);

        ArrayList<Manager> managerList = new ArrayList<Manager>();
        managerList.add(mainManager);
        Department theDepartment = new Department(managerList);

        theDepartment.showInfoAboutAllEmployees();
        System.out.println();
        theDepartment.assignSalaryForEmployee("Natalia", "Kiselyk", 345, 7);
        theDepartment.assignSalaryForEmployee("Andrii", "Tanchun", 400, 2);
        System.out.println();
        theDepartment.assignSalaryToManager("Olena", "Petrenko", 566);


    }
}
