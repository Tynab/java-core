package bai_tap_nop;

import static java.lang.Math.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Giải phương trình bậc nhất hoặc bậc hai theo lựa chọn của người dùng.
 */
public class BaiTapJava19 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 19");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // In lời nhắc hoặc menu
        out.println(CYAN);
        printlnAdv("1. Giải phương trình bậc 1");
        printlnAdv("2. Giải phương trình bậc 2");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        // In kết quả
        switch (numLimit(1, 2)) {
            case 1: {
                unitA();
                break;
            }
            case 2: {
                unitB();
                break;
            }
        }
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra hệ số a khác 0
    private static double checkA() {
        var a = scanDub();
        if (a == 0) {
            printAdv(RED, "Điều kiện a khác 0, xin nhập lại: ", RESET);
            a = checkA();
        }
        return a;
    }

    // Chức năng 1
    private static void unitA() {
        printAdv(GREEN, "a = ", RESET);
        var a = checkA();
        printAdv(GREEN, "b = ", RESET);
        var b = scanDub();
        printlnAdv(YELLOW, format("x = %s", writePerfectDub(-b / a)));
    }

    // Chức năng 2
    private static void unitB() {
        printAdv(GREEN, "a = ", RESET);
        var a = checkA();
        printAdv(GREEN, "b = ", RESET);
        var b = scanDub();
        printAdv(GREEN, "c = ", RESET);
        var c = scanDub();
        var delta = pow(b, 2) - 4 * a * c;
        out.print(YELLOW);
        if (delta > 0) {
            printlnAdv(format("x1 = %s", writePerfectDub((-b + sqrt(delta)) / (2 * a))));
            printlnAdv(format("x2 = %s", writePerfectDub((-b - sqrt(delta)) / (2 * a))));
        } else if (delta == 0) {
            printlnAdv(format("x1 = x2 = %s", writePerfectDub(-b / (2 * a))));
        } else {
            printlnAdv("Phương trình vô nghiệm.");
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
