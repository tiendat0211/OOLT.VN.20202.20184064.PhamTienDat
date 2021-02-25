public class SystemOfFirstDegreeEquations {
    private double a11;
    private double a12;
    private double b1;
    private double a21;
    private double a22;
    private double b2;
    private double d;
    private double d1;
    private double d2;


    public SystemOfFirstDegreeEquations(double a11, double a12, double b1, double a21, double a22, double b2){
        this.a11 = a11;
        this.a12 = a12;
        this.b1 = b1;
        this.a21 = a21;
        this.a22 = a22;
        this.b2 = b2;
    }

    public double getA11(){
        return a11;
    }

    public void setA11(double a11){
        this.a11 = a11;
    }

    public double getA12(){
        return a12;
    }

    public void setA12(double a12){
        this.a12 = a12;
    }

    public double getB1(){
        return b1;
    }

    public void setB(double b1){
        this.b1 = b1;
    }

    public double getA21(){
        return a21;
    }

    public void setA21(double a21){
        this.a21 = a21;
    }

    public double getA22(){
        return a22;
    }

    public void setA22(double a22){
        this.a22 = a22;
    }

    public double getB2(){
        return b2;
    }

    public void setB2(double b2){
        this.b2 = b2;
    }
    public String resolve(){
        d = a11 * a22 - a21 * a12;
        d1 = b1 * a22 - b2 * a12;
        d2 = a11 * b2 - a21 * b1;
        if (d != 0) return ("The system has a unique solution (x1/x2) = ( " + d1/d + " ," + d2/d + " )");
        else 
        if (d1 == 0 && d2 == 0)
                return ("The system has infinitely many solutions");
                else return ("The system has no solution");
        
    }
}
