public class Employee {
    public String firstName;
    String EmployeeId;
    String ename;
    String edes;
    String meid;

    public Employee(String id, String name, String designation, String managerId) {
        this.EmployeeId=id;
        this.ename=name;
        this.edes=designation;
        this.meid=managerId;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getEname() {
        return ename;
    }

    public String getEdes() {
        return edes;
    }

    public String getMeid() {
        return meid;
    }



    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", ename=" + ename + ", edes=" + edes + ", meid=" + meid + "]";
    }






}
