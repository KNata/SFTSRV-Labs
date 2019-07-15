package OOP_Lab;

public class Employee {

    private String firstName;
    private String secondName;
    private long salary;
    private int experiance;

    public Employee(String aFirstName, String aSecondName, int anExperiance) {
        firstName = aFirstName;
        secondName = aSecondName;
        experiance = anExperiance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

}
