package date0408.attendancerecord;

public class Employee extends Person {
    private String department;
    static int employeecount =0;
    public Employee(String name,int id, String department){
        super(name,id);
        this.department=department;
        employeecount++;
    }
    public static void showEmployeeCount(){
        System.out.println("total employee count"+employeecount);
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void showDetails() {
        {
            System.out.println("name:"+getName());
            System.out.println("id:"+getId());
            System.out.println("department"+getDepartment());
        }
    }
    
}
