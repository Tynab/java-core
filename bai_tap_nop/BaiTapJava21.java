package bai_tap_nop;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Kiểm tra hai kangaroo có gặp nhau sau cùng một số bước nhảy nguyên hay không.
 */
public class BaiTapJava21 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 21");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(CYAN, "Nhập thông tin của kangaroo 1");
        out.println();
        printAdv(GREEN, "Vị trí (0 <= x1 < 10000): x1 = ", RESET);
        var x1 = numLimit(0, 9999);
        printAdv(GREEN, "Vận tốc (1 <= v1 <= 10000): v1 = ", RESET);
        var v1 = numLimit(1, 10000);
        printAdv(CYAN, "Nhập thông tin của kangaroo 2");
        out.println();
        printAdv(GREEN, "Vị trí (x1 < x2 < 10000): x2 = ", RESET);
        var x2 = numLimitEx(x1, 10000);
        printAdv(GREEN, "Vận tốc (1 <= v2 <= 10000): v2 = ", RESET);
        var v2 = numLimit(1, 10000);
        // In kết quả
        out.print(YELLOW);
        handle(x1, v1, x2, v2);
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Xử lý nghiệp vụ chính
    private static void handle(int x1, int v1, int x2, int v2) {
        var distance = x2 - x1;
        var speedDiff = v1 - v2;
        if (speedDiff > 0 && distance % speedDiff == 0) {
            var jumps = distance / speedDiff;
            var meetPosition = x1 + jumps * v1;
            printlnAdv("2 con kangaroo có thể gặp nhau.");
            printAdv(format("Vị trí 2 con kangaroo gặp nhau là: %d", meetPosition));
        } else {
            printlnAdv("2 con kangaroo không thể gặp nhau.");
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
