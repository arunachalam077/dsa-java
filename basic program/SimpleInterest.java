import java.util.Scanner;

//(P × R × T)/100
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);
        System.out.println("enter p");
        double p = red.nextDouble();
        System.out.println("enter r");
        double r = red.nextDouble();
        System.out.println("enter t");
        double t = red.nextDouble();
        double si = p*r*t/100;
        System.out.println("si is " +si);
    }
}
