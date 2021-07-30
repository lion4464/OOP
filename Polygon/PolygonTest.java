package Polygon;

public class PolygonTest {

    public static void main(String[] args) {
        RegularPolygon r1=new RegularPolygon();
        RegularPolygon r2=new RegularPolygon(6,10);
        RegularPolygon r3=new RegularPolygon(10,4,5.6,7.8);
        System.out.println("r1.getArea() = " + r1.getArea());
        System.out.println(r1.getN()+"(ta)*"+r1.getSide()+"(tomoni) "+"= " + r1.getPerimetr());
        System.out.println("r2.getArea() = " + r2.getArea());
        System.out.println(r2.getN()+"(ta)*"+r2.getSide()+"(tomoni) "+"= " + r2.getPerimetr());
        System.out.println("r3.getArea() = " + r3.getArea());
        System.out.println(r3.getN()+"(ta)*"+r3.getSide()+"(tomoni) "+"r3.getPerimetr() = " + r3.getPerimetr());
    }

}
