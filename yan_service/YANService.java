package yan_service;

import java.util.*;

import static java.lang.Character.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.lang.String.valueOf;
import static java.lang.System.*;
import static yan_service.YANConstant.*;

/**
 * Tóm tắt: Tập hợp hàm tiện ích dùng chung cho nhập liệu, in căn giữa, kiểm tra chuỗi và hỏi người dùng có tiếp tục hay không.
 */
public class YANService {
    // Hằng số và trạng thái dùng trong bài
    private static final Scanner mScan = new Scanner(in);

    // Chuyển ký tự số sang int
    public static int parseIntAdv(Character c) {
        return parseInt(valueOf(c));
    }

    // Kiểm tra dữ liệu có chuyển được sang int không
    public static boolean tryParseInt(Character c) {
        var isSuccess = true;
        try {
            parseInt(valueOf(c));
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Kiểm tra dữ liệu có chuyển được sang int không
    public static boolean tryParseInt(String s) {
        var isSuccess = true;
        try {
            parseInt(s);
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Nhập số nguyên an toàn
    public static int scanInt() {
        var n = 0;
        var s = mScan.nextLine();
        if (tryParseInt(s)) {
            n = parseInt(s);
        } else {
            printAdv(RED, "Dữ liệu bạn nhập không phải số nguyên, xin nhập lại: ", RESET);
            n = scanInt();
        }
        return n;
    }

    // Nhập số nguyên trong giới hạn
    public static int numLimit(int min, int max) {
        var n = scanInt();
        if (n < min || n > max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimit(min, max);
        }
        return n;
    }

    // Nhập số nguyên trong giới hạn
    public static int numLimitEx(int min, int max) {
        var n = scanInt();
        if (n <= min || n >= max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimitEx(min, max);
        }
        return n;
    }

    // Chuyển ký tự số sang double
    public static double parseDubAdv(Character c) {
        return parseDouble(valueOf(c));
    }

    // Kiểm tra dữ liệu có chuyển được sang double không
    public static boolean tryParseDub(Character c) {
        var isSuccess = true;
        try {
            parseDouble(valueOf(c));
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Kiểm tra dữ liệu có chuyển được sang double không
    public static boolean tryParseDub(String s) {
        var isSuccess = true;
        try {
            parseDouble(s);
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Nhập số thực an toàn
    public static double scanDub() {
        var n = 0d;
        var s = mScan.nextLine();
        if (tryParseDub(s)) {
            n = parseDouble(s);
        } else {
            printAdv(RED, "Dữ liệu bạn nhập không phải số, xin nhập lại: ", RESET);
            n = scanDub();
        }
        return n;
    }

    // Nhập số thực trong giới hạn
    public static double numLimit(double min, double max) {
        var n = scanDub();
        if (n < min || n > max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimit(min, max);
        }
        return n;
    }

    // Nhập số thực trong giới hạn
    public static double numLimitEx(double min, double max) {
        var n = scanDub();
        if (n <= min || n >= max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimitEx(min, max);
        }
        return n;
    }

    // In số thực gọn khi phần thập phân bằng 0
    public static String writePerfectDub(double n) {
        return n == (int) n ? String.valueOf((int) n) : String.valueOf(n);
    }

    // In căn giữa
    public static void printAdv(String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(s);
    }

    // In căn giữa có màu đầu dòng
    public static void printAdv(String color, String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(color + s);
    }

    // In căn giữa kèm màu bắt đầu và kết thúc
    public static void printAdv(String colorStart, String s, String colorEnd) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(colorStart + s + colorEnd);
    }

    // In dòng căn giữa
    public static void printlnAdv(String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(s);
    }

    // In dòng căn giữa có màu đầu dòng
    public static void printlnAdv(String color, String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(color + s);
    }

    // In dòng căn giữa kèm màu bắt đầu và kết thúc
    public static void printlnAdv(String colorStart, String s, String colorEnd) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(colorStart + s + colorEnd);
    }

    // Kiểm tra chuỗi toàn khoảng trắng
    public static boolean isSpace(String s) {
        var isSuccess = true;
        for (var i = 0; i < s.length(); i++) {
            if (!isWhitespace(s.charAt(i))) {
                isSuccess = false;
                break;
            }
        }
        return isSuccess;
    }

    // Kiểm tra chuỗi null hoặc rỗng
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    // Kiểm tra chuỗi null, rỗng hoặc chỉ có khoảng trắng
    public static boolean isNullOrWhitespace(String s) {
        return isNullOrEmpty(s) || isSpace(s);
    }

    // Chuyển chuỗi sang dạng viết hoa chữ cái đầu
    public static String toTitleCase(String s) {
        var list = new ArrayList<Character>();
        var str = "";
        if (!isNullOrWhitespace(s)) {
            var cst = s.charAt(0);
            cst = isWhitespace(cst) ? cst : toUpperCase(cst);
            list.add(cst);
            for (var i = 0; i < s.length() - 1; i++) {
                var c = s.charAt(i + 1);
                if (isWhitespace(s.charAt(i)) && !isWhitespace(c)) {
                    list.add(toUpperCase(c));
                } else {
                    list.add(c);
                }
            }
            for (var item : list) {
                str += item;
            }
        }
        return str;
    }

    // Chuyển chuỗi sang chữ thường khi có nội dung
    public static String toLowerCaseAdv(String s) {
        return isNullOrWhitespace(s) ? s : s.toLowerCase();
    }

    // Chuyển chuỗi sang chữ hoa khi có nội dung
    public static String toUpperCaseAdv(String s) {
        return isNullOrWhitespace(s) ? s : s.toUpperCase();
    }

    // Chuẩn hóa chuỗi rồi viết hoa chữ cái đầu
    public static String toTitleCaseAdv(String s) {
        return isNullOrWhitespace(s) ? s : toTitleCase(s.toLowerCase());
    }

    // Hỏi người dùng có muốn tiếp tục
    public static int credit() {
        printlnAdv(PURPLE, "Bạn có muốn tiếp tục?");
        printlnAdv("1. Có   ");
        printlnAdv("2. Không");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        return numLimit(1, 2);
    }
}
