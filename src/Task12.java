import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        System.out.println("result");
        System.out.println(getDaysInMonth(first,second));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        else if((year%400==0||(year%4==0&year%100!=0))) {
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if ((month<1||month>12)||(year<1||year>9999)){
            return -1;
        }
        else{
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return isLeapYear(year)?29:28;
                default:
                    return 30;
            }
        }
    }

}

