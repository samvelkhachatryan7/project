package project;

public class BatteryCommander extends Human implements Shoot {
    private int salary;
    private int experience;

    public BatteryCommander(String firstName) {
        super(firstName);

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);

    }

    @Override
    public void shoot() {
        System.out.println("efficiency 90%");
    }
}
