abstract class GeometricObject {
    protected String color;
    protected boolean filled;

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public abstract String getColor();

    public abstract boolean isFilled();
}
