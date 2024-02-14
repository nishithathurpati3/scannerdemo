import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num1= sc.nextDouble();
        double num2= sc.nextDouble();
        double temp;

        temp=num2;
        num2=num1;
        num1=temp;

        System.out.println(num1);
        System.out.println(num2);



        //Type conversion from double to int

        int a= sc.nextInt();
        double b = sc.nextDouble();
        int c= a+ (int)b;

        System.out.println(c);





        //Collection of Strings in arrays

        String s[]= {"Chunky", "Thurpati","Nishitha", "Kadamanchi"};
        System.out.println(s[0] +" "+s[1]);
        System.out.println(s[2] +" "+s[3]);


    }
}
