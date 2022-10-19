package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        String[] arr = {"1","5","11","23","99"};
        System.out.println("Mảng ban đầu: \n" + Arrays.toString(arr));
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList chứa mảng: \n" + testList);
        testList.remove("5");
        arr = testList.toArray(new String[0]);
        System.out.println("Mảng có kết quả: \n" + Arrays.toString(arr));
    }
}
