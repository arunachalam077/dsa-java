import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int odd = input.nextInt();


        if (odd / 2 == 0){
            System.out.println("number is odd");
        }else{
            System.out.println("number is even");
        }
    }
}
