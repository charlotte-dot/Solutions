import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        System.out.println("result");
        System.out.println(average(first,second));
    }
    public static int sum(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }
    public static double average(int firstNumber, int secondNumber){
        double sum=sum(firstNumber,secondNumber);
        return sum/2;
    }
}
