package bai_tap_nop;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập mảng số nguyên và in mảng mới sau khi loại bỏ các giá trị trùng lặp.
 */
public class BaiTapJava14 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 14");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào số phần tử mảng: ", RESET);
        var n = numLimit(1, MAX_VALUE); // Lưu giá trị dùng lại trong vòng lặp
        var list = new ArrayList<Integer>();
        var s = "";
        for (var i = 0; i < n; i++) {
            printAdv(GREEN, format("Nhập phần tử thứ %d: ", i + 1), RESET);
            var x = scanInt();
            if (!list.contains(x)) {
                list.add(x);
                s += format(", %d", x);
            }
        }
        // In kết quả
        printlnAdv(YELLOW, format("Mảng kết quả là: %s", s.substring(2)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
