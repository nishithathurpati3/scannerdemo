import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        /*Scanner scan= new Scanner(System.in);
        System.out.println("Please enter age:");
        int age= scan.nextInt();
        System.out.println("Age is:" +age); */

        //User details
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter Firstname:");
        String firstName= scan.next();
        System.out.println("Please enter Lastname:");
        String lastName= scan.next();
        System.out.println("Please enter age:");
        int age= scan.nextInt();
        System.out.println("Please enter salary:");
        double salary= scan.nextDouble();
        System.out.println("Please enter Gender:");
        char gender= scan.next().charAt(0);
        if(age>=18){
            System.out.println("You can drive the car");
        }else{
            System.out.println("Please enroll for driving class");
        }

        System.out.println("User fullName:" + firstName+ " " +lastName);
        System.out.println("User Age:" +age);
        System.out.println("User salary:" +salary);
        System.out.println("User Gender:" +gender);
    }
}
