package bai_tap_nop;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập một chuỗi và in ra chuỗi đảo ngược.
 */
public class BaiTapJava6 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 6");
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
        // In kết quả
        printlnAdv(YELLOW, format("Chuỗi đảo ngược là: %s", new StringBuilder(mScan.nextLine()).reverse().toString()));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
