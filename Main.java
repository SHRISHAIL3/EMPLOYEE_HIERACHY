
import java.util.*;
public class Main {
    static Map<String, Employee> employeeMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        addEmployee("X7F3", "JOHN DOE", "CEO", null);
        addEmployee("POR4", "JANE SMITH", "CTO", "X7F3");
        addEmployee("K2B9", "DAVID LEE", "CFO", "X7F3");
        addEmployee("L8M5", "MICHHAEL BROWN", "VP", "POR4");
        addEmployee("A3N6", "SARAH JOHNES", "VP", "X7F3");
        addEmployee("B9Q7", "EMILY DAVIS", "SE", "L8M5");
        addEmployee("C5R1", "JAMES WILSON", "MM", "A3N6");
        addEmployee("D1S2", "CHRISTOPHER MARTINZER", "SE", "L8M5");
        addEmployee("E6TO", "NANCY RODRIGUEZ", "MS", "C5R1");
        addEmployee("F4U8", "PATRICIA WALKER", "MS", "C5R1");

        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        Employee e = employeeMap.get(empId.toUpperCase());
        if (e != null) {
            String hierarchy = HEIRACHY.getHierarchy(e);
            System.out.println("Hierarchy: " + hierarchy);
        } else {
            System.out.println("Employee ID not found.");
        }








    }


    static void addEmployee(String id, String name, String designation, String managerId) {
        employeeMap.put(id, new Employee(id, name, designation, managerId));
    }


}





