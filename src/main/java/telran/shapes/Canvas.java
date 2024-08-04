package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
    Shape[] shapes;
    public Canvas() {
        shapes = new Shape[0];
    }
    public void addShape(Shape shape) {
        /*Shape[] newShapes = new Shape[shapes.length + 1];
        System.arraycopy(shapes, 0, newShapes, 0, shapes.length);
        newShapes[shapes.length]=shape;
        shapes = newShapes;*/
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }
        @Override
        public int perimiter() {
            int newPerimiter = 0;

            for(Shape j : shapes) {
                newPerimiter += + j.perimiter();
            }
            return newPerimiter;
            // TODO 
            //sum of all included shape perimiters 
        }

        @Override
        public int area() {
            int newArea = 0;
            for(Shape j : shapes) {
                newArea += j.area();
            }
            return newArea;
            // TODO 
            //sum of all included shape squares
        }

}
