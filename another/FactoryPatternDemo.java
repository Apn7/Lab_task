public class FactoryPatternDemo {
    public interface Shape {
        void draw();
    }
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}

