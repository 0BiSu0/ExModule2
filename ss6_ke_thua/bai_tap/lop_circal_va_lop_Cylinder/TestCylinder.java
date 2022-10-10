package ss6_ke_thua.bai_tap.lop_circal_va_lop_Cylinder;
import ss6_ke_thua.bai_tap.lop_circal_va_lop_Cylinder.LopCylinder;

import java.util.Scanner;
public class TestCylinder {
    public static void main(String[] args) {
        LopCylinder s = new LopCylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("input height:");
        double height = sc.nextDouble();
        System.out.println("input radius:");
        double radius = sc.nextDouble();
        s.setHeight(height);
        s.Volume();
        s.setRadius(radius);
        System.out.println(s.toString());
    }
}
