package bai_tap_nop;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập kích thước từ 1 đến 9 và vẽ tam giác số tương ứng.
 */
public class BaiTapJava12 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 12");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int MIN = 1;
    private static final int MAX = 9;

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, format("Nhập vào số từ %d đến %d: ", MIN, MAX), RESET);
        // In kết quả
        drawStar(numLimit(MIN, MAX));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Vẽ tam giác số
    private static void drawStar(int n) {
        out.print(YELLOW);
        for (var i = 1; i <= n; i++) {
            var s = "";
            for (var j = 1; j <= n; j++) {
                s += j <= i ? valueOf(j) : " ";
            }
            printlnAdv(s);
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
