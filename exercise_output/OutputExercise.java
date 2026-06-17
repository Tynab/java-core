package exercise_output;

import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: In mẫu chữ JAVA bằng ký tự để minh họa thao tác xuất dữ liệu ra console.
 */
public class OutputExercise {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Output Exercise");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        out.println();
        out.print(YELLOW);
        printlnAdv("    J    A   V     V   A   ");
        printlnAdv("    J   A A   V   V   A A  ");
        printlnAdv("J   J  AAAAA   V V   AAAAA ");
        printlnAdv(" JJJ  A     A   V   A     A");
        out.println(RESET);
    }
}