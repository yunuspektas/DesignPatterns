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
// Departman altındaki child yapılar; Finans,Satış gibi
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
    } // finance bitti

    // ==> Satış departmanı
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
    } // Satış bitti

    // Departmanın bağlı oldugu BölgeGenelDertman gibi bir yapı oluşturuyoruz
    class RegionalDirectorate extends Department {

        List<Department> childDepartments;

     // childDepartments ları parametre olarak alan constructor yapıyoruz
        public RegionalDirectorate(List<Department> childDepartments) {
            this.childDepartments = childDepartments;
        }

        @Override
        String getName() {
            // joining--> akışdaki ifadeleri birleştirip String döndürüyor
            return childDepartments.stream().map(Department::getName).collect(Collectors.joining(", "));
        }

        @Override
        List<String> getEmployees() {
            //Flatmap : Stream’i başka bir stream’e çevirmek için kullanılır.
            // Bir giren değere karşılık birden fazla değer olabilir.
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
