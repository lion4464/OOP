package Polygon;

public class RegularPolygon {
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        n=(n>0)?n:this.n;
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        side=(side>0)?side:this.side;
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimetr(){
        return this.n*this.side;
    }
    public double getArea(){
        double Area=(this.n*Math.pow(this.side,2))/(4*Math.tan(Math.PI/n));
        return Area=(Area>0)?Area:0;

    }
}
