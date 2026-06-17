package bai_tap_nop;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Cung cấp menu thao tác trên mảng số nguyên: thống kê, lọc, thêm và xóa phần tử.
 */
public class BaiTapJava13 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 13");
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
        for (var i = 0; i < n; i++) {
            printAdv(GREEN, format("Nhập phần tử thứ %d: ", i + 1), RESET);
            list.add(scanInt());
        }
        // In lời nhắc hoặc menu
        out.print(CYAN);
        printlnAdv("1. Tính giá trị trung bình             ");
        printlnAdv("2. Tìm phần tử lớn nhất, nhỏ nhất      ");
        printlnAdv("3. Tìm phần tử âm lớn nhất, nhỏ nhất   ");
        printlnAdv("4. Tìm phần tử dương lớn nhất, nhỏ nhất");
        printlnAdv("5. In ra các phần tử chẵn, lẻ          ");
        printlnAdv("6. Thêm một phần tử theo vị trí        ");
        printlnAdv("7. Xóa một phần tử theo vị trí         ");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        // In kết quả
        switch (numLimit(1, 7)) {
            case 1: {
                unitA(list);
                break;
            }
            case 2: {
                unitB(list);
                break;
            }
            case 3: {
                unitC(list);
                break;
            }
            case 4: {
                unitD(list);
                break;
            }
            case 5: {
                unitE(list);
                break;
            }
            case 6: {
                unitF(list);
                break;
            }
            case 7: {
                unitG(list);
                break;
            }
        }
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Chức năng 1
    private static void unitA(List<Integer> list) {
        // Tính tổng
        var sum = 0;
        for (var item : list) {
            sum += item;
        }
        // In giá trị trung bình
        printlnAdv(YELLOW, format("Giá trị trung bình của mảng là: %s", writePerfectDub((double) sum / list.size())));
    }

    // Chức năng 2
    private static void unitB(List<Integer> list) {
        out.print(YELLOW);
        printlnAdv(format("Phần tử lớn nhất trong mảng là: %d", max(list)));
        printlnAdv(format("Phần tử nhỏ nhất trong mảng là: %d", min(list)));
    }

    // Chức năng 3
    private static void unitC(List<Integer> list) {
        // Lọc phần tử theo điều kiện
        var resList = new ArrayList<Integer>();
        for (var item : list) {
            if (item < 0) {
                resList.add(item);
            }
        }
        // In thông báo khi không có kết quả
        out.print(YELLOW);
        if (resList.size() > 0) {
            printlnAdv(format("Phần tử âm lớn nhất trong mảng là: %d", max(resList)));
            printlnAdv(format("Phần tử âm nhỏ nhất trong mảng là: %d", min(resList)));
        } else {
            printlnAdv("Mảng không có phần tử âm.");
        }
    }

    // Chức năng 4
    private static void unitD(List<Integer> list) {
        // Lọc phần tử theo điều kiện
        var resList = new ArrayList<Integer>();
        for (var item : list) {
            if (item > 0) {
                resList.add(item);
            }
        }
        // In thông báo khi không có kết quả
        out.print(YELLOW);
        if (resList.size() > 0) {
            printlnAdv(format("Phần tử dương lớn nhất trong mảng là: %d", max(resList)));
            printlnAdv(format("Phần tử dương nhỏ nhất trong mảng là: %d", min(resList)));
        } else {
            printlnAdv("Mảng không có phần tử dương.");
        }
    }

    // Chức năng 5
    private static void unitE(List<Integer> list) {
        // Loại bỏ phần tử trùng trước khi tách
        var shortList = new ArrayList<Integer>();
        for (var item : list) {
            if (!shortList.contains(item)) {
                shortList.add(item);
            }
        }
        // Tách dữ liệu theo điều kiện
        var sEven = "";
        var sOdd = "";
        for (var item : shortList) {
            if (item % 2 == 0) {
                sEven += format(", %d", item);
            } else {
                sOdd += format(", %d", item);
            }
        }
        out.print(YELLOW);
        // In nhóm chẵn
        if (sEven.length() > 2) {
            printlnAdv(format("Các phần tử chẵn trong mảng là: %s", sEven.substring(2)));
        } else {
            printlnAdv("Mảng không có phần tử chẵn.");
        }
        // In nhóm lẻ
        if (sOdd.length() > 2) {
            printlnAdv(format("Các phần tử lẻ trong mảng là: %s", sOdd.substring(2)));
        } else {
            printlnAdv("Mảng không có phần tử lẻ.");
        }
    }

    // Chức năng 6
    private static void unitF(List<Integer> list) {
        // Nhập dữ liệu
        printAdv(GREEN, "Nhập số muốn thêm vào mảng: ", RESET);
        var x = scanInt();
        printAdv(GREEN, "Nhập vị trí phần tử mới cần chèn trong mảng: ", RESET);
        var max = list.size();
        // Xử lý dữ liệu
        list.add(numLimit(1, max + 1) - 1, x);
        // In kết quả
        var s = String.valueOf(list.get(0));
        for (var i = 1; i <= max; i++) {
            s += format(", %d", list.get(i));
        }
        printlnAdv(YELLOW, format("Mảng mới là: %s", s));
    }

    // Chức năng 7
    private static void unitG(List<Integer> list) {
        // Nhập dữ liệu
        printAdv(GREEN, "Nhập vị trí phần tử cần xóa trong mảng: ", RESET);
        var max = list.size();
        // Cập nhật danh sách
        list.remove(numLimit(1, max) - 1);
        // In kết quả
        if (list.isEmpty()) {
            printlnAdv(YELLOW, "Mảng mới không còn phần tử nào.");
        } else {
            var s = String.valueOf(list.get(0));
            for (var i = 1; i < list.size(); i++) {
                s += format(", %d", list.get(i));
            }
            printlnAdv(YELLOW, format("Mảng mới là: %s", s));
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
