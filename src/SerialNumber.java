import java.util.Scanner;

public class SerialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tenThousands, thousands, hundreds, tens, ones;
        int number = sc.nextInt();                                        //12345
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000 <= number && number <= 99999) {
            //WRITE YOUR CODE HERE
            tenThousands = number / 10000;
            System.out.println(tenThousands);
            thousands = ((number % 10000) / 1000);
            System.out.println(thousands);
            hundreds = ((number % 1000) / 100);
            System.out.println(hundreds);
            tens = ((number % 100) / 10);
            System.out.println(tens);
            ones = ((number % 10) / 1);
            System.out.println(ones);
        }


    }
}
