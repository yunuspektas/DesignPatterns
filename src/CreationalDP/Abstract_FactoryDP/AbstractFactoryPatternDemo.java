package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get a shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //***==> CIRCLE OBJECT
        //get an object of shape circle
        Shape shape1= shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //***==> RECTANGLE OBJECT
        //get an object of shape rectangle
        Shape shape2= shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //***==> SQUARE OBJECT
        //get an object of shape rectangle
        Shape shape3= shapeFactory.getShape("SQUARE");
        shape3.draw();

        //get a color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();

        Color color3 = colorFactory.getColor("GREEN");
        color3.fill();



    }
}
