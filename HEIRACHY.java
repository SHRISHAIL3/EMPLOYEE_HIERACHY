import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class HEIRACHY {
    static String getHierarchy(Employee e) {
        List<String> result = new ArrayList<>();
        while (e != null) {
            result.add(0, e.ename + "(" + e.edes + "-" + e.EmployeeId + ")");
            e = Main.employeeMap.get(e.meid);
        }

        return String.join(",", result);




    }
}


