package bai_tap_nop;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Cung cấp menu xử lý chuỗi: đo độ dài, lấy ký tự theo vị trí và tìm chuỗi con.
 */
public class BaiTapJava15 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 15");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final Scanner mScan = new Scanner(in);

    // Luồng xử lý chính
    private static void run() {
        // In lời nhắc hoặc menu
        out.println();
        printAdv(GREEN, "Nhập vào chuỗi: ", RESET);
        var s = mScan.nextLine();
        // In lời nhắc hoặc menu
        out.print(CYAN);
        printlnAdv("1. In ra độ dài chuỗi                  ");
        printlnAdv("2. In ra ký tự tại một vị trí nhất định");
        printlnAdv("3. Kiểm tra chuỗi phụ trong chuỗi      ");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        // In kết quả
        switch (numLimit(1, 3)) {
            case 1: {
                unitA(s);
                break;
            }
            case 2: {
                unitB(s);
                break;
            }
            case 3: {
                unitC(s);
                break;
            }
        }
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tìm tất cả vị trí xuất hiện của chuỗi con
    private static void getAllIndexOf(List<Integer> list, String s, String str, int padding) {
        if (s.contains(str)) {
            var index = s.indexOf(str);
            list.add(index + padding);
            var startPath = index + 1;
            padding += startPath;
            getAllIndexOf(list, s.substring(startPath), str, padding);
        }
    }

    // Chức năng 1
    private static void unitA(String s) {
        printlnAdv(YELLOW, format("Độ dài chuỗi là: %d", s.length()));
    }

    // Chức năng 2
    private static void unitB(String s) {
        if (isNullOrEmpty(s)) {
            printlnAdv(YELLOW, "Chuỗi rỗng nên không có ký tự để tìm.");
            return;
        }
        // Nhập dữ liệu
        printAdv(GREEN, "Nhập vị trí ký tự cần tìm trong chuỗi: ", RESET);
        var path = numLimit(1, s.length());
        // In kết quả
        printlnAdv(YELLOW, format("Ký tự ở vị trí thứ %d trong chuỗi là: %c", path, s.charAt(path - 1)));
    }

    // Chức năng 3
    private static void unitC(String s) {
        // Nhập dữ liệu
        printAdv(GREEN, "Nhập chuỗi cần tìm: ", RESET);
        var str = mScan.nextLine();
        if (isNullOrEmpty(str)) {
            printlnAdv(YELLOW, "Chuỗi cần tìm không được để trống.");
            return;
        }
        // Xử lý dữ liệu
        var list = new ArrayList<Integer>();
        getAllIndexOf(list, s, str, 0);
        // In kết quả
        out.print(YELLOW);
        var max = list.size();
        if (max > 0) {
            var sOut = String.valueOf(list.get(0) + 1);
            for (var i = 1; i < max; i++) {
                sOut += format(", %d", list.get(i) + 1);
            }
            printlnAdv(format("Chuỗi cần tìm ở vị trí thứ %s.", sOut));
        } else {
            printlnAdv("Không tìm thấy chuỗi cần tìm.");
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
