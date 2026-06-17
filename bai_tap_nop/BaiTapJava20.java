package bai_tap_nop;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập mảng số tự nhiên rồi tách và in riêng nhóm số chẵn, số lẻ.
 */
public class BaiTapJava20 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 20");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào số phần tử của mảng số tự nhiên: ", RESET);
        var n = numLimit(1, MAX_VALUE); // Lưu giá trị dùng lại trong vòng lặp
        var list = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            printAdv(GREEN, format("Nhập phần tử thứ %d: ", i + 1), RESET);
            list.add(numLimit(0, MAX_VALUE));
        }
        // In kết quả
        out.print(YELLOW);
        splitEO(list);
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tách số chẵn và số lẻ
    private static void splitEO(List<Integer> list) {
        // Tách dữ liệu theo điều kiện
        var sEven = "";
        var sOdd = "";
        for (var item : list) {
            if (item % 2 == 0) {
                sEven += format(", %d", item);
            } else {
                sOdd += format(", %d", item);
            }
        }
        // In nhóm chẵn
        if (sEven.length() > 2) {
            printlnAdv(format("Mảng chẵn là: %s", sEven.substring(2)));
        } else {
            printlnAdv("Mảng không có phần tử chẵn.");
        }
        // In nhóm lẻ
        if (sOdd.length() > 2) {
            printlnAdv(format("Mảng lẻ là: %s", sOdd.substring(2)));
        } else {
            printlnAdv("Mảng không có phần tử lẻ.");
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
