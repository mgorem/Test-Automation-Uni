package ch9a;

public class Employee extends Person {
    private String EmployeeId;
    private String title;

    public Employee(){
        super("Orem");
        System.out.println("In Employee default constructor");
    }
    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
