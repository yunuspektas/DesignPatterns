package StructuralDP.Composite;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Composite = birleştirme
// Bütün departmanlardaki çalışanları veya raporları istersem ?
public class Composite {

    public void CompositeDemo(){

        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department regionalDirectorate =
                new RegionalDirectorate(Arrays.asList(financeDepartment, salesDepartment));

        System.out.println(regionalDirectorate.getName());
        System.out.println("***************");
        System.out.println(regionalDirectorate.getEmployees());

    }

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.CompositeDemo();
    }
}
