package StructuralDP.Composite;

import java.util.List;
import java.util.stream.Collectors;

// Departmanın bağlı oldugu Bölge-Genel-Departman gibi bir yapı oluşturuyoruz
class RegionalDirectorate extends Department {

    List<Department> childDepartments;

    // childDepartments ları parametre olarak alan constructor yapıyoruz
    public RegionalDirectorate(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        // joining--> akışdaki ifadeleri birleştirip String döndürüyor
        return childDepartments.stream().
                map(Department::getName).
                collect(Collectors.joining(", "));
    }

    @Override
    List<String> getEmployees() {
        //Flatmap : Stream’i başka bir stream’e çevirmek için kullanılır.
        // Bir giren değere karşılık birden fazla değer olabilir.
        return childDepartments.stream().
                flatMap(d -> d.getEmployees().stream()).collect(Collectors.toList());
    }


}
