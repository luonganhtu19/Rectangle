public class InfoRectangle {
    double width, height;

    public InfoRectangle() {
    }

    public InfoRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width= " + width + ", height= " + height + "}\"";
    }

    public String toString(){
        return "Rectangle{" + "width= " + width + ", height= " + height + "}\"";
    }
}