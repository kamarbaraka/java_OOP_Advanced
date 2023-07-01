package inheritance_overload;

class ShapeTest{

    public static void main(String[] args) {
        var undefinedShape = new Shape();
        var circle = new Shape(25.0);
        var square = new Shape(4, 2.5);
        var rectangle = new Shape(4, 5.2, 4.6);
        var triangle = new Shape(3, 3.5, 4.6, 4.6);

        var undefinedShapeDetails = undefinedShape.getShapeDetails();
        var circleDetails = circle.getShapeDetails();
        var squareDetails = square.getShapeDetails();
        var rectangleDetails = rectangle.getShapeDetails();
        var triangleDetails = triangle.getShapeDetails();

        System.out.println(undefinedShapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}

public class Shape {

    private String shapeName;
    private int numberOfEdges;

    public Shape(){
        System.out.println("undefined shape created");
        this.shapeName = "undefined shape";
    }

    public Shape(double radius){
        System.out.println("created a circle");
        this.shapeName = "circle";
    }

    public Shape(int edges, double edgeLength){
        System.out.println("square shape created");
        this.numberOfEdges = edges;
        this.shapeName = "square";
    }

    public Shape(int edges, double e1, double e2){
        System.out.println("rectangle created");
        this.shapeName = "rectangle";
        this.numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("triangle created");
        this.shapeName = "triangle";
        this.numberOfEdges = edges;
    }

    public String getShapeDetails(){
        return "A %s with %s edges".formatted(this.shapeName, this.numberOfEdges);
    }
}
