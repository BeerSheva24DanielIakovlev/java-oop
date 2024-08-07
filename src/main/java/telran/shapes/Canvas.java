package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
    Shape[] shapes;
    public Canvas() {
        shapes = new Shape[0];
    }
    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }
        @Override
        public int perimeter() {
            int newPerimiter = 0;

            for(Shape j : shapes) {
                newPerimiter += + j.perimeter();
            }
            return newPerimiter;
        }

        @Override
        public int area() {
            int newArea = 0;
            for(Shape j : shapes) {
                newArea += j.area();
            }
            return newArea;
        }

        public int count() {
            int totalShapes = 0;
            for (Shape shape : shapes) {
                if (shape instanceof Canvas) {
                    totalShapes += ((Canvas) shape).count();
                } 
                totalShapes ++; 
            }
            return totalShapes;    
        }
}
