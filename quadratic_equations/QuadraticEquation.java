package quadratic_equations;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){
        this(0,0,0);
    }
    public  QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public  double getC(){
        return this.c;
    }
    public void setA(double a){
        this.a=a;
    }
    public void setB(double b){
        this.b=b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1(){
        return (getDiscriminant()>=0)?(-b+Math.sqrt(getDiscriminant()))/2*a:0;
    }
    public double getRoot2(){
        return (getDiscriminant()>0)?(-b-Math.sqrt(getDiscriminant()))/2*a:0;
    }

}
