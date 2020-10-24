import java.util.Scanner;

public class TasksNext {
    public static void main(String[] args) {

//Task 5 Create a program that prints integers from 1 to 100
        for(int i=1 ;i<=100; i++){
            System.out.println(i);
        }
//Task 6 Create a program that prints integers from 100 to 1
        for(int i=100 ;i>0; i--){
            System.out.println(i);
        }
//Task 7 Create a program that prints all even numbers from 2 to 100
        System.out.println("Task 7");
        for(int i=1 ;i<=100; i++){
            if(i%2==0)
            System.out.println(i);
        }
//Task 8s
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        System.out.println("result");
        Numbers.printCounts(first,second);
    }
}
class Numbers{
    public static void printCounts(int firstNumber, int secondNumber){
        for(firstNumber++;firstNumber<secondNumber;firstNumber++){
            System.out.println(firstNumber);
        }
    }
}
