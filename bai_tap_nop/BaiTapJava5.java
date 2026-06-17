package bai_tap_nop;

import static java.lang.Math.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập tọa độ hai điểm A, B và tính độ dài đoạn thẳng AB.
 */
public class BaiTapJava5 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 5");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(CYAN, "Nhập tọa độ điểm A");
        out.println();
        printAdv(GREEN, "xA = ", RESET);
        var xA = scanInt();
        printAdv(GREEN, "yA = ", RESET);
        var yA = scanInt();
        printAdv(CYAN, "Nhập tọa độ điểm B");
        out.println();
        printAdv(GREEN, "xB = ", RESET);
        var xB = scanInt();
        printAdv(GREEN, "yB = ", RESET);
        var yB = scanInt();
        // In kết quả
        printlnAdv(YELLOW, format("Độ dài đoạn thẳng AB là: %s", writePerfectDub(length(xA, yA, xB, yB))));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tính độ dài đoạn AB
    private static double length(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
