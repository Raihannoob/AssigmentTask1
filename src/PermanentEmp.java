public class PermanentEmp extends Employee implements facility {
    public PermanentEmp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus();
        this.isEligibleForProvidentfund = isEligibleForProvidentfund();
    }
    public int bonus(){
        return (int) (this.salary*0.5);
    }
    public boolean isEligibleForProvidentfund(){
        return  true;
    }


}
