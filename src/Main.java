import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<PermanentEmp> permanentEmpList = new ArrayList<>();
    public  List<ContractualEmp> contractualEmpList = new ArrayList<>();
    public  List<TemporaryEmp> temporaryEmpList = new ArrayList<>();

    public  void addPermanentEmp(PermanentEmp permanentEmp){
        permanentEmpList.add(permanentEmp);
    }
    public  void addTemporaryEmp(TemporaryEmp temporaryEmp){
        temporaryEmpList.add(temporaryEmp);
    }
    public  void addContractualEmp(ContractualEmp contractualEmp){
        contractualEmpList.add(contractualEmp);
    }


    public PermanentEmp takePermanentEmployeeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Employee Name");
        String name = scan.nextLine();

        System.out.println("Enter Employee Salary");
        int salary = scan.nextInt();
        PermanentEmp newEmp = new PermanentEmp(id,name,salary);
        return  newEmp;
    }

    public  ContractualEmp takeContractualEmployeeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Employee Name");
        String name = scan.nextLine();
        System.out.println("Enter Employee Salary");
        int salary = scan.nextInt();
        ContractualEmp newEmp = new ContractualEmp(id,name,salary);
        return  newEmp;
    }
    public  TemporaryEmp takeTemporaryEmployeeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Employee Name");
        String name = scan.nextLine();
        System.out.println("Enter Employee Salary");
        int salary = scan.nextInt();
        TemporaryEmp newEmp = new TemporaryEmp(id,name,salary);
        return  newEmp;
    }

    public  void showPermanentEmployeeList() {
        for (PermanentEmp permanentEmp : permanentEmpList) {
            System.out.println("Employee ID: " + permanentEmp.getId() + " " + "Employee Name : "+ permanentEmp.getName() + " " +"Employee Bonus : " + permanentEmp.getBonus() +" " + "Employee is eligible for Provient Fund :" + permanentEmp.isEligibleForProvidentfund());
        }
    }
    public  void showContractualEmployeeList() {
        for (ContractualEmp contractualEmp : contractualEmpList) {
            System.out.println("Employee ID: "+ contractualEmp.getId() + " "  + "Employee Name : "+ contractualEmp.getName() + " " + "Employee Bonus: "+ contractualEmp.getBonus() +" "+ "Employee is eligible for Provient Fund :"+ contractualEmp.isEligibleForProvidentfund());
        }
    }
    public  void showTemporaryEmployeeList() {
        for (TemporaryEmp temporaryEmp : temporaryEmpList) {
            System.out.println("Employee ID: " + temporaryEmp.getId() + " "  + "Employee Name : "+ temporaryEmp.getName() + " " +"Employee Bonus : " + temporaryEmp.getBonus() +" "+ "Employee is eligible for Provient Fund :"+temporaryEmp.isEligibleForProvidentfund());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        PermanentEmp permanentEmp1 = main.takePermanentEmployeeInput();
        main.addPermanentEmp(permanentEmp1);

        ContractualEmp contractualEmp1 = main.takeContractualEmployeeInput();
        main.addContractualEmp(contractualEmp1);

        TemporaryEmp temporaryEmp1 = main.takeTemporaryEmployeeInput();
        main.addTemporaryEmp(temporaryEmp1);

        main.showPermanentEmployeeList();
        main.showContractualEmployeeList();
        main.showTemporaryEmployeeList();

    }

}