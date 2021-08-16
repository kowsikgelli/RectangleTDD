public class Rectangle {
    private int length = 0;
    private int height = 0;
    public Rectangle(int length, int height) {
        if(length>0 && height>0){
            this.length = length;
            this.height = height;
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
}
