package ss2_Vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class Hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        if (n <= 0){
            System.out.println("n không phải là số nguyên tố!");
        }else {
            int count = 0;
            int m = 3;
            while (count <= n){
               int mark = 1;
               int i;
               for (i = 2; i <= Math.sqrt(m); i++){
                   if(m % i == 0){
                       break;
                   }
               }
               if (mark == 1){
                   count++;
                   System.out.println();
               }
               if (count >= n){
                   break;
               }
            }
        }
    }
}

