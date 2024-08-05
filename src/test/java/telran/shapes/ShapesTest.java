package telran.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    Rectangle rectangle = new Rectangle(2, 3);
    Square square = new Square(2);

    @Test
    void rectangleTest() {
        assertEquals(10, rectangle.perimeter());
        assertEquals(6, rectangle.area());
    }

    @Test
    void sqareTest() {
        assertEquals(8, square.perimeter());
        assertEquals(4, square.area());
    }

    @Test
    void canvasTest() {
        Canvas shapes = new Canvas();
        shapes.addShape(rectangle);
        shapes.addShape(square);
        assertEquals(18, shapes.perimeter());
        assertEquals(10, shapes.area());

    }

    @Test
    void countTest() {
        Canvas shapes = new Canvas();
        Canvas shapes2 = new Canvas();
        shapes.addShape(rectangle);
        shapes.addShape(square);
        shapes.addShape(shapes2);
        shapes2.addShape(rectangle);
        shapes2.addShape(square);
        assertEquals(5, shapes.count());  
    }
}
