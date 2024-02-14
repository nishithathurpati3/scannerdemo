import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month= sc.next();
        int date= sc.nextInt();
        int day=0;
        switch(month){
            case "January":
                day=date;
                break;
            case "Febrary":
                day=31+date;
                break;
            case "March":
                day=31+28+date;
                break;
            case "April":
                day=31+28+31+date;
                break;
            case "May":
                day=31+28+31+30+date;
                break;
            case "June":
                day=31+28+31+30+31+date;
                break;
            case "July":
                day=31+28+31+30+31+30+date;
                break;
            case "August":
                day=31+28+31+30+31+30+31+date;
                break;
            case "September":
                day=31+28+31+30+31+30+31+31+date;
                break;
            case "October":
                day=31+28+31+30+31+30+31+31+30+date;
                break;
            case "November":
                day=31+28+31+30+31+30+31+31+30+31+date;
                break;
            case "December":
                day=31+28+31+30+31+30+31+31+30+31+30+date;
                break;
        }
        int dayNumber= day%7;
        if(dayNumber==6 || dayNumber==0){
            System.out.println("Hurray!!");
        }
        else{
            System.out.println("Oh! It's a Workday :|");
        }

    }
}
