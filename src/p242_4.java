public class p242_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1, 10,10);
        r.show();
    }
}
class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int square() {
        return width * height;
    }
    public void show(){
        System.out.println("("+x + "," + y+")에서 크기가 "+width+"x" +height+"인 사각형");
    }
    public boolean contains(Rectangle r){

    }


}
