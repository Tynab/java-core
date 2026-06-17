package bai_tap_nop;

import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập n và tìm số nguyên lớn nhất nhỏ hơn log2(n).
 */
public class BaiTapJava11 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 11");
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
        printlnAdv(YELLOW, format("Số lớn nhất nhỏ hơn log2(%d) là: %d", n, maxLimLog2(n)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tìm số nguyên lớn nhất nhỏ hơn log2(n)
    private static int maxLimLog2(int n) {
        var log = log(n) / log(2); // Lưu giá trị dùng lại trong vòng lặp
        return Math.max(0, (int) Math.ceil(log) - 1);
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
