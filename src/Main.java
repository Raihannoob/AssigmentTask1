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

    public  void showPermanentEmployeeBonusList() {
        for (PermanentEmp permanentEmp : permanentEmpList) {
            System.out.println("Employee ID: " + permanentEmp.getId() + " " + "Employee Name : "+ permanentEmp.getName() + " " +"Employee Bonus : " + permanentEmp.getBonus());
        }
    }
    public  void showPermanentEmployeeFundList() {
        for (PermanentEmp permanentEmp : permanentEmpList) {
            System.out.println("Employee ID: " + permanentEmp.getId() + " " + "Employee Name : "+ permanentEmp.getName() + " " + "Employee is eligible for Provident Fund :" + permanentEmp.isEligibleForProvidentfund());
        }
    }
    public  void showContractualEmployeeBonusList() {
        for (ContractualEmp contractualEmp : contractualEmpList) {
            System.out.println("Employee ID: "+ contractualEmp.getId() + " "  + "Employee Name : "+ contractualEmp.getName() + " " + "Employee Bonus: "+ contractualEmp.getBonus());
        }
    }
    public  void showContractualEmployeeFundList() {
        for (ContractualEmp contractualEmp : contractualEmpList) {
            System.out.println("Employee ID: "+ contractualEmp.getId() + " "  + "Employee Name : "+ contractualEmp.getName() + " " + "Employee is eligible for Provident Fund :"+ contractualEmp.isEligibleForProvidentfund());
        }
    }

    public  void showTemporaryEmployeeBonusList() {
        for (TemporaryEmp temporaryEmp : temporaryEmpList) {
            System.out.println("Employee ID: " + temporaryEmp.getId() + " "  + "Employee Name : "+ temporaryEmp.getName() + " " +"Employee Bonus : " + temporaryEmp.getBonus());
        }
    }
    public  void showTemporaryEmployeeFundList() {
        for (TemporaryEmp temporaryEmp : temporaryEmpList) {
            System.out.println("Employee ID: " + temporaryEmp.getId() + " "  + "Employee Name : "+ temporaryEmp.getName() + " " + "Employee is eligible for Provident Fund :"+temporaryEmp.isEligibleForProvidentfund());
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        System.out.println("How Many Permanent Employees You want to Insert :");
        int inputPermanentEmployeeNumbers = scan.nextInt();
        System.out.println("How Many Temporary Employees You want to Insert :");
        int inputTemporaryEmployeeNumbers = scan.nextInt();
        System.out.println("How Many Contractual Employees You want to Insert :");
        int inputContractualEmployeeNumbers = scan.nextInt();
        int permanentEmpCount = 0;
        int temporaryEmpCount = 0;
        int contractualEmpCount = 0;
        if(inputPermanentEmployeeNumbers > 0) {
            while (inputPermanentEmployeeNumbers>0){
                PermanentEmp permanentEmp1 = main.takePermanentEmployeeInput();
                main.addPermanentEmp(permanentEmp1);
                inputPermanentEmployeeNumbers-=1;
                permanentEmpCount += 1;
            }
        }
        if(inputTemporaryEmployeeNumbers > 0){
            while (inputTemporaryEmployeeNumbers > 0){
                TemporaryEmp temporaryEmp1 = main.takeTemporaryEmployeeInput();
                main.addTemporaryEmp(temporaryEmp1);
                inputTemporaryEmployeeNumbers -=1;
                temporaryEmpCount +=1;
            }

        }
        if(inputContractualEmployeeNumbers > 0){
            while (inputContractualEmployeeNumbers >0){
                ContractualEmp contractualEmp1 = main.takeContractualEmployeeInput();
                main.addContractualEmp(contractualEmp1);
                inputContractualEmployeeNumbers -=1;
                contractualEmpCount +=1;
            }

        }
        if(permanentEmpCount > 0 ){
            main.showPermanentEmployeeBonusList();
        }
        if(temporaryEmpCount > 0 ){
            main.showTemporaryEmployeeBonusList();

        }
        if(contractualEmpCount > 0){
            main.showContractualEmployeeBonusList();
        }


        if(permanentEmpCount > 0 ){
            main.showPermanentEmployeeFundList();
        }
        if(temporaryEmpCount > 0 ){
            main.showTemporaryEmployeeFundList();
        }
        if(contractualEmpCount > 0){
            main.showContractualEmployeeFundList();
        }


    }

}