public class Test {
    public static void main(String[] args) {
        MovablePoint s=new MovablePoint(2,3,4,-2);
        MovableRectangle c=new MovableRectangle(2,3,4,-2,-6,3);
        c.Speed();
        s.moveDown();
        s.moveLeft();
        c.moveRight();
        c.moveUp();
        System.out.println(s);
        System.out.println(c);
    }
}
