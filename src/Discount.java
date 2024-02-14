import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myAge = sc.nextInt();
        int myBrotherAge = sc.nextInt();
        boolean discount;
        if (discount=(myAge<=25) && (myBrotherAge<=25)) {
            System.out.println(discount);
        }
        else{
            System.out.println("Discount is not Avaiable");
        }


    }
}

