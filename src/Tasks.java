import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        System.out.print("Podaj liczbe: ");
        int poprzedniWynik = getInt();
    //Task 4 Create a program that asks the user for a number and tells if the number is even or odd.
        if(poprzedniWynik%2==0) {
            System.out.println("number is even");
        }
            else{
            System.out.println("number is odd");
        }

        String czyKoniec;
        boolean czyBlednaOperacja;
        do {
            int nowyWynik = 0;
            czyBlednaOperacja = false;
            System.out.print("Podaj dzialanie (* / - +): ");
            String dzialanie = getString();
            System.out.print("Podaj kolejna liczbe: ");
            int drugaLiczba = getInt();

            switch (dzialanie) {
    //Task 1 Create a program that asks the user for two integers and then prints their sum.
    //Task 9 Create a sum method that calculates the sum of the numbers passed as parameters.
                case "+":
                    nowyWynik = poprzedniWynik + drugaLiczba;
                    break;
                case "-":
                    nowyWynik = poprzedniWynik - drugaLiczba;
                    break;
                case "*":
                    nowyWynik = poprzedniWynik * drugaLiczba;
                    break;
    //Task 2 Create a program that asks the user for two numbers and prints their quotient
                case "/":
                    if (drugaLiczba == 0) {
                        czyBlednaOperacja = true;
                        System.out.println("Nie moge podzielic przez 0.");

    //Task 3 Create a program that asks the user for a number and tells if the number is positive
                    } else {
                        System.out.println("number is positive");
                        nowyWynik = poprzedniWynik / drugaLiczba;
                    }
                    break;
                default:
                    czyBlednaOperacja = true;
                    System.out.println("Nieprawidlowa operacja.");
            }

            if (!czyBlednaOperacja) {
                System.out.println(
                        poprzedniWynik + " " + dzialanie + " " + drugaLiczba + " = " + nowyWynik
                );
                poprzedniWynik = nowyWynik;
            }
            System.out.println("Czy chcesz zakonczyc program? [t/n]");
            czyKoniec = getString();
        } while (!czyKoniec.equals("t"));
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
