public class Employee{
    private  AbstractCompany abstractCompany;

    private double proposedSalary;
    private int experience;
    private int expectedAge;

    public Employee(double proposedSalary, int experience, int expectedAge) {
        this.proposedSalary = proposedSalary;
        this.experience = experience;
        this.expectedAge = expectedAge;
    }

    public Employee() {
    }

    public double getProposedSalary() {
        return proposedSalary;
    }

    public void setProposedSalary(double proposedSalary) {
        this.proposedSalary = proposedSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExpectedAge() {
        return expectedAge;
    }

    public void setExpectedAge(int expectedAge) {
        this.expectedAge = expectedAge;
    }


}
