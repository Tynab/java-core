package yan_service;

/**
 * Tóm tắt: Khai báo độ rộng hiển thị và các mã màu ANSI dùng chung cho chương trình console.
 */
public class YANConstant {
    // Cấu hình chung
    public static final int WIDTH = 70;

    // Mã đặt lại màu
    public static final String RESET = "\033[0m"; // Đặt lại định dạng

    // Màu chữ thường
    public static final String BLACK = "\033[0;30m"; // Đen
    public static final String RED = "\033[0;31m"; // Đỏ
    public static final String GREEN = "\033[0;32m"; // Xanh lá
    public static final String YELLOW = "\033[0;33m"; // Vàng
    public static final String BLUE = "\033[0;34m"; // Xanh dương
    public static final String PURPLE = "\033[0;35m"; // Tím
    public static final String CYAN = "\033[0;36m"; // Xanh lơ
    public static final String WHITE = "\033[0;37m"; // Trắng

    // Màu chữ đậm
    public static final String BLACK_BOLD = "\033[1;30m"; // Đen
    public static final String RED_BOLD = "\033[1;31m"; // Đỏ
    public static final String GREEN_BOLD = "\033[1;32m"; // Xanh lá
    public static final String YELLOW_BOLD = "\033[1;33m"; // Vàng
    public static final String BLUE_BOLD = "\033[1;34m"; // Xanh dương
    public static final String PURPLE_BOLD = "\033[1;35m"; // Tím
    public static final String CYAN_BOLD = "\033[1;36m"; // Xanh lơ
    public static final String WHITE_BOLD = "\033[1;37m"; // Trắng

    // Màu chữ gạch chân
    public static final String BLACK_UNDERLINED = "\033[4;30m"; // Đen
    public static final String RED_UNDERLINED = "\033[4;31m"; // Đỏ
    public static final String GREEN_UNDERLINED = "\033[4;32m"; // Xanh lá
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // Vàng
    public static final String BLUE_UNDERLINED = "\033[4;34m"; // Xanh dương
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // Tím
    public static final String CYAN_UNDERLINED = "\033[4;36m"; // Xanh lơ
    public static final String WHITE_UNDERLINED = "\033[4;37m"; // Trắng

    // Màu nền
    public static final String BLACK_BACKGROUND = "\033[40m"; // Đen
    public static final String RED_BACKGROUND = "\033[41m"; // Đỏ
    public static final String GREEN_BACKGROUND = "\033[42m"; // Xanh lá
    public static final String YELLOW_BACKGROUND = "\033[43m"; // Vàng
    public static final String BLUE_BACKGROUND = "\033[44m"; // Xanh dương
    public static final String PURPLE_BACKGROUND = "\033[45m"; // Tím
    public static final String CYAN_BACKGROUND = "\033[46m"; // Xanh lơ
    public static final String WHITE_BACKGROUND = "\033[47m"; // Trắng

    // Màu chữ sáng
    public static final String BLACK_BRIGHT = "\033[0;90m"; // Đen
    public static final String RED_BRIGHT = "\033[0;91m"; // Đỏ
    public static final String GREEN_BRIGHT = "\033[0;92m"; // Xanh lá
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // Vàng
    public static final String BLUE_BRIGHT = "\033[0;94m"; // Xanh dương
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // Tím
    public static final String CYAN_BRIGHT = "\033[0;96m"; // Xanh lơ
    public static final String WHITE_BRIGHT = "\033[0;97m"; // Trắng

    // Màu chữ sáng và đậm
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // Đen
    public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // Đỏ
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // Xanh lá
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m"; // Vàng
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m"; // Xanh dương
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m"; // Tím
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m"; // Xanh lơ
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // Trắng

    // Màu nền sáng
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m"; // Đen
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m"; // Đỏ
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m"; // Xanh lá
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m"; // Vàng
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m"; // Xanh dương
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // Tím
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // Xanh lơ
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // Trắng
}
