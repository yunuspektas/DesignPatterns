package StructuralDP.DecoratorDP;
// Phone interface i implement eden Concreate
// Baz Telefon oluşturuyorum, yani temel özelliklerin olduğu telefon
public class IPhone implements Phone {

    @Override
    public String getName() {
        return "Iphone ";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 799.90;
    }
}
