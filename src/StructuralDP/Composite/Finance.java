package StructuralDP.Composite;

import java.util.Arrays;
import java.util.List;

// Departman altındaki child yapılar; Finans,Satış gibi
class Finance extends Department {
    @Override
    String getName() {
        return "Finance";
    }

    @Override
    List<String> getEmployees() {
        return Arrays.asList("F1", "F2", "F3");
    }


} // finance bitti
