package bai_tap_nop;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Kiểm tra năm nhuận theo quy tắc Gregorian cho các năm từ 1900 trở đi.
 */
public class BaiTapJava16 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 16");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int YEAR_RESTART = 1900;

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào năm cần kiểm tra: ", RESET);
        var year = yearLimit(MAX_VALUE);
        // In kết quả
        out.print(YELLOW);
        if (isLeapYear(year)) {
            printlnAdv(format("Năm %d là năm nhuận.", year));
        } else {
            printlnAdv(format("Năm %d là năm không nhuận.", year));
        }
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    // Kiểm tra giới hạn năm
    private static int yearLimit(int max) {
        var n = scanInt();
        if (n < YEAR_RESTART) {
            printAdv(RED, format("Không xác định được lịch trước năm %d, xin nhập lại: ", YEAR_RESTART), RESET);
            n = yearLimit(max);
        } else if (n > max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = yearLimit(max);
        }
        return n;
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
