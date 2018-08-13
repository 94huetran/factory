package shape;

public class Rectangle implements Shape {
    private int lenght = 4;
    private int width = 9;
    private int height = 6;

    @Override
    public void draw() {
        System.out.println("This rectangle have 3 edges :" + lenght + ", " + width + ", " + height + ", ");
    }
}
