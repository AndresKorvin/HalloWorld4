package box;

public class Box {
    private double length;
    private double width;
    private double height;

    private Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box() {
        this(10, 10, 10);
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    private void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int compareVolume(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        return Double.compare(currentVolume, anotherVolume);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box copy() {
        return new Box(this);
    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }
}
