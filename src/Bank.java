public class Bank extends AbstractCompany implements Validationable{

    private double proposedSalary;
    private int experience;
    private int expectedAge;

    public Bank(int companyOpeningDate, String department, String kindOfActivity, String name, double proposedSalary, int experience, int expectedAge) {
        super(companyOpeningDate, department, kindOfActivity, name);
        this.proposedSalary = proposedSalary;
        this.experience = experience;
        this.expectedAge = expectedAge;
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

    @Override
    public void printInfo() {
        System.out.println("Род деятельности компании: " + super.name + " является :" + super.KindOfActivity);
    }

    @Override
    public boolean validationEmployee(Employee employee) {
        double ratio = employee.getProposedSalary() *100 / proposedSalary;
        if (ratio >= 90 && ratio <= 105){
            System.out.println("Подходит");
           return true;
        }
        System.out.println("Не подходит");
        return false;
    }
}
