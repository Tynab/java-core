package exercise_if;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập ba số tự nhiên và kiểm tra dãy đang tăng, giảm hay chưa được sắp xếp.
 */
public class IfExercise1 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("If Exercise 1");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int N_MAX = 3;

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        var ns = new int[N_MAX];
        for (var i = 0; i < N_MAX; i++) {
            printAdv(GREEN, format("Nhập số tự nhiên thứ %d: ", i + 1), RESET);
            ns[i] = numLimit(0, MAX_VALUE);
        }
        // In kết quả
        printlnAdv(YELLOW, format("Kết luận: %s.", checkOrder(ns)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra dãy không giảm
    private static boolean isAscending(int... args) {
        var isSuccess = true;
        for (var i = 0; i < args.length - 1; i++) {
            if (args[i] > args[i + 1]) {
                isSuccess = false;
                break;
            }
        }
        return isSuccess;
    }

    // Kiểm tra dãy không tăng
    private static boolean isDescending(int... args) {
        var isSuccess = true;
        for (var i = 0; i < args.length - 1; i++) {
            if (args[i] < args[i + 1]) {
                isSuccess = false;
                break;
            }
        }
        return isSuccess;
    }

    // Phân loại thứ tự dãy số
    private static String checkOrder(int... args) {
        return isAscending(args) ? "xếp theo thứ tự tăng dần"
                : isDescending(args) ? "xếp theo thứ tự giảm dần" : "chưa được sắp xếp";
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
