package exercise_list;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

/**
 * Tóm tắt: Nhập hai chuỗi và so sánh chúng theo lựa chọn có hoặc không phân biệt chữ hoa chữ thường.
 */
public class ListExercise {
    public static void main(String[] args) {
        // Tiêu đề chương trình
        out.println(BLUE_BOLD);
        printlnAdv("List Exercise");
        // Chạy nội dung chính
        run();
    }

    // Hằng số và trạng thái dùng trong bài
    private static final int N_MAX = 2;
    private static final Scanner mScan = new Scanner(in);

    // Luồng xử lý chính
    private static void run() {
        // Nhập dữ liệu
        out.println();
        var list = new ArrayList<String>();
        for (var i = 0; i < N_MAX; i++) {
            printAdv(GREEN, format("Nhập chuỗi thứ %d: ", i + 1), RESET);
            list.add(mScan.nextLine());
        }
        // In lời nhắc hoặc menu
        printlnAdv(CYAN, "Phân biệt chữ hoa chữ thường?");
        printlnAdv("1. Có   ");
        printlnAdv("2. Không");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        // In kết quả
        printlnAdv(YELLOW, numLimit(1, 2) == 1 ? checkCase(list) : checkContent(list));
        out.println();
        // Hỏi người dùng có tiếp tục chạy lại không
        checkOut();
    }

    // So sánh nội dung không phân biệt hoa thường
    private static String checkContent(List<String> list) {
        // Chuẩn bị dữ liệu so sánh
        var max = list.size();
        var strFrm = toLowerCaseAdv(list.get(0)); // Lưu giá trị dùng lại trong vòng lặp
        var s = format("%d chuỗi giống nhau.", max);
        // Dừng khi phát hiện phần tử khác
        for (var i = 1; i < max; i++) {
            if (!toLowerCaseAdv(list.get(i)).equals(strFrm)) {
                s = format("%d chuỗi khác nhau.", max);
                break;
            }
        }
        return s;
    }

    // So sánh có phân biệt hoa thường
    private static String checkCase(List<String> list) {
        // Chuẩn bị dữ liệu so sánh
        var max = list.size();
        var strFrm = list.get(0); // Lưu giá trị dùng lại trong vòng lặp
        var s = format("%d chuỗi giống nhau.", max);
        // Dừng khi phát hiện phần tử khác
        for (var i = 1; i < max; i++) {
            if (!list.get(i).equals(strFrm)) {
                s = format("%d chuỗi khác nhau.", max);
                break;
            }
        }
        return s;
    }

    // Kiểm tra nhu cầu chạy lại
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
