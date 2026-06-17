package bai_tap_nop;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập số tự nhiên và tính tổng các chữ số của số đó.
 */
public class BaiTapJava4 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 4");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào số tự nhiên: ", RESET);
        var n = numLimit(0, MAX_VALUE);
        // In kết quả
        printlnAdv(YELLOW, format("Tổng các chữ số của %d là: %d", n, sumMe(n)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tính tổng chữ số
    private static int sumMe(int n) {
        var sum = 0;
        var num = String.valueOf(n);
        for (var i = 0; i < num.length(); i++) {
            sum += parseIntAdv(num.charAt(i));
        }
        return sum;
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
