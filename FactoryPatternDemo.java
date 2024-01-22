public interface Shape{
    void draw();
}

public static class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}

public static class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}

static class ShapeFactory{

    private static ShapeFactory ins = null;
    private ShapeFactory(){}
    public static ShapeFactory getInstance(){
        if (ins==null){
            ins = new ShapeFactory();
        }
        return ins;
    }

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


public class FactoryPatternDemo{
    public static void main(String[] args){
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}