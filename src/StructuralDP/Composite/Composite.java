package StructuralDP.Composite;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Composite = birleştirme
// Bütün departmanlardaki çalışanları veya raporları istersem ?
public class Composite {
    abstract class Department{
        abstract String getName();
        abstract List<String> getEmployees();
        abstract Map<String, String> getReports();
    }

    class Finance extends Department {
        @Override
        String getName() {
            return "Finance";
        }

        @Override
        List<String> getEmployees() {
            return Arrays.asList("E1", "E2", "E3");
        }

        @Override
        Map<String, String> getReports() {
            // some complex logic here
            return null;
        }
    }

    class Sales extends Department {
        @Override
        String getName() {
            return "Sales";
        }

        @Override
        List<String> getEmployees() {
            return Arrays.asList("E4", "E5", "E6");
        }

        @Override
        Map<String, String> getReports() {
            // some complex logic here
            return null;
        }
    }

    class RegionalDirectorate extends Department {

        List<Department> childDepartments;

        public RegionalDirectorate(List<Department> childDepartments) {
            this.childDepartments = childDepartments;
        }

        @Override
        String getName() {
            return childDepartments.stream().map(Department::getName).collect(Collectors.joining(", "));
        }

        @Override
        List<String> getEmployees() {
            return childDepartments.stream().flatMap(d -> d.getEmployees().stream()).collect(Collectors.toList());
        }

        @Override
        Map<String, String> getReports() {
            return childDepartments.stream().flatMap(d -> d.getReports().entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }
    }

    public void CompositeDemo(){

        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department regionalDirectorate = new RegionalDirectorate(Arrays.asList(financeDepartment, salesDepartment));

        System.out.println(regionalDirectorate.getName());
        System.out.println(regionalDirectorate.getEmployees());
        System.out.println(regionalDirectorate.getReports());

    }
}
