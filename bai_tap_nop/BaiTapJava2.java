package bai_tap_nop;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Chuyển đổi qua lại giữa số thập phân và số nhị phân với dữ liệu nhập được kiểm tra.
 */
public class BaiTapJava2 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 2");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final Scanner mScan = new Scanner(in);

    // Luồng xử lý chính
    private static void run() {
        // Hiển thị lựa chọn chuyển đổi
        out.println(CYAN);
        printlnAdv("1. Đổi từ cơ số 10 sang nhị phân ");
        printlnAdv("2. Đổi từ nhị phân sang cơ số 10");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        if (numLimit(1, 2) == 1) {
            decToBin();
        } else {
            binToDec();
        }
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Nhập và kiểm tra số nhị phân
    private static String scanBin() {
        var s = mScan.nextLine();
        if (isNullOrEmpty(s)) {
            printAdv(RED, "Số nhị phân không được để trống, xin nhập lại: ", RESET);
            return scanBin();
        }
        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c != '1' && c != '0') {
                printAdv(RED, "Dữ liệu nhập vào không phải số nhị phân, xin nhập lại: ", RESET);
                s = scanBin();
                break;
            }
        }
        return s;
    }

    // Đổi số thập phân sang nhị phân
    private static void decToBin() {
        // Nhập dữ liệu
        printAdv(GREEN, "Nhập vào số nguyên dương: ", RESET);
        // In kết quả
        printlnAdv(YELLOW, format("Số nhị phân được đổi là: %s", binConvertor(numLimit(1, MAX_VALUE))));
    }

    // Chuyển số nguyên sang chuỗi nhị phân
    private static String binConvertor(int n) {
        var s = "";
        while (n > 0) {
            s += String.valueOf(n % 2);
            n /= 2;
        }
        return new StringBuilder(s).reverse().toString();
    }

    // Đổi số nhị phân sang thập phân
    private static void binToDec() {
        // Nhập dữ liệu
        printAdv(GREEN, "Nhập vào số nhị phân: ", RESET);
        // In kết quả
        printlnAdv(YELLOW, format("Số thập phân được đổi là: %s", decConvertor(scanBin())));
    }

    // Chuyển chuỗi nhị phân sang số thập phân
    private static int decConvertor(String s) {
        var sum = 0;
        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (tryParseInt(c)) {
                sum += parseIntAdv(c) * pow(2, (s.length() - 1 - i));
            }
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
