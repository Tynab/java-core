package exercise_if;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập một số tự nhiên và đếm số chữ số của số đó.
 */
public class IfExercise2 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("If Exercise 2");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào số tự nhiên: ", RESET);
        var n = numLimit(0, MAX_VALUE);
        // In kết quả
        printlnAdv(YELLOW, format("Số %d có %d chữ số.", n, numCounter(n)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Đếm số chữ số
    private static int numCounter(int n) {
        return String.valueOf(n).length();
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
