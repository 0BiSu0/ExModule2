package ss1_Introduction_java.IntroductionJava.thuc_hanh;

import java.util.Scanner;

public class NumberOfDayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to counts days? ");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
                break;
            case 1:
                System.out.println("The month'" + month + "'has 31 days!");
                break;
            case 3:
                System.out.println(" The month" + month + "has 31 days!");
                break;
            case 5:
                System.out.println(" The month" + month + "has 31 days!");
                break;
            case 7:
                System.out.println(" The month" + month + "has 31 days!");
                break;
            case 8:
                System.out.println(" The month" + month + "has 31 days!");
                break;
            case 10:
                System.out.println(" The month" + month + "has 31 days!");
                break;
            case 12:
                System.out.println(" The month" + month + "'has 31 days!");
                break;
            case 4:
                System.out.println(" The month" + month + "'has 30 days!");
                break;
            case 6:
                System.out.println(" The month" + month + "'has 30 days!");
                break;
            case 9:
                System.out.println(" The month" + month + "'has 30 days!");
                break;
            case 11:
                System.out.println(" The month" + month + "'has 30 days!");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
