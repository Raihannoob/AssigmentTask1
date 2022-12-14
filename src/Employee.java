public class Employee {
    public int id;
    public String  name;
    public int salary;
    public int bonus;
    public boolean isEligibleForProvidentfund;

    public Employee() {
    }
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public boolean isEligibleForProvidentfund() {
        return isEligibleForProvidentfund;
    }

    public void setEligibleForProvidentfund(boolean eligibleForProvidentfund) {
        isEligibleForProvidentfund = eligibleForProvidentfund;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
