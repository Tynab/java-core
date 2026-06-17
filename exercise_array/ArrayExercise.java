package exercise_array;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập 10 số tự nhiên và tìm các cặp phần tử đối xứng có cùng giá trị trong mảng.
 */
public class ArrayExercise {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Array Exercise");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int N_MAX = 10;

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
        out.print(YELLOW);
        checkMirror(ns);
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Tìm các cặp đối xứng
    private static void checkMirror(int... args) {
        // Duyệt các cặp phần tử đối xứng
        var isSuccess = false;
        var max = args.length;
        for (var i = 0; i < max / 2; i++) {
            if (args[i] == args[max - 1 - i]) {
                isSuccess = true;
                printlnAdv(format("Số %d đối xứng ở cặp vị trí %d và %d.", args[i], i + 1, max - i));
            }
        }
        // In thông báo khi không có kết quả
        if (!isSuccess) {
            printlnAdv("Không có cặp số đối xứng nào.");
        }
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
