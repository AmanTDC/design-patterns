package facadePattern;

public class ShapeMaker {
    Circle circle;
    Square square;
    Triangle triangle;
    ShapeMaker(){
        this.circle = new Circle();
        this.square = new Square();
        this.triangle = new Triangle();
    }
    void drawCircle(){
        circle.draw();
    }
    void drawSquare(){
        square.draw();
    }
    void drawTriangle(){
        triangle.draw();
    }
}
