package exercise_loop;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập số nguyên dương n và tính tổng biểu thức phân số theo vòng lặp.
 */
public class LoopExercise {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Loop Exercise");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // In lời nhắc hoặc menu
        out.println();
        printAdv(GREEN, "Nhập vào số nguyên dương: ", RESET);
        // In kết quả
        printlnAdv(YELLOW, format("Kết quả biểu thức là: %s", writePerfectDub(calculator(numLimit(1, MAX_VALUE)))));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tính giá trị biểu thức
    private static double calculator(int n) {
        var sum = 0d;
        for (var i = 1; i <= n; i++) {
            sum += (double) 1 / (i * (i + 1) * (i + 2));
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
