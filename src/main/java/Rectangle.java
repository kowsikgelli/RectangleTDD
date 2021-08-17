public class Rectangle {
    private int length = 0;
    private int height = 0;
    public Rectangle(int length, int height) {
        if(length>0 && height>0 && length!=height){
            this.length = length;
            this.height = height;
        }else {
            throw new IllegalArgumentException("Length or Height should not be less than 1 or length!=height");
        }
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getArea() {
        return this.length*this.height;
    }

    public int getPerimeter() {
        return 2*(this.length+this.height);
    }
}
