package shape;

public class Circle implements Shape {
    private int r;
    @Override
    public void draw() {
        System.out.println("Circle have radius: "+r);
    }
}
