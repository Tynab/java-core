package bai_tap_nop;

import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Vẽ một hình ASCII bằng ký tự sao và dấu bằng theo kích thước cố định.
 */
public class BaiTapJava1 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 1");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int R_MAX = 15;
    private static final int C_MAX = 46;
    private static final int R_CHANGE = 10;
    private static final int C_CHANGE = 12;

    // Luồng xử lý chính
    private static void run() {
        out.println(YELLOW);
        for (var i = 1; i <= R_MAX; i++) {
            var str = "";
            if (i < R_CHANGE) {
                for (var j = 1; j <= C_MAX; j++) {
                    str += j < C_CHANGE ? (j - i) % 2 == 0 ? "*" : " " : j == C_CHANGE ? " " : "=";
                }
            } else {
                for (var j = 1; j <= C_MAX; j++) {
                    str += "=";
                }
            }
            printlnAdv(str);
        }
        out.println(RESET);
    }
}
