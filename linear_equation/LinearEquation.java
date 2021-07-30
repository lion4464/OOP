package linear_equation;

public class LinearEquation {
    private double a,b,c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    public boolean isSolve(){
        return (a*d-b*c!=0)?true:false;
    }
    public String getX(){
        return (isSolve())?""+HisY():" Ushbu tenglama yechimga ega emas!!!";
    }
    public String getY(){
        return (isSolve())?""+HisX():" Ushbu tenglama yechimga ega emas!!!";
    }
    public double HisX(){
        return ((a*f-e*c)/(a*d-b*c)!=-0)?((a*f-e*c)/(a*d-b*c)):0;
    }
    public double HisY(){
        return (((e*d-b*f)/(a*d-b*c))!=-0)?((e*d-b*f)/(a*d-b*c)):0;
    }

}
