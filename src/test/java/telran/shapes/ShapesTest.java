package telran.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {

    @Test
    void rectangleTest() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimiter());
        assertEquals(6, rectangle.area());
    }

    @Test
    void sqareTest() {
        Square square = new Square(2);
        assertEquals(8, square.perimiter());
        assertEquals(4, square.area());
    }

    @Test
    void canvasTest() {
        Canvas shapes = new Canvas();
        Square shape1 = new Square(5);
        Rectangle shape2 = new Rectangle(2, 1);
        shapes.addShape(shape1);
        shapes.addShape(shape2);
        assertEquals(26, shapes.perimiter());
        assertEquals(27, shapes.area());

    }
}
