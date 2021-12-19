public class MovableRectangle implements Movable{
    private MovablePoint topLeft=new MovablePoint(0,0,0,0);
    private MovablePoint bottomRight=new MovablePoint(0,0,0,0);

    public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x=x1;
        this.topLeft.y=y1;
        this.bottomRight.x=x2;
        this.bottomRight.y=y2;
        this.topLeft.xSpeed=xSpeed;
        this.topLeft.ySpeed=ySpeed;
        this.bottomRight.xSpeed=xSpeed;
        this.bottomRight.ySpeed=ySpeed;
    }
    public void Speed() {
        if (bottomRight.xSpeed!= topLeft.xSpeed) bottomRight.xSpeed=topLeft.xSpeed;
        if (bottomRight.ySpeed!= topLeft.ySpeed) bottomRight.ySpeed=topLeft.ySpeed;
    }
    @Override
    public void moveUp() {
        topLeft.y=topLeft.y+Math.abs(topLeft.ySpeed);
        bottomRight.y=bottomRight.y+Math.abs(bottomRight.ySpeed);
    }

    @Override
    public void moveDown() {
        topLeft.y=topLeft.y-Math.abs(topLeft.ySpeed);
        bottomRight.y=bottomRight.y-Math.abs(bottomRight.ySpeed);
    }

    @Override
    public void moveLeft() {
        topLeft.x=topLeft.x-Math.abs(topLeft.xSpeed);
        bottomRight.x=bottomRight.x-Math.abs(bottomRight.xSpeed);
    }

    @Override
    public void moveRight() {
        topLeft.x=topLeft.x+Math.abs(topLeft.xSpeed);
        bottomRight.x=bottomRight.x+Math.abs(bottomRight.xSpeed);
    }

    public String toString() {
        return "topLeft coordinates: "+topLeft.x+",  "+topLeft.y+" .bottomRight coordinates: "+bottomRight.x+", "+bottomRight.y;
    }
}
