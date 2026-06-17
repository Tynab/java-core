package exercise_input;

import java.text.*;
import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static java.util.TimeZone.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập múi giờ GMT hợp lệ và in thời gian hiện tại theo múi giờ đó.
 */
public class InputExercise {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("Input Exercise");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final double MIN_TIMEZONE = -11;
    private static final double MAX_TIMEZONE = 12;

    // Luồng xử lý chính
    private static void run() {
        // In lời nhắc hoặc menu
        out.println();
        printAdv(GREEN, "Nhập vào múi giờ: ", RESET);
        // Định dạng dữ liệu
        var timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(getTimeZone(numToUTC(timezoneLimit(MIN_TIMEZONE, MAX_TIMEZONE))));
        // In kết quả
        printlnAdv(YELLOW, format("Hiện giờ là: %s", timeFormat.format(new Date())));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // Kiểm tra giới hạn múi giờ
    private static double timezoneLimit(double min, double max) {
        var n = scanDub();
        if (n < min || n > max) {
            // Chuẩn bị chuỗi giới hạn nhỏ nhất
            var iMin = valueOf((int) min);
            var sMin = valueOf(min);
            // Chuẩn bị chuỗi giới hạn lớn nhất
            var iMax = valueOf((int) max);
            var sMax = valueOf(max);
            // Ghép thông báo lỗi
            printAdv(RED,
                    format("Múi giờ từ GMT%s đến GMT%s, xin nhập lại: ",
                            min == (int) min ? min > 0 ? "+" + iMin : iMin : min > 0 ? "+" + sMin : sMin,
                            max == (int) max ? max > 0 ? "+" + iMax : iMax : max > 0 ? "+" + sMax : sMax),
                    RESET);
            n = timezoneLimit(min, max);
        }
        return n;
    }

    // Chuyển số múi giờ sang mã GMT
    private static String numToUTC(double n) {
        var absTimezone = Math.abs(n);
        var hour = (int) absTimezone;
        var minute = (int) Math.round((absTimezone - hour) * 60);
        if (minute == 60) {
            hour++;
            minute = 0;
        }
        return format("GMT%s%02d:%02d", n < 0 ? "-" : "+", hour, minute);
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
