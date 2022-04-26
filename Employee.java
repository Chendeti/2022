public class Employee {
    int id;
    String empName;
    String domain;
    public Employee(int id,String empName,String domain) {
        this.id = id;
        this.empName = empName;
        this.domain = domain;

    }
    @Override
    public String toString() {
        return "Employee [domain=" + domain + ", empName="+ empName + ", id=" + id +"]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getdomain() {
        return domain;
    }
    public void setdomain(String domain) {
        this.domain = domain;
    }


}
class zensar{
    public static void main(String[] args) {
        Employee E = new Employee( 67711, "Vamsi", "java");
        
        E.getdomain();
    }
}    
