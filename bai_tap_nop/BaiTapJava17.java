package bai_tap_nop;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Tạo trò chơi đoán số ngẫu nhiên từ 1 đến 1000 và đếm số lượt đoán.
 */
public class BaiTapJava17 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 17");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int LIMIT = 1000;
    private static int mCounter;

    // Luồng xử lý chính
    private static void run() {
        // In lời nhắc hoặc menu
        out.println();
        printAdv(GREEN, "Nhập vào số dự đoán từ 1 đến 1000: ", RESET);
        // Xử lý dữ liệu
        mCounter = 0;
        guessX(new Random().nextInt(LIMIT) + 1);
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Xử lý lượt đoán
    private static void guessX(int x) {
        mCounter++;
        var n = numLimit(1, LIMIT);
        if (n < x) {
            printAdv(RED, "Nhỏ hơn số cần tìm, mời đoán lại: ", RESET);
            guessX(x);
        } else if (n > x) {
            printAdv(RED, "Lớn hơn số cần tìm, mời đoán lại: ", RESET);
            guessX(x);
        } else {
            printlnAdv(YELLOW, format("CHÍNH XÁC! Bạn đã đoán sau %d lượt.", mCounter));
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
