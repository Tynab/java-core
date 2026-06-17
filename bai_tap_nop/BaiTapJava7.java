package bai_tap_nop;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập số nguyên dương và liệt kê toàn bộ ước số của số đó.
 */
public class BaiTapJava7 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 7");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào số nguyên dương: ", RESET);
        var n = numLimit(1, MAX_VALUE);
        // In kết quả
        printlnAdv(YELLOW, format("Các ước số của %d là: %s", n, divisorList(n)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Liệt kê các ước số
    private static String divisorList(int n) {
        var s = "";
        for (var i = 1; i <= n; i++) {
            if (n % i == 0) {
                s += format(", %d", i);
            }
        }
        return s.substring(2);
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
