package bai_tap_nop;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Tính số tháng hoặc năm cần gửi tiền để đạt mục tiêu tích lũy theo lãi suất nhập vào.
 */
public class BaiTapJava18 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 18");
        // Chạy nội dung chính
        run();
    }

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào số tiền hiện có: ", RESET);
        var money = numLimit(1, MAX_VALUE);
        printAdv(GREEN, "Nhập vào lãi suất (%): ", RESET);
        var rate = rateLimit(0, 100);
        printAdv(GREEN, "Số tiền muốn tích lũy là: ", RESET);
        var sum = sumLimit(money, MAX_VALUE);
        // In kết quả
        printlnAdv(YELLOW, format("Sau %s sẽ đạt được số tiền mong muốn.", handle(money, sum, rate)));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra giới hạn lãi suất
    public static double rateLimit(double min, double max) {
        var n = scanDub();
        if (n <= min || n > max) {
            printAdv(RED, "Lãi suất phải lớn hơn 0% và không quá 100%, xin nhập lại: ", RESET);
            n = rateLimit(min, max);
        }
        return n;
    }

    // Kiểm tra số tiền mục tiêu
    private static int sumLimit(int min, int max) {
        var n = scanInt();
        if (n <= min) {
            printAdv(RED, "Số tiền mong muốn phải lớn hơn số tiền hiện có, xin nhập lại: ", RESET);
            n = sumLimit(min, max);
        } else if (n > max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = sumLimit(min, max);
        }
        return n;
    }

    // Xử lý nghiệp vụ chính
    private static String handle(int money, int sum, double rate) {
        var month = 0;
        var incre = (double) money;
        while (incre < sum) {
            month++;
            incre += incre * rate / 100;
        }
        return month >= 12
                ? month % 12 == 0 ? format("%d năm", month / 12) : format("%d năm %d tháng", month / 12, month % 12)
                : format("%d tháng", month % 12);
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
