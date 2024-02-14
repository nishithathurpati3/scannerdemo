import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String result = name.substring(1,4).concat("a");
        String result1 = result.toUpperCase();
        System.out.println(result1);

        int index= result1.length()-1;
        while(index>=0){
            System.out.print(result1.charAt(index));
            index--;
        }


//        int index= name.length()-1;
//        while(index>=0){
//            System.out.print(name.charAt(index)+ " ");
//            index--;
//        o/p:hero----->oerh


    }
}
