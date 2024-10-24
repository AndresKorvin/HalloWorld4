package examples;

public class Rectangle {

    int length;
    int width;

    void setValue(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getSquare() {
        return this.length * this.width;
    }
}
