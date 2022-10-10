package ss6_ke_thua.bai_tap.lop_point_va_lop_moveablepoint;
public class TestPointandMoveablePoint {
        public static void main(String[] args) {
            LopPoint p = new LopPoint(3, 3);
            System.out.println("Point: " + p.toString());

            LopMoveablePoint mPoint = new LopMoveablePoint(10, 10, 5, 5);
            System.out.println("Movable Point (before): " + mPoint.toString());
            mPoint.move();
            System.out.println("Movable Point (after): " + mPoint.toString());
        }
    }

