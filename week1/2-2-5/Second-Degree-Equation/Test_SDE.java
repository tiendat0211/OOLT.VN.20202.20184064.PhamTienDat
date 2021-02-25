import java.util.Scanner;

public class Test_SDE {
    public static void main(String[] args){
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the equation: ");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();
        SecondDegreeEquation eq= new SecondDegreeEquation(a,b,c);
        System.out.println(eq.resolve());
    }
}
