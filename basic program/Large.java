import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        int  finale,large,small; //decalre
        Scanner hub = new Scanner(System.in);
        System.out.println("enter the 1st no");
        int no1 = hub.nextInt();
        System.out.println("enter the 2st no");
        int no2 = hub.nextInt();
        if(no1 >no2){
            System.out.println("no1 is big");
        }else {
            System.out.println("no 2 is big");
        }

    }
}
