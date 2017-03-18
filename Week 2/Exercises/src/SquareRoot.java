
public class SquareRoot {

    public static void main(String[] args) {

        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1;
        double x2;
        double D;


       // if (a == 0.0 & b == 0.0 & c == 0.0 || a == 0 && b == 0 && c!=0) {
        //    System.out.println("x1="+ "\n" + "x2=");
        //    return;
        if (a == 0 && b == 0) {
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        }
        if (a == 0.0 & b == 0.0){
            System.out.println("x1="+ "\n" + "x2=");
            return;
        }

        if (a == 0){
            x1 = c/b;
            x2 = x1;
        }

        if (a == 0 & b != 0 & c == 0) {
            x1 = 0;
            x2 = 0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            return;
        }

        // a*Math.pow(x,2) + b*x + c = 0;
        D = (Math.pow(b,2)) - (4 * c * a);
        if (D > 0){
            x1 = (-b + Math.sqrt(D)) / (2*a);
            x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("x1=" + x1 + "\n" + "x2=" + x2);
            return;
        } else if (D == 0) {
            x1 = x2 = -b / (2*a);
            System.out.println("x1=" + x1 + "\n" + "x2=" + x2);
            return;
        } else if (D < 0) {
            System.out.println("x1="+ "\n" + "x2=");
            return;
        }
    }
}
