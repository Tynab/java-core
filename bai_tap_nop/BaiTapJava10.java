package bai_tap_nop;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập n và tính tổng các số nguyên từ 1 đến n bằng công thức số học.
 */
public class BaiTapJava10 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 10");
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
        printlnAdv(YELLOW, format("Tổng các số từ 1 đến %d là: %d", n, sumLim(n)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tính tổng từ 1 đến n
    private static long sumLim(int n) {
        return (long) n * (n + 1) / 2;
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
