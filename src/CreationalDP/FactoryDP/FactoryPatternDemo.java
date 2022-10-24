package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.draw();
        Square square1 = new Square();
        square1.draw();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();

        // Üretmem gereken her şeklin domain sınıfını bilmem gerekiyor,
        // peki ya bu sınıflara ihtiyaç olmadan bu sınıflar dan obje üretebilseydim

        ShapeFactory shapeFactory = new ShapeFactory(); // Factory üretimi
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // Açıklama : burada ben aracı olan Şekil üretme Fabrikasına sadece
        //            bana bir daire üret demiş oluyorum ve herhangi
        //            bir yerde new yazmama gerek kalmıyor. Circle sınıfının
        //            varlığından dahi haberim yok
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}


