
import java.util.Scanner;

public class Test_SOFDE {
    public static void main(String[] args){
    double a11, a12, b1, a21, a22, b2;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the equation: ");
        System.out.print("a11 = ");
    a11 = scanner.nextDouble();
        System.out.print("a12 = ");
    a12 = scanner.nextDouble();
        System.out.print("b1 = ");
    b1 = scanner.nextDouble();
        System.out.print("a21 = ");
    a21 = scanner.nextDouble();
        System.out.print("a22 = ");
    a22 = scanner.nextDouble();
        System.out.print("b2 = ");
    b2 = scanner.nextDouble();
        SystemOfFirstDegreeEquations eq = new SystemOfFirstDegreeEquations(a11,a12,b1,a21,a22,b2);
    System.out.println(eq.resolve());
    }
}


