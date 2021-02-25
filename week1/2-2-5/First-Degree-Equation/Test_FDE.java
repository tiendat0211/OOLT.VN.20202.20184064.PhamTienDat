import java.util.Scanner;

public class Test_FDE {
    public static void main(String[] args){
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the equation: ");
        System.out.print("a =  ");
        a =scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        FirstDegreeEquation eq= new FirstDegreeEquation(a,b);
       System.out.println(eq.resolve(a,b));
    }
}
