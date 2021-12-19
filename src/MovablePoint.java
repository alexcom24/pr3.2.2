public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public void moveUp() {
        y=y+Math.abs(ySpeed);
    }

    @Override
    public void moveDown() {
        y=y-Math.abs(ySpeed);
    }

    @Override
    public void moveLeft() {
        x=x-Math.abs(xSpeed);
    }

    @Override
    public void moveRight() {
        x=x+Math.abs(xSpeed);
    }
    public String toString() {
        return "x: "+this.x+", y: "+this.y;
    }
}
