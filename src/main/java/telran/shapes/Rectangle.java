package telran.shapes;

public class Rectangle implements Shape {
    private int width;
    private int height;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int perimeter() {
        return 2 * (width + height);
    }

    @Override
    public int area() {
        return width * height;
    }

}
