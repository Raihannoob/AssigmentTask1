public class TemporaryEmp extends Employee implements facility{
    Employee TempEmp = new Employee();
    public TemporaryEmp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus();
        this.isEligibleForProvidentfund = isEligibleForProvidentfund();
    }
    public int bonus(){
        return (int) (this.salary*0);
    }
    public boolean isEligibleForProvidentfund(){
        return  false;
    }
}