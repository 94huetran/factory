package shape;

public class Square implements Shape {
    private int width = 8;
    private int height = 5;

    @Override
    public void draw() {
        System.out.println("This is square have width: " + width + " and height: " + height + ".");
    }
}
