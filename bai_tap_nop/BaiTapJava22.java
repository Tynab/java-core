package bai_tap_nop;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Tìm chuỗi con palindrome dài nhất trong chuỗi người dùng nhập vào.
 */
public class BaiTapJava22 {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Java 22");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final Scanner mScan = new Scanner(in);

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        printAdv(GREEN, "Nhập vào chuỗi: ", RESET);
        var str = mScan.nextLine();
        // In kết quả
        var res = handle(str);
        var sOut = res.length() > 0 ? format("Chuỗi palindrome dài nhất là: %s", res) : "Không tìm thấy chuỗi palindrome có độ dài lớn hơn 1.";
        printlnAdv(YELLOW, sOut);
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Xử lý nghiệp vụ chính
    private static String handle(String str) {
        var best = "";
        for (var center = 0; center < str.length(); center++) {
            best = longer(best, expandPalindrome(str, center, center));
            best = longer(best, expandPalindrome(str, center, center + 1));
        }
        return best.length() > 1 ? best : "";
    }

    // Mở rộng palindrome quanh tâm
    private static String expandPalindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

    // Chọn chuỗi dài hơn
    private static String longer(String current, String candidate) {
        return candidate.length() > current.length() ? candidate : current;
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
