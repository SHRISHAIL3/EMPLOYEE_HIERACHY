# EMPLOYEE_HIERACHY
ava Interview Question Company: Supai Infotech
 Problem Description
You are given a class structure to represent employee information:

class Employee {
    String employeeId;
    String employeeName;
    String employeeDesignation;
    String managerEmployeeId;

    // Constructor and getter/setter methods
}
✅ Task 1: Create a List of Employee Objects
Use the following data to create a list of Employee objects:

Employee ID	Employee Name	Designation	Manager ID
X7F3	John Doe	CEO	NULL
POR4	Jane Smith	CTO	X7F3
K2B9	David Lee	CFO	X7F3
L8M5	Michael Brown	VP Eng	POR4
A3N6	Sarah Jones	VP Mkt	X7F3
B9Q7	Emily Davis	SE	L8M5
C5R1	James Wilson	MM	A3N6
D1S2	Christopher Martinez	SE	L8M5
E6T0	Nancy Rodriguez	MS	C5R1
F4U8	Patricia Walker	MS	C5R1

✅ Task 2: Print Employee Hierarchy
Write a function:
String getEmployeeHierarchy(String employeeId)
This function should:

Return a String displaying the hierarchy from CEO to the given employee.

Format: "Name (Designation - ID)" for each employee.

Separate each employee in the hierarchy using ,.

💡 Example:
Input: B9Q7
Expected Output:
"John Doe (CEO - X7F3), Jane Smith (CTO - POR4), Michael Brown (VP Eng - L8M5), Emily Davis (SE - B9Q7)"
