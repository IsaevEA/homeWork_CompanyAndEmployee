public abstract class AbstractCompany {
    int companyOpeningDate;
    String department;
    String KindOfActivity;
    String name;

    public AbstractCompany(int companyOpeningDate, String department, String kindOfActivity, String name) {
        this.companyOpeningDate = companyOpeningDate;
        this.department = department;
        KindOfActivity = kindOfActivity;
        this.name = name;
    }

    public abstract void printInfo();

}
