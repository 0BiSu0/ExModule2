package ss6_ke_thua.bai_tap.lop_point2D_va_lop_point3D;

import ss6_ke_thua.bai_tap.lop_point2D_va_lop_point3D.Loppoint3D;

public class Testloppoint3D {
    public static void main(String[] args) {
        Loppoint3D point3d1 = new Loppoint3D(3,4,5);
        for (int i = 0 ; i < point3d1.getXYZ().length;i++){
            System.out.println(point3d1.getXYZ()[i]);
        }
        System.out.println(point3d1);
    }
}
