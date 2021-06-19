 class Employee {

    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance;
    double hra;
    double salary;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
        this.specialAllowance=250.80;
        this.hra=1000.50;
    }

    public void calculateSalary(){
        salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
        System.out.println("The salary of "+employeeName +" : "+salary);

    }

    public void calculateTransportAllowance(){
        double transportAllowance=(10.0/100)*basicSalary;
        salary+=transportAllowance;
        System.out.println("The salary of "+employeeName +"after adding Transport allowance : "+salary);

    }
}
 class Manager extends Employee{
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance= (15.0/100)*basicSalary;
        salary+=transportAllowance;
        System.out.println("The salary of "+employeeName +"after adding Transport allowance : "+salary);
    }
}
class Trainee extends Employee{
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }
}
public class InheritanceActivity {
    public static void main(String[] args) {
        Manager mgr=new Manager(126534,"Peter","Chennai India",237844,65000);
        mgr.calculateSalary();
        mgr.calculateTransportAllowance();

        Trainee tr=new Trainee(29846,"Jack","Mumbai India",442085,45000);
        tr.calculateSalary();
        tr.calculateTransportAllowance();
    }
}


