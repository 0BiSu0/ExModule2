package ss2_Vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
            System.out.println("------Menu------");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printtherectangle();
                    break;
                case 2:
                    printthesquaretriangle();
                    break;
                case 3:
                    printisoscelestriangle();
                    break;
                case 4:
                    System.exit(0);
                default:
            }
        }
    private static void printtherectangle(){
        int height;
        int wight;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = scanner.nextInt();
        System.out.println("Enter wight: ");
        wight = scanner.nextInt();
        for (i = 1; i <= height; i++){
            for (int j = 1; j <= wight; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
    private static void printthesquaretriangle(){
        int hight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh cua tam giac: ");
        hight = scanner.nextInt();
        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    private static void printisoscelestriangle(){
        int hight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh cua tam giac: ");
        hight = scanner.nextInt();
        for (int i = hight; i >= 1; --i){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
